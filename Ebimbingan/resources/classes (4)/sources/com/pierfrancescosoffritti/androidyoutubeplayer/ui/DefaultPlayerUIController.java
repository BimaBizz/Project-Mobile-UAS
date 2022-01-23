package com.pierfrancescosoffritti.androidyoutubeplayer.ui;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.pierfrancescosoffritti.androidyoutubeplayer.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.YouTubePlayerMenu;
import com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu.defaultMenu.DefaultYouTubePlayerMenu;
import com.pierfrancescosoffritti.androidyoutubeplayer.utils.Utils;

public class DefaultPlayerUIController implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, YouTubePlayerFullScreenListener, YouTubePlayerListener, PlayerUIController {
    private boolean A = false;
    private boolean B = false;
    private final Handler C;
    private final Runnable D;
    private boolean E;
    private int F;
    @NonNull
    private final YouTubePlayerView a;
    @NonNull
    private final YouTubePlayer b;
    @NonNull
    private YouTubePlayerMenu c;
    private View d;
    /* access modifiers changed from: private */
    public View e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    /* access modifiers changed from: private */
    public TextView i;
    private TextView j;
    private ProgressBar k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    /* access modifiers changed from: private */
    public SeekBar r;
    @Nullable
    private View.OnClickListener s;
    @Nullable
    private View.OnClickListener t;
    private boolean u = false;
    private boolean v = true;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    private boolean z = true;

    /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.ui.DefaultPlayerUIController$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[PlayerConstants.PlayerState.values().length];

