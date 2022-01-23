package com.google.appinventor.components.runtime.util;

import android.app.Activity;
import android.media.AudioManager;
import android.view.Display;
import com.google.appinventor.components.runtime.Player;

public class FroyoUtil {
    private FroyoUtil() {
    }

    public static int getRotation(Display display) {
        return display.getRotation();
    }

    public static AudioManager setAudioManager(Activity activity) {
        return (AudioManager) activity.getSystemService("audio");
    }

    public static Object setAudioFocusChangeListener(Player player) {
        Object obj;
        final Player player2 = player;
        new AudioManager.OnAudioFocusChangeListener() {
            private boolean FWhlgAfItZPAj52Sbrmx0NIMbFKmURdRAyv8T1hdxDpczs3OJmULpy7aDRNSO45K = false;

            public final void onAudioFocusChange(int i) {
                switch (i) {
                    case -3:
                    case -2:
                        if (player2 != null && player2.playerState == Player.State.PLAYING) {
                            player2.pause();
                            this.FWhlgAfItZPAj52Sbrmx0NIMbFKmURdRAyv8T1hdxDpczs3OJmULpy7aDRNSO45K = true;
                            return;
                        }
                        return;
                    case -1:
                        this.FWhlgAfItZPAj52Sbrmx0NIMbFKmURdRAyv8T1hdxDpczs3OJmULpy7aDRNSO45K = false;
                        player2.OtherPlayerStarted();
                        return;
                    case 1:
                        if (player2 != null && this.FWhlgAfItZPAj52Sbrmx0NIMbFKmURdRAyv8T1hdxDpczs3OJmULpy7aDRNSO45K && player2.playerState == Player.State.PAUSED_BY_EVENT) {
                            player2.Start();
                            this.FWhlgAfItZPAj52Sbrmx0NIMbFKmURdRAyv8T1hdxDpczs3OJmULpy7aDRNSO45K = false;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        return obj;
    }

    public static boolean focusRequestGranted(AudioManager audioManager, Object obj) {
        return audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) obj, 3, 1) == 1;
    }

    public static void abandonFocus(AudioManager audioManager, Object obj) {
        int abandonAudioFocus = audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) obj);
    }
}
