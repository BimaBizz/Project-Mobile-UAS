package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackGooglePurchase {
    /* access modifiers changed from: private */
    public static Class<?> IInAppBillingServiceClass;
    private static int iapEnabled = -99;
    /* access modifiers changed from: private */
    public Context appContext;
    /* access modifiers changed from: private */
    public Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest = false;
    /* access modifiers changed from: private */
    public Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting = true;
    /* access modifiers changed from: private */
    public ArrayList<String> purchaseTokens;

    static /* synthetic */ int access$002(int x0) {
        int x02 = x0;
        iapEnabled = x02;
        return x02;
    }

    static /* synthetic */ Object access$102(TrackGooglePurchase x0, Object x1) {
        Object obj = x1;
        Object obj2 = obj;
        x0.mIInAppBillingService = obj2;
        return obj;
    }

    static /* synthetic */ boolean access$1102(TrackGooglePurchase x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.newAsExisting = z2;
        return z;
    }

    static /* synthetic */ boolean access$402(TrackGooglePurchase x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.isWaitingForPurchasesRequest = z2;
        return z;
    }

    static /* synthetic */ Method access$502(TrackGooglePurchase x0, Method x1) {
        Method method = x1;
        Method method2 = method;
        x0.getPurchasesMethod = method2;
        return method;
    }

    TrackGooglePurchase(Context activity) {
        ArrayList<String> arrayList;
        JSONArray jSONArray;
        this.appContext = activity;
        new ArrayList<>();
        this.purchaseTokens = arrayList;
        try {
            new JSONArray(OneSignalPrefs.getString(OneSignalPrefs.PREFS_PLAYER_PURCHASES, "purchaseTokens", "[]"));
            JSONArray jsonPurchaseTokens = jSONArray;
            for (int i = 0; i < jsonPurchaseTokens.length(); i++) {
                boolean add = this.purchaseTokens.add(jsonPurchaseTokens.get(i).toString());
            }
            this.newAsExisting = jsonPurchaseTokens.length() == 0;
            if (this.newAsExisting) {
                this.newAsExisting = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_PLAYER_PURCHASES, "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        trackIAP();
    }

    static boolean CanTrack(Context context) {
        Context context2 = context;
        if (iapEnabled == -99) {
            iapEnabled = context2.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (iapEnabled == 0) {
                IInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return iapEnabled == 0;
        } catch (Throwable th) {
            Throwable th2 = th;
            iapEnabled = 0;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void trackIAP() {
        ServiceConnection serviceConnection;
        Intent intent;
        if (this.mServiceConn == null) {
            new ServiceConnection(this) {
                final /* synthetic */ TrackGooglePurchase this$0;

                {
                    this.this$0 = this$0;
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    ComponentName componentName2 = componentName;
                    int access$002 = TrackGooglePurchase.access$002(-99);
                    Object access$102 = TrackGooglePurchase.access$102(this.this$0, (Object) null);
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    ComponentName componentName2 = componentName;
                    IBinder service = iBinder;
                    try {
                        Method asInterfaceMethod = TrackGooglePurchase.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                        asInterfaceMethod.setAccessible(true);
                        Object access$102 = TrackGooglePurchase.access$102(this.this$0, asInterfaceMethod.invoke((Object) null, new Object[]{service}));
                        this.this$0.QueryBoughtItems();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            this.mServiceConn = serviceConnection;
            new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Intent serviceIntent = intent;
            Intent intent2 = serviceIntent.setPackage("com.android.vending");
            boolean bindService = this.appContext.bindService(serviceIntent, this.mServiceConn, 1);
        } else if (this.mIInAppBillingService != null) {
            QueryBoughtItems();
        }
    }

    /* access modifiers changed from: private */
    public void QueryBoughtItems() {
        Thread thread;
        Runnable runnable;
        if (!this.isWaitingForPurchasesRequest) {
            new Runnable(this) {
                final /* synthetic */ TrackGooglePurchase this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    JSONObject itemPurchased;
                    boolean access$402 = TrackGooglePurchase.access$402(this.this$0, true);
                    try {
                        if (this.this$0.getPurchasesMethod == null) {
                            Method access$502 = TrackGooglePurchase.access$502(this.this$0, TrackGooglePurchase.getGetPurchasesMethod(TrackGooglePurchase.IInAppBillingServiceClass));
                            this.this$0.getPurchasesMethod.setAccessible(true);
                        }
                        Method access$500 = this.this$0.getPurchasesMethod;
                        Object access$100 = this.this$0.mIInAppBillingService;
                        Object[] objArr = new Object[4];
                        objArr[0] = 3;
                        Object[] objArr2 = objArr;
                        objArr2[1] = this.this$0.appContext.getPackageName();
                        Object[] objArr3 = objArr2;
                        objArr3[2] = "inapp";
                        Object[] objArr4 = objArr3;
                        objArr4[3] = null;
                        Bundle ownedItems = (Bundle) access$500.invoke(access$100, objArr4);
                        if (ownedItems.getInt("RESPONSE_CODE") == 0) {
                            new ArrayList();
                            ArrayList arrayList3 = arrayList;
                            new ArrayList();
                            ArrayList arrayList4 = arrayList2;
                            ArrayList<String> ownedSkus = ownedItems.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> purchaseDataList = ownedItems.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            for (int i = 0; i < purchaseDataList.size(); i++) {
                                String purchaseData = purchaseDataList.get(i);
                                String sku = ownedSkus.get(i);
                                new JSONObject(purchaseData);
                                String purchaseToken = itemPurchased.getString("purchaseToken");
                                if (!this.this$0.purchaseTokens.contains(purchaseToken) && !arrayList4.contains(purchaseToken)) {
                                    boolean add = arrayList4.add(purchaseToken);
                                    boolean add2 = arrayList3.add(sku);
                                }
                            }
                            if (arrayList3.size() > 0) {
                                this.this$0.sendPurchases(arrayList3, arrayList4);
                            } else if (purchaseDataList.size() == 0) {
                                boolean access$1102 = TrackGooglePurchase.access$1102(this.this$0, false);
                                OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_PLAYER_PURCHASES, "ExistingPurchases", false);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    boolean access$4022 = TrackGooglePurchase.access$402(this.this$0, false);
                }
            };
            new Thread(runnable);
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    public void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Bundle bundle;
        Map map;
        JSONArray jSONArray;
        OneSignalRestClient.ResponseHandler restResponseHandler;
        JSONObject jSONObject;
        BigDecimal price;
        BigDecimal bigDecimal;
        JSONObject jSONObject2;
        ArrayList<String> skusToAdd = arrayList;
        ArrayList<String> newPurchaseTokens = arrayList2;
        try {
            if (this.getSkuDetailsMethod == null) {
                this.getSkuDetailsMethod = getGetSkuDetailsMethod(IInAppBillingServiceClass);
                this.getSkuDetailsMethod.setAccessible(true);
            }
            new Bundle();
            Bundle querySkus = bundle;
            querySkus.putStringArrayList("ITEM_ID_LIST", skusToAdd);
            Method method = this.getSkuDetailsMethod;
            Object obj = this.mIInAppBillingService;
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            Object[] objArr2 = objArr;
            objArr2[1] = this.appContext.getPackageName();
            Object[] objArr3 = objArr2;
            objArr3[2] = "inapp";
            Object[] objArr4 = objArr3;
            objArr4[3] = querySkus;
            Bundle skuDetails = (Bundle) method.invoke(obj, objArr4);
            if (skuDetails.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> responseList = skuDetails.getStringArrayList("DETAILS_LIST");
                new HashMap();
                Map map2 = map;
                Iterator<String> it = responseList.iterator();
                while (it.hasNext()) {
                    new JSONObject(it.next());
                    JSONObject object = jSONObject;
                    String sku = object.getString("productId");
                    new BigDecimal(object.getString("price_amount_micros"));
                    new BigDecimal(1000000);
                    BigDecimal price2 = price.divide(bigDecimal);
                    new JSONObject();
                    JSONObject jsonItem = jSONObject2;
                    JSONObject put = jsonItem.put("sku", sku);
                    JSONObject put2 = jsonItem.put("iso", object.getString("price_currency_code"));
                    JSONObject put3 = jsonItem.put("amount", price2.toString());
                    Object put4 = map2.put(sku, jsonItem);
                }
                new JSONArray();
                JSONArray purchasesToReport = jSONArray;
                Iterator<String> it2 = skusToAdd.iterator();
                while (it2.hasNext()) {
                    String sku2 = it2.next();
                    if (map2.containsKey(sku2)) {
                        JSONArray put5 = purchasesToReport.put(map2.get(sku2));
                    }
                }
                if (purchasesToReport.length() > 0) {
                    final ArrayList<String> arrayList3 = newPurchaseTokens;
                    new OneSignalRestClient.ResponseHandler(this) {
                        final /* synthetic */ TrackGooglePurchase this$0;

                        {
                            this.this$0 = this$0;
                        }

                        public void onFailure(int i, JSONObject jSONObject, Throwable throwable) {
                            int i2 = i;
                            JSONObject jSONObject2 = jSONObject;
                            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "HTTP sendPurchases failed to send.", throwable);
                            boolean access$402 = TrackGooglePurchase.access$402(this.this$0, false);
                        }

                        public void onSuccess(String str) {
                            String str2 = str;
                            boolean addAll = this.this$0.purchaseTokens.addAll(arrayList3);
                            OneSignalPrefs.saveString(OneSignalPrefs.PREFS_PLAYER_PURCHASES, "purchaseTokens", this.this$0.purchaseTokens.toString());
                            OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_PLAYER_PURCHASES, "ExistingPurchases", true);
                            boolean access$1102 = TrackGooglePurchase.access$1102(this.this$0, false);
                            boolean access$402 = TrackGooglePurchase.access$402(this.this$0, false);
                        }
                    };
                    OneSignal.sendPurchases(purchasesToReport, this.newAsExisting, restResponseHandler);
                }
            }
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* access modifiers changed from: private */
    public static Method getAsInterfaceMethod(Class clazz) {
        Method[] methods = clazz.getMethods();
        int length = methods.length;
        for (int i = 0; i < length; i++) {
            Method method = methods[i];
            Class<?>[] args = method.getParameterTypes();
            if (args.length == 1 && args[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Method getGetPurchasesMethod(Class clazz) {
        Method[] methods = clazz.getMethods();
        int length = methods.length;
        for (int i = 0; i < length; i++) {
            Method method = methods[i];
            Class<?>[] args = method.getParameterTypes();
            if (args.length == 4 && args[0] == Integer.TYPE && args[1] == String.class && args[2] == String.class && args[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    private static Method getGetSkuDetailsMethod(Class clazz) {
        Method[] methods = clazz.getMethods();
        int length = methods.length;
        for (int i = 0; i < length; i++) {
            Method method = methods[i];
            Class<?>[] args = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (args.length == 4 && args[0] == Integer.TYPE && args[1] == String.class && args[2] == String.class && args[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }
}