        static {
            try {
                a[PlayerConstants.PlayerState.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
            try {
                a[PlayerConstants.PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                NoSuchFieldError noSuchFieldError2 = e2;
            }
            try {
                a[PlayerConstants.PlayerState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                NoSuchFieldError noSuchFieldError3 = e3;
            }
            try {
                a[PlayerConstants.PlayerState.UNSTARTED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                NoSuchFieldError noSuchFieldError4 = e4;
            }
        }
    }

    public DefaultPlayerUIController(@NonNull YouTubePlayerView youTubePlayerView, @NonNull YouTubePlayer youTubePlayer) {
        Handler handler;
        Runnable runnable;
        YouTubePlayerMenu youTubePlayerMenu;
        YouTubePlayerView youTubePlayerView2 = youTubePlayerView;
        new Handler(Looper.getMainLooper());
        this.C = handler;
        new Runnable(this) {
            final /* synthetic */ DefaultPlayerUIController a;

            {
                this.a = r5;
            }

            public void run() {
                this.a.a(0.0f);
            }
        };
        this.D = runnable;
        this.E = false;
        this.F = -1;
        this.a = youTubePlayerView2;
        this.b = youTubePlayer;
        a(View.inflate(youTubePlayerView2.getContext(), R.layout.default_player_ui, youTubePlayerView2));
        new DefaultYouTubePlayerMenu(youTubePlayerView2.getContext());
        this.c = youTubePlayerMenu;
    }

    private void a() {
        if (this.t == null) {
            this.c.show(this.l);
        } else {
            this.t.onClick(this.l);
        }
    }

    /* access modifiers changed from: private */
    public void a(float f2) {
        Animator.AnimatorListener animatorListener;
        float f3 = f2;
        if (this.w && this.x) {
            this.v = f3 != 0.0f;
            if (f3 != 1.0f || !this.u) {
                this.C.removeCallbacks(this.D);
            } else {
                e();
            }
            final float f4 = f3;
            new Animator.AnimatorListener(this) {
                final /* synthetic */ DefaultPlayerUIController b;

                {
                    this.b = r6;
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    Animator animator2 = animator;
                    if (f4 == 0.0f) {
                        this.b.e.setVisibility(8);
                    }
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    Animator animator2 = animator;
                    if (f4 == 1.0f) {
                        this.b.e.setVisibility(0);
                    }
                }
            };
            this.e.animate().alpha(f3).setDuration(300).setListener(animatorListener).start();
        }
    }

    private void a(View view) {
        View view2 = view;
        this.d = view2.findViewById(R.id.panel);
        this.e = view2.findViewById(R.id.controls_root);
        this.f = (LinearLayout) view2.findViewById(R.id.extra_views_container);
        this.g = (TextView) view2.findViewById(R.id.video_title);
        this.h = (TextView) view2.findViewById(R.id.video_current_time);
        this.i = (TextView) view2.findViewById(R.id.video_duration);
        this.j = (TextView) view2.findViewById(R.id.live_video_indicator);
        this.k = (ProgressBar) view2.findViewById(R.id.progress);
        this.l = (ImageView) view2.findViewById(R.id.menu_button);
        this.m = (ImageView) view2.findViewById(R.id.play_pause_button);
        this.n = (ImageView) view2.findViewById(R.id.youtube_button);
        this.o = (ImageView) view2.findViewById(R.id.fullscreen_button);
        this.p = (ImageView) view2.findViewById(R.id.custom_action_left_button);
        this.q = (ImageView) view2.findViewById(R.id.custom_action_right_button);
        this.r = (SeekBar) view2.findViewById(R.id.seek_bar);
        this.r.setOnSeekBarChangeListener(this);
        this.d.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.o.setOnClickListener(this);
    }

    private void a(PlayerConstants.PlayerState playerState) {
        switch (AnonymousClass5.a[playerState.ordinal()]) {
            case 1:
                this.u = false;
                break;
            case 2:
                this.u = false;
                break;
            case GifDecoder.STATUS_PARTIAL_DECODE:
                this.u = true;
                break;
            case 4:
                f();
                break;
        }
        a(!this.u);
    }

    private void a(boolean z2) {
        this.m.setImageResource(z2 ? R.drawable.ic_pause_36dp : R.drawable.ic_play_36dp);
    }

    private void b() {
        if (this.s == null) {
            this.a.toggleFullScreen();
        } else {
            this.s.onClick(this.o);
        }
    }

    private void c() {
        if (this.u) {
            this.b.pause();
        } else {
            this.b.play();
        }
    }

    private void d() {
        a(this.v ? 0.0f : 1.0f);
    }

    private void e() {
        boolean postDelayed = this.C.postDelayed(this.D, 3000);
    }

    private void f() {
        Runnable runnable;
        this.r.setProgress(0);
        this.r.setMax(0);
        new Runnable(this) {
            final /* synthetic */ DefaultPlayerUIController a;

            {
                this.a = r5;
            }

            public void run() {
                this.a.i.setText("");
            }
        };
        boolean post = this.i.post(runnable);
    }

    public void addView(@NonNull View view) {
        this.f.addView(view, 0);
    }

    public void enableLiveVideoUI(boolean z2) {
        if (z2) {
            this.i.setVisibility(4);
            this.r.setVisibility(4);
            this.h.setVisibility(4);
            this.j.setVisibility(0);
            return;
        }
        this.i.setVisibility(0);
        this.r.setVisibility(0);
        this.h.setVisibility(0);
        this.j.setVisibility(8);
    }

    @NonNull
    public YouTubePlayerMenu getMenu() {
        return this.c;
    }

    public void onApiChange() {
    }

    public void onClick(View view) {
        View view2 = view;
        if (view2 == this.d) {
            d();
        } else if (view2 == this.m) {
            c();
        } else if (view2 == this.o) {
            b();
        } else if (view2 == this.l) {
            a();
        }
    }

    public void onCurrentSecond(float f2) {
        float f3 = f2;
        if (!this.E) {
            if (this.F <= 0 || Utils.formatTime(f3).equals(Utils.formatTime((float) this.F))) {
                this.F = -1;
                this.r.setProgress((int) f3);
            }
        }
    }

    public void onError(@NonNull PlayerConstants.PlayerError playerError) {
    }

    public void onPlaybackQualityChange(@NonNull PlayerConstants.PlaybackQuality playbackQuality) {
    }

    public void onPlaybackRateChange(@NonNull PlayerConstants.PlaybackRate playbackRate) {
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        SeekBar seekBar2 = seekBar;
        boolean z3 = z2;
        this.h.setText(Utils.formatTime((float) i2));
    }

    public void onReady() {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar seekBar2 = seekBar;
        this.E = true;
    }

    public void onStateChange(@NonNull PlayerConstants.PlayerState playerState) {
        PlayerConstants.PlayerState playerState2 = playerState;
        this.F = -1;
        a(playerState2);
        if (playerState2 == PlayerConstants.PlayerState.PLAYING || playerState2 == PlayerConstants.PlayerState.PAUSED || playerState2 == PlayerConstants.PlayerState.VIDEO_CUED) {
            this.d.setBackgroundColor(ContextCompat.getColor(this.a.getContext(), 17170445));
            this.k.setVisibility(8);
            if (this.y) {
                this.m.setVisibility(0);
            }
            if (this.A) {
                this.p.setVisibility(0);
            }
            if (this.B) {
                this.q.setVisibility(0);
            }
            this.w = true;
            boolean z2 = playerState2 == PlayerConstants.PlayerState.PLAYING;
            a(z2);
            if (z2) {
                e();
            } else {
                this.C.removeCallbacks(this.D);
            }
        } else {
            a(false);
            a(1.0f);
            if (playerState2 == PlayerConstants.PlayerState.BUFFERING) {
                this.d.setBackgroundColor(ContextCompat.getColor(this.a.getContext(), 17170445));
                if (this.y) {
                    this.m.setVisibility(4);
                }
                this.p.setVisibility(8);
                this.q.setVisibility(8);
                this.w = false;
            }
            if (playerState2 == PlayerConstants.PlayerState.UNSTARTED) {
                this.w = false;
                this.k.setVisibility(8);
                if (this.y) {
                    this.m.setVisibility(0);
                }
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar seekBar2 = seekBar;
        if (this.u) {
            this.F = seekBar2.getProgress();
        }
        this.b.seekTo((float) seekBar2.getProgress());
        this.E = false;
    }

    public void onVideoDuration(float f2) {
        float f3 = f2;
        this.i.setText(Utils.formatTime(f3));
        this.r.setMax((int) f3);
    }

    public void onVideoId(@NonNull String str) {
        View.OnClickListener onClickListener;
        final String str2 = str;
        new View.OnClickListener(this) {
            final /* synthetic */ DefaultPlayerUIController b;

            {
                this.b = r6;
            }

            public void onClick(View view) {
                Intent intent;
                StringBuilder sb;
                View view2 = view;
                new StringBuilder();
                new Intent("android.intent.action.VIEW", Uri.parse(sb.append("http://www.youtube.com/watch?v=").append(str2).append("#t=").append(this.b.r.getProgress()).toString()));
                this.b.e.getContext().startActivity(intent);
            }
        };
        this.n.setOnClickListener(onClickListener);
    }

    public void onVideoLoadedFraction(float f2) {
        float f3 = f2;
        if (this.z) {
            this.r.setSecondaryProgress((int) (f3 * ((float) this.r.getMax())));
        } else {
            this.r.setSecondaryProgress(0);
        }
    }

    public void onYouTubePlayerEnterFullScreen() {
        this.o.setImageResource(R.drawable.ic_fullscreen_exit_24dp);
    }

    public void onYouTubePlayerExitFullScreen() {
        this.o.setImageResource(R.drawable.ic_fullscreen_24dp);
    }

    public void removeView(@NonNull View view) {
        this.f.removeView(view);
    }

    public void setCustomAction1(@NonNull Drawable drawable, View.OnClickListener onClickListener) {
        this.p.setImageDrawable(drawable);
        this.p.setOnClickListener(onClickListener);
        showCustomAction1(true);
    }

    public void setCustomAction2(@NonNull Drawable drawable, View.OnClickListener onClickListener) {
        this.q.setImageDrawable(drawable);
        this.q.setOnClickListener(onClickListener);
        showCustomAction2(true);
    }

    public void setFullScreenButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        this.s = onClickListener2;
    }

    public void setMenu(@NonNull YouTubePlayerMenu youTubePlayerMenu) {
        YouTubePlayerMenu youTubePlayerMenu2 = youTubePlayerMenu;
        this.c = youTubePlayerMenu2;
    }

    public void setMenuButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        this.t = onClickListener2;
    }

    public void setVideoTitle(@NonNull String str) {
        this.g.setText(str);
    }

    public void showBufferingProgress(boolean z2) {
        boolean z3 = z2;
        this.z = z3;
    }

    public void showCurrentTime(boolean z2) {
        this.h.setVisibility(z2 ? 0 : 8);
    }

    public void showCustomAction1(boolean z2) {
        boolean z3 = z2;
        this.A = z3;
        this.p.setVisibility(z3 ? 0 : 8);
    }

    public void showCustomAction2(boolean z2) {
        boolean z3 = z2;
        this.B = z3;
        this.q.setVisibility(z3 ? 0 : 8);
    }

    public void showDuration(boolean z2) {
        this.i.setVisibility(z2 ? 0 : 8);
    }

    public void showFullscreenButton(boolean z2) {
        this.o.setVisibility(z2 ? 0 : 8);
    }

    public void showMenuButton(boolean z2) {
        this.l.setVisibility(z2 ? 0 : 8);
    }

    public void showPlayPauseButton(boolean z2) {
        boolean z3 = z2;
        this.m.setVisibility(z3 ? 0 : 8);
        this.y = z3;
    }

    public void showSeekBar(boolean z2) {
        this.r.setVisibility(z2 ? 0 : 4);
    }

    public void showUI(boolean z2) {
        boolean z3 = z2;
        this.e.setVisibility(z3 ? 0 : 4);
        this.x = z3;
    }

    public void showVideoTitle(boolean z2) {
        this.g.setVisibility(z2 ? 0 : 8);
    }

    public void showYouTubeButton(boolean z2) {
        this.n.setVisibility(z2 ? 0 : 8);
    }
}
