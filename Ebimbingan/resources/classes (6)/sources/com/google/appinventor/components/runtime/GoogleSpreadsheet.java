package com.google.appinventor.components.runtime;

import android.app.Activity;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.util.AsynchUtil;
import com.google.appinventor.components.runtime.util.YailList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@DesignerComponent(category = ComponentCategory.DEPRECATED, description = "", iconName = "images/spreadsheet.png", nonVisible = true, version = 1)
@UsesPermissions({"android.permission.INTERNET"})
public class GoogleSpreadsheet extends AndroidNonvisibleComponent implements Component {
    private final int EFLFxJJ7hYZabk7bFItjKUUJ7DOOvUWrCh3qTHGqJQXtWFnrbkhe9SsRqCU9oxdB = 200;
    private final String LOG_TAG = "GoogleSpreadsheet";
    private String Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = "";
    private String TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt;
    protected Activity activity;
    private final String eaS298peKlTpqlGRGLMTdk3sY259qoFGMqAzTE98DZy2JVNgCwB414XzHrUPTC = "?dev=true";
    private Map<String, Integer> hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO;
    private String[][] hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
    private final int kiRcALaZrUgDipBGGRCywmcwXV6owEI5LzNEBeYdXQPOcCNVgoIiuO1Q0ZEin4tA = 5000;

    static /* synthetic */ void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(GoogleSpreadsheet googleSpreadsheet) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        URL url;
        BufferedReader bufferedReader;
        Reader reader;
        StringBuilder sb3;
        JSONObject jSONObject;
        GoogleSpreadsheet googleSpreadsheet2 = googleSpreadsheet;
        GoogleSpreadsheet googleSpreadsheet3 = googleSpreadsheet2;
        googleSpreadsheet3.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = googleSpreadsheet3.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL.trim();
        if (googleSpreadsheet2.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL.toLowerCase().endsWith("?dev=true")) {
            str = googleSpreadsheet2.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL;
        } else {
            new StringBuilder();
            StringBuilder sb4 = sb;
            GoogleSpreadsheet googleSpreadsheet4 = googleSpreadsheet2;
            GoogleSpreadsheet googleSpreadsheet5 = googleSpreadsheet4;
            String sb5 = sb4.append(googleSpreadsheet4.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL).append("?dev=true").toString();
            str = sb5;
            googleSpreadsheet5.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = sb5;
        }
        String str2 = str;
        new StringBuilder();
        StringBuilder sb6 = sb2;
        try {
            new URL(str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            HttpURLConnection httpURLConnection2 = httpURLConnection;
            httpURLConnection.setRequestMethod("GET");
            new InputStreamReader(httpURLConnection2.getInputStream());
            new BufferedReader(reader);
            BufferedReader bufferedReader2 = bufferedReader;
            while (true) {
                String readLine = bufferedReader2.readLine();
                String str3 = readLine;
                if (readLine == null) {
                    break;
                }
                StringBuilder append = sb6.append(str3);
            }
            bufferedReader2.close();
            if (httpURLConnection2.getResponseCode() == 200) {
                new JSONObject(sb6.toString());
                JSONArray jSONArray = (JSONArray) jSONObject.get(googleSpreadsheet2.TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String[] split = jSONArray.get(i).toString().replace("{", "").replace("}", "").replace("\"", "").split(",");
                    if (i == 0) {
                        int[] iArr = new int[2];
                        iArr[0] = jSONArray.length();
                        int[] iArr2 = iArr;
                        iArr2[1] = split.length;
                        googleSpreadsheet2.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = (String[][]) Array.newInstance(String.class, iArr2);
                    }
                    for (int i2 = 0; i2 < split.length; i2++) {
                        String[] split2 = split[i2].split(":");
                        googleSpreadsheet2.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME[i][i2] = split2[1].trim();
                        if (i == 0) {
                            Integer put = googleSpreadsheet2.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO.put(split2[0].trim().toLowerCase(), Integer.valueOf(i2));
                        }
                    }
                }
                googleSpreadsheet2.AfterAction(true, sb6.toString(), "GetData");
                return;
            }
            new StringBuilder(httpURLConnection2.getResponseMessage());
            googleSpreadsheet2.AfterAction(false, sb3.toString(), "GetData");
        } catch (Exception e) {
            googleSpreadsheet2.AfterAction(false, e.getLocalizedMessage(), "GetData");
        }
    }

