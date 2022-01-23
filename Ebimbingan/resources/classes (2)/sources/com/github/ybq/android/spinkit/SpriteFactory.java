package com.github.ybq.android.spinkit;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.MultiplePulse;
import com.github.ybq.android.spinkit.style.MultiplePulseRing;
import com.github.ybq.android.spinkit.style.Pulse;
import com.github.ybq.android.spinkit.style.PulseRing;
import com.github.ybq.android.spinkit.style.RotatingCircle;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;
import com.github.ybq.android.spinkit.style.Wave;
import org.jose4j.jwt.consumer.ErrorCodes;

public class SpriteFactory {
    public SpriteFactory() {
    }

    /* renamed from: com.github.ybq.android.spinkit.SpriteFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$ybq$android$spinkit$Style = new int[Style.values().length];

        static {
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                NoSuchFieldError noSuchFieldError2 = e2;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                NoSuchFieldError noSuchFieldError3 = e3;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                NoSuchFieldError noSuchFieldError4 = e4;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                NoSuchFieldError noSuchFieldError5 = e5;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                NoSuchFieldError noSuchFieldError6 = e6;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                NoSuchFieldError noSuchFieldError7 = e7;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                NoSuchFieldError noSuchFieldError8 = e8;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                NoSuchFieldError noSuchFieldError9 = e9;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                NoSuchFieldError noSuchFieldError10 = e10;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                NoSuchFieldError noSuchFieldError11 = e11;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                NoSuchFieldError noSuchFieldError12 = e12;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                NoSuchFieldError noSuchFieldError13 = e13;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                NoSuchFieldError noSuchFieldError14 = e14;
            }
            try {
                $SwitchMap$com$github$ybq$android$spinkit$Style[Style.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                NoSuchFieldError noSuchFieldError15 = e15;
            }
        }
    }

    public static Sprite create(Style style) {
        Sprite sprite;
        Sprite sprite2;
        Sprite sprite3;
        Sprite sprite4;
        Sprite sprite5;
        Sprite sprite6;
        Sprite sprite7;
        Sprite sprite8;
        Sprite sprite9;
        Sprite sprite10;
        Sprite sprite11;
        Sprite sprite12;
        Sprite sprite13;
        Sprite sprite14;
        Sprite sprite15;
        Sprite sprite16 = null;
        switch (AnonymousClass1.$SwitchMap$com$github$ybq$android$spinkit$Style[style.ordinal()]) {
            case 1:
                new RotatingPlane();
                sprite16 = sprite15;
                break;
            case 2:
                new DoubleBounce();
                sprite16 = sprite14;
                break;
            case 3:
                new Wave();
                sprite16 = sprite13;
                break;
            case 4:
                new WanderingCubes();
                sprite16 = sprite12;
                break;
            case 5:
                new Pulse();
                sprite16 = sprite11;
                break;
            case 6:
                new ChasingDots();
                sprite16 = sprite10;
                break;
            case ErrorCodes.AUDIENCE_MISSING /*7*/:
                new ThreeBounce();
                sprite16 = sprite9;
                break;
            case ErrorCodes.AUDIENCE_INVALID /*8*/:
                new Circle();
                sprite16 = sprite8;
                break;
            case ErrorCodes.SIGNATURE_INVALID /*9*/:
                new CubeGrid();
                sprite16 = sprite7;
                break;
            case 10:
                new FadingCircle();
                sprite16 = sprite6;
                break;
            case ErrorCodes.ISSUER_MISSING /*11*/:
                new FoldingCube();
                sprite16 = sprite5;
                break;
            case ErrorCodes.ISSUER_INVALID /*12*/:
                new RotatingCircle();
                sprite16 = sprite4;
                break;
            case ErrorCodes.JWT_ID_MISSING /*13*/:
                new MultiplePulse();
                sprite16 = sprite3;
                break;
            case ErrorCodes.SUBJECT_MISSING /*14*/:
                new PulseRing();
                sprite16 = sprite2;
                break;
            case ErrorCodes.SUBJECT_INVALID /*15*/:
                new MultiplePulseRing();
                sprite16 = sprite;
                break;
        }
        return sprite16;
    }
}
