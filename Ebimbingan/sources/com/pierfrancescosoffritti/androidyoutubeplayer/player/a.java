package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.appinventor.components.runtime.util.NanoHTTPD;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerBridge;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerInitListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class a extends WebView implements YouTubePlayer, YouTubePlayerBridge.YouTubePlayerBridgeCallbacks {
    protected boolean a;
    private YouTubePlayerInitListener b;
    @NonNull
    private final Set<YouTubePlayerListener> c;
    @NonNull
    private final Handler d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected a(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Handler handler;
        Set<YouTubePlayerListener> set;
        this.a = false;
        new Handler(Looper.getMainLooper());
        this.d = handler;
        new HashSet();
        this.c = set;
    }

    private String a() {
        Throwable th;
        Reader reader;
        BufferedReader bufferedReader;
        StringBuilder sb;
        try {
            InputStream openRawResource = getResources().openRawResource(R.raw.youtube_player);
            new InputStreamReader(openRawResource, "utf-8");
            new BufferedReader(reader);
            BufferedReader bufferedReader2 = bufferedReader;
            new StringBuilder();
            StringBuilder sb2 = sb;
            while (true) {
                String readLine = bufferedReader2.readLine();
                String str = readLine;
                if (readLine != null) {
                    StringBuilder append = sb2.append(str).append("\n");
                } else {
                    openRawResource.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e) {
            Exception exc = e;
            Throwable th2 = th;
            new RuntimeException("Can't parse HTML file containing the player.");
            throw th2;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(IFramePlayerOptions iFramePlayerOptions) {
        Object obj;
        WebChromeClient webChromeClient;
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setMediaPlaybackRequiresUserGesture(false);
        new YouTubePlayerBridge(this);
        addJavascriptInterface(obj, "YouTubePlayerBridge");
        loadDataWithBaseURL("https://www.youtube.com", a().replace("<<injectedPlayerVars>>", iFramePlayerOptions.toString()), NanoHTTPD.MIME_HTML, "utf-8", (String) null);
        new WebChromeClient(this) {
            final /* synthetic */ a a;

            {
                this.a = r5;
            }

            public Bitmap getDefaultVideoPoster() {
                Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
            }
        };
        setWebChromeClient(webChromeClient);
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull YouTubePlayerInitListener youTubePlayerInitListener, @Nullable IFramePlayerOptions iFramePlayerOptions) {
        IFramePlayerOptions iFramePlayerOptions2 = iFramePlayerOptions;
        this.b = youTubePlayerInitListener;
        a(iFramePlayerOptions2 == null ? IFramePlayerOptions.getDefault() : iFramePlayerOptions2);
    }

    public boolean addListener(@NonNull YouTubePlayerListener youTubePlayerListener) {
        YouTubePlayerListener youTubePlayerListener2 = youTubePlayerListener;
        if (youTubePlayerListener2 != null) {
            return this.c.add(youTubePlayerListener2);
        }
        int e = Log.e("YouTubePlayer", "null YouTubePlayerListener not allowed.");
        return false;
    }

    public void cueVideo(@NonNull String str, float f) {
        Runnable runnable;
        final String str2 = str;
        final float f2 = f;
        new Runnable(this) {
            final /* synthetic */ a c;

            {
                this.c = r7;
            }

            public void run() {
                StringBuilder sb;
                a aVar = this.c;
                new StringBuilder();
                aVar.loadUrl(sb.append("javascript:cueVideo('").append(str2).append("', ").append(f2).append(")").toString());
            }
        };
        boolean post = this.d.post(runnable);
    }

    public void destroy() {
        this.c.clear();
        this.d.removeCallbacksAndMessages((Object) null);
        super.destroy();
    }

    @NonNull
    public Collection<YouTubePlayerListener> getListeners() {
        Collection collection;
        new HashSet(this.c);
        return Collections.unmodifiableCollection(collection);
    }

    public void loadVideo(@NonNull String str, float f) {
        Runnable runnable;
        final String str2 = str;
        final float f2 = f;
        new Runnable(this) {
            final /* synthetic */ a c;

            {
                this.c = r7;
            }

            public void run() {
                StringBuilder sb;
                a aVar = this.c;
                new StringBuilder();
                aVar.loadUrl(sb.append("javascript:loadVideo('").append(str2).append("', ").append(f2).append(")").toString());
            }
        };
        boolean post = this.d.post(runnable);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        int i2 = i;
        if (!this.a || !(i2 == 8 || i2 == 4)) {
            super.onWindowVisibilityChanged(i2);
        }
    }

    public void onYouTubeIframeAPIReady() {
        this.b.onInitSuccess(this);
    }

    public void pause() {
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r5;
            }

            public void run() {
                this.a.loadUrl("javascript:pauseVideo()");
            }
        };
        boolean post = this.d.post(runnable);
    }

    public void play() {
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ a a;

            {
                this.a = r5;
            }

            public void run() {
                this.a.loadUrl("javascript:playVideo()");
            }
        };
        boolean post = this.d.post(runnable);
    }

    public boolean removeListener(@NonNull YouTubePlayerListener youTubePlayerListener) {
        return this.c.remove(youTubePlayerListener);
    }

    public void seekTo(float f) {
        Runnable runnable;
        final float f2 = f;
        new Runnable(this) {
            final /* synthetic */ a b;

            {
                this.b = r6;
            }

            public void run() {
                StringBuilder sb;
                a aVar = this.b;
                new StringBuilder();
                aVar.loadUrl(sb.append("javascript:seekTo(").append(f2).append(")").toString());
            }
        };
        boolean post = this.d.post(runnable);
    }

    public void setVolume(int i) {
        Throwable th;
        Runnable runnable;
        int i2 = i;
        if (i2 < 0 || i2 > 100) {
            Throwable th2 = th;
            new IllegalArgumentException("Volume must be between 0 and 100");
            throw th2;
        }
        final int i3 = i2;
        new Runnable(this) {
            final /* synthetic */ a b;

            {
                this.b = r6;
            }

            public void run() {
                StringBuilder sb;
                a aVar = this.b;
                new StringBuilder();
                aVar.loadUrl(sb.append("javascript:setVolume(").append(i3).append(")").toString());
            }
        };
        boolean post = this.d.post(runnable);
    }
}
