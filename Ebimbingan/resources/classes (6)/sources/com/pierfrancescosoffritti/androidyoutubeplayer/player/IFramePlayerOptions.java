package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

public class IFramePlayerOptions {
    private final JSONObject a;

    public static class Builder {
        private final JSONObject a;

        public Builder() {
            JSONObject jSONObject;
            new JSONObject();
            this.a = jSONObject;
            a("autoplay", 0);
            a("controls", 0);
            a("enablejsapi", 1);
            a("fs", 0);
            a("origin", "https://www.youtube.com");
            a("rel", 0);
            a("showinfo", 0);
            a("iv_load_policy", 3);
            a("modestbranding", 1);
        }

        private void a(@NonNull String str, int i) {
            Throwable th;
            StringBuilder sb;
            String str2 = str;
            int i2 = i;
            try {
                JSONObject put = this.a.put(str2, i2);
            } catch (JSONException e) {
                JSONException jSONException = e;
                Throwable th2 = th;
                new StringBuilder();
                new RuntimeException(sb.append("Illegal JSON value ").append(str2).append(": ").append(i2).toString());
                throw th2;
            }
        }

        private void a(@NonNull String str, @NonNull String str2) {
            Throwable th;
            StringBuilder sb;
            String str3 = str;
            String str4 = str2;
            try {
                JSONObject put = this.a.put(str3, str4);
            } catch (JSONException e) {
                JSONException jSONException = e;
                Throwable th2 = th;
                new StringBuilder();
                new RuntimeException(sb.append("Illegal JSON value ").append(str3).append(": ").append(str4).toString());
                throw th2;
            }
        }

        public Builder autoplay(int i) {
            a("autoplay", i);
            return this;
        }

        public IFramePlayerOptions build() {
            IFramePlayerOptions iFramePlayerOptions;
            new IFramePlayerOptions(this.a, (AnonymousClass1) null);
            return iFramePlayerOptions;
        }

        public Builder controls(int i) {
            a("controls", i);
            return this;
        }

        public Builder ivLoadPolicy(int i) {
            a("iv_load_policy", i);
            return this;
        }

        public Builder modestBranding(int i) {
            a("modestbranding", i);
            return this;
        }

        public Builder origin(@NonNull String str) {
            a("origin", str);
            return this;
        }

        public Builder rel(int i) {
            a("rel", i);
            return this;
        }

        public Builder showInfo(int i) {
            a("showinfo", i);
            return this;
        }
    }

    private IFramePlayerOptions(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ IFramePlayerOptions(JSONObject jSONObject, AnonymousClass1 r7) {
        this(jSONObject);
        AnonymousClass1 r2 = r7;
    }

    public static IFramePlayerOptions getDefault() {
        Builder builder;
        new Builder();
        return builder.build();
    }

    public String toString() {
        return this.a.toString();
    }
}