    static /* synthetic */ void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(GoogleSpreadsheet googleSpreadsheet, String str) {
        StringBuilder sb;
        String str2;
        URL url;
        StringBuilder sb2;
        String str3 = str;
        GoogleSpreadsheet googleSpreadsheet2 = googleSpreadsheet;
        GoogleSpreadsheet googleSpreadsheet3 = googleSpreadsheet2;
        GoogleSpreadsheet googleSpreadsheet4 = googleSpreadsheet2;
        GoogleSpreadsheet googleSpreadsheet5 = googleSpreadsheet4;
        googleSpreadsheet3.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = googleSpreadsheet4.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL.trim();
        if (googleSpreadsheet5.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL.toLowerCase().endsWith("?dev=true")) {
            str2 = googleSpreadsheet5.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL;
        } else {
            new StringBuilder();
            StringBuilder sb3 = sb;
            GoogleSpreadsheet googleSpreadsheet6 = googleSpreadsheet5;
            GoogleSpreadsheet googleSpreadsheet7 = googleSpreadsheet6;
            String sb4 = sb3.append(googleSpreadsheet6.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL).append("?dev=true").toString();
            str2 = sb4;
            googleSpreadsheet7.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = sb4;
        }
        String str4 = str2;
        try {
            new StringBuilder();
            new URL(sb2.append(str4).append("/").append(googleSpreadsheet5.TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            HttpURLConnection httpURLConnection2 = httpURLConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection2.setRequestMethod("POST");
            httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(str3.length()));
            httpURLConnection2.getOutputStream().write(str3.getBytes());
            googleSpreadsheet5.AfterAction(true, httpURLConnection2.getResponseMessage(), "StoreData");
        } catch (Exception e) {
            googleSpreadsheet5.AfterAction(false, e.getMessage(), "StoreData");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleSpreadsheet(com.google.appinventor.components.runtime.ComponentContainer r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r0
            r3 = r1
            com.google.appinventor.components.runtime.Form r3 = r3.$form()
            r2.<init>(r3)
            r2 = r0
            java.lang.String r3 = "GoogleSpreadsheet"
            r2.LOG_TAG = r3
            r2 = r0
            java.lang.String r3 = "?dev=true"
            r2.eaS298peKlTpqlGRGLMTdk3sY259qoFGMqAzTE98DZy2JVNgCwB414XzHrUPTC = r3
            r2 = r0
            r3 = 5000(0x1388, float:7.006E-42)
            r2.kiRcALaZrUgDipBGGRCywmcwXV6owEI5LzNEBeYdXQPOcCNVgoIiuO1Q0ZEin4tA = r3
            r2 = r0
            r3 = 200(0xc8, float:2.8E-43)
            r2.EFLFxJJ7hYZabk7bFItjKUUJ7DOOvUWrCh3qTHGqJQXtWFnrbkhe9SsRqCU9oxdB = r3
            r2 = r0
            java.lang.String r3 = ""
            r2.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = r3
            r2 = r0
            java.util.HashMap r3 = new java.util.HashMap
            r8 = r3
            r3 = r8
            r4 = r8
            r4.<init>()
            r2.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = r3
            r2 = r0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 2
            int[] r4 = new int[r4]
            r4 = {5000, 200} // fill-array
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.String[][] r3 = (java.lang.String[][]) r3
            r2.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = r3
            r2 = r0
            java.lang.String r3 = "Your Sheet Name"
            r2.TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt = r3
            r2 = r0
            r3 = r1
            android.app.Activity r3 = r3.$context()
            r2.activity = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.GoogleSpreadsheet.<init>(com.google.appinventor.components.runtime.ComponentContainer):void");
    }

    @DesignerProperty(defaultValue = "Enter the Cloudstitch API Endpoint", editorType = "string")
    @SimpleProperty(description = "The Cloudstitch API endpoint.")
    public void ApiEndpoint(String str) {
        String str2 = str;
        this.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL = str2;
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "Retrieves the Cloudstich API endpoint.")
    public String ApiEndpoint() {
        return this.Qws8UL0KACxj4AFwEq11K2awfkG72XuPUTZHhPLrlGlIXoxeK9stYQCrIWmabWcL;
    }

    @DesignerProperty(defaultValue = "Enter Spreadsheet name", editorType = "string")
    @SimpleProperty(description = "The Google spreadsheet name")
    public void SheetName(String str) {
        String str2 = str;
        this.TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt = str2;
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "Retrieves the Spreadsheet name")
    public String SheetName() {
        return this.TQYS6YBjqkoWFaGULpL2H003Eu6rkiOxhECYAYl6g8NMleEVKHe9nH3AkWIoC5xt;
    }

    @SimpleFunction(description = "For the given ApiEndpoint and Spreadsheet, retrieves all data from the spreadsheet.")
    public void GetSpreadsheetData() {
        Runnable runnable;
        new Runnable(this) {
            private /* synthetic */ GoogleSpreadsheet hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

            {
                this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = r5;
            }

            public final void run() {
                GoogleSpreadsheet.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
            }
        };
        AsynchUtil.runAsynchronously(runnable);
    }

    @SimpleFunction(description = "Retrieves all data for an entire column")
    public YailList GetColumnData(String str) {
        String str2 = str;
        if (!this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO.containsKey(str2.toLowerCase())) {
            return YailList.makeEmptyList();
        }
        Integer num = this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO.get(str2.toLowerCase());
        String[] strArr = new String[this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.length];
        for (int i = 0; i < this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.length; i++) {
            strArr[i] = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME[i][num.intValue()];
        }
        return YailList.makeList((Object[]) strArr);
    }

    @SimpleFunction(description = "Retrieves data for a specific row number")
    public YailList GetRowData(int i) {
        return YailList.makeList((Object[]) this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME[i - 1]);
    }

    @SimpleFunction(description = "For the given columnName and rowNumber, retrieves the spreadsheet cell data")
    public String GetCellData(String str, int i) {
        return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME[i - 1][this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO.get(str.toLowerCase()).intValue()];
    }

    @SimpleFunction(description = "Stores data into spreadsheet. dataToStore must be in json format. Will trigger AfterAction")
    public void StoreData(String str) {
        Runnable runnable;
        final String str2 = str;
        new Runnable(this) {
            private /* synthetic */ GoogleSpreadsheet hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

            {
                this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = r6;
            }

            public final void run() {
                GoogleSpreadsheet.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, str2);
            }
        };
        AsynchUtil.runAsynchronously(runnable);
    }

    @SimpleEvent(description = "Triggered after an actions such as storing data has occurred. ")
    public void AfterAction(boolean z, String str, String str2) {
        Runnable runnable;
        final boolean z2 = z;
        final String str3 = str;
        final String str4 = str2;
        new Runnable(this) {
            private /* synthetic */ GoogleSpreadsheet hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

            {
                this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = r8;
            }

            public final void run() {
                GoogleSpreadsheet googleSpreadsheet = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(z2);
                Object[] objArr2 = objArr;
                objArr2[1] = str3;
                Object[] objArr3 = objArr2;
                objArr3[2] = str4;
                boolean dispatchEvent = EventDispatcher.dispatchEvent(googleSpreadsheet, "AfterAction", objArr3);
            }
        };
        this.activity.runOnUiThread(runnable);
    }
}
