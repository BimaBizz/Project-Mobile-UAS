package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackAmazonPurchase {
    private boolean canTrack = false;
    private Context context;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    private OSPurchasingListener osPurchasingListener;

    TrackAmazonPurchase(Context context2) {
        OSPurchasingListener oSPurchasingListener;
        this.context = context2;
        try {
            Class<?> listenerHandlerClass = Class.forName("com.amazon.device.iap.internal.d");
            this.listenerHandlerObject = listenerHandlerClass.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            this.listenerHandlerField = listenerHandlerClass.getDeclaredField("f");
            this.listenerHandlerField.setAccessible(true);
            new OSPurchasingListener(this, (AnonymousClass1) null);
            this.osPurchasingListener = oSPurchasingListener;
            this.osPurchasingListener.orgPurchasingListener = (PurchasingListener) this.listenerHandlerField.get(this.listenerHandlerObject);
            this.canTrack = true;
            setListener();
        } catch (ClassNotFoundException e) {
            logAmazonIAPListenerError(e);
        } catch (IllegalAccessException e2) {
            logAmazonIAPListenerError(e2);
        } catch (InvocationTargetException e3) {
            logAmazonIAPListenerError(e3);
        } catch (NoSuchMethodException e4) {
            logAmazonIAPListenerError(e4);
        } catch (NoSuchFieldException e5) {
            logAmazonIAPListenerError(e5);
        }
    }

    private static void logAmazonIAPListenerError(Exception exc) {
        Exception e = exc;
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", e);
        e.printStackTrace();
    }

    private void setListener() {
        PurchasingService.registerListener(this.context, this.osPurchasingListener);
    }

    /* access modifiers changed from: package-private */
    public void checkListener() {
        if (this.canTrack) {
            try {
                PurchasingListener curPurchasingListener = (PurchasingListener) this.listenerHandlerField.get(this.listenerHandlerObject);
                if (curPurchasingListener != this.osPurchasingListener) {
                    this.osPurchasingListener.orgPurchasingListener = curPurchasingListener;
                    setListener();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private class OSPurchasingListener implements PurchasingListener {
        private String currentMarket;
        private RequestId lastRequestId;
        PurchasingListener orgPurchasingListener;
        final /* synthetic */ TrackAmazonPurchase this$0;

        private OSPurchasingListener(TrackAmazonPurchase trackAmazonPurchase) {
            this.this$0 = trackAmazonPurchase;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ OSPurchasingListener(TrackAmazonPurchase x0, AnonymousClass1 r7) {
            this(x0);
            AnonymousClass1 r2 = r7;
        }

        private String marketToCurrencyCode(String market) {
            String str = market;
            boolean z = true;
            switch (str.hashCode()) {
                case 2100:
                    if (str.equals("AU")) {
                        z = true;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        z = true;
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        z = true;
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        z = true;
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        z = true;
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        z = true;
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        z = true;
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        z = true;
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        z = true;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        z = false;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    return "USD";
                case true:
                    return "GBP";
                case true:
                case true:
                case true:
                case true:
                    return "EUR";
                case true:
                    return "JPY";
                case true:
                    return "CDN";
                case true:
                    return "BRL";
                case true:
                    return "AUD";
                default:
                    return "";
            }
        }

        public void onProductDataResponse(ProductDataResponse productDataResponse) {
            JSONArray jSONArray;
            JSONObject jSONObject;
            ProductDataResponse response = productDataResponse;
            if (this.lastRequestId != null && this.lastRequestId.toString().equals(response.getRequestId().toString())) {
                try {
                    switch (AnonymousClass1.$SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[response.getRequestStatus().ordinal()]) {
                        case 1:
                            new JSONArray();
                            JSONArray purchasesToReport = jSONArray;
                            Map<String, Product> products = response.getProductData();
                            for (String key : products.keySet()) {
                                Product product = products.get(key);
                                new JSONObject();
                                JSONObject jsonItem = jSONObject;
                                JSONObject put = jsonItem.put("sku", product.getSku());
                                JSONObject put2 = jsonItem.put("iso", marketToCurrencyCode(this.currentMarket));
                                String price = product.getPrice();
                                if (!price.matches("^[0-9]")) {
                                    price = price.substring(1);
                                }
                                JSONObject put3 = jsonItem.put("amount", price);
                                JSONArray put4 = purchasesToReport.put(jsonItem);
                            }
                            OneSignal.sendPurchases(purchasesToReport, false, (OneSignalRestClient.ResponseHandler) null);
                            return;
                        default:
                            return;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (this.orgPurchasingListener != null) {
                this.orgPurchasingListener.onProductDataResponse(response);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            Set<String> set;
            PurchaseResponse response = purchaseResponse;
            if (response.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = response.getUserData().getMarketplace();
                new HashSet<>();
                Set<String> productSkus = set;
                boolean add = productSkus.add(response.getReceipt().getSku());
                this.lastRequestId = PurchasingService.getProductData(productSkus);
            }
            if (this.orgPurchasingListener != null) {
                this.orgPurchasingListener.onPurchaseResponse(response);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            PurchaseUpdatesResponse response = purchaseUpdatesResponse;
            if (this.orgPurchasingListener != null) {
                this.orgPurchasingListener.onPurchaseUpdatesResponse(response);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            UserDataResponse response = userDataResponse;
            if (this.orgPurchasingListener != null) {
                this.orgPurchasingListener.onUserDataResponse(response);
            }
        }
    }

    /* renamed from: com.onesignal.TrackAmazonPurchase$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus = new int[ProductDataResponse.RequestStatus.values().length];

        static {
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
        }
    }
}
