package com.onesignal;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

class OneSignalAnimate {
    OneSignalAnimate() {
    }

    static Animation animateViewByTranslation(View view, float deltaFromY, float deltaToY, int duration, Interpolator interpolator, Animation.AnimationListener animationListener) {
        Animation animation;
        View view2 = view;
        Animation.AnimationListener animCallback = animationListener;
        new TranslateAnimation(0.0f, 0.0f, deltaFromY, deltaToY);
        Animation translateAnimation = animation;
        translateAnimation.setDuration((long) duration);
        translateAnimation.setInterpolator(interpolator);
        if (animCallback != null) {
            translateAnimation.setAnimationListener(animCallback);
        }
        view2.setAnimation(translateAnimation);
        return translateAnimation;
    }

    static ValueAnimator animateViewColor(View view, int duration, int colorStart, int colorEnd, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator;
        TypeEvaluator typeEvaluator;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        Animator.AnimatorListener animCallback = animatorListener;
        new ValueAnimator();
        ValueAnimator backgroundAnimation = valueAnimator;
        ValueAnimator duration2 = backgroundAnimation.setDuration((long) duration);
        int[] iArr = new int[2];
        iArr[0] = colorStart;
        int[] iArr2 = iArr;
        iArr2[1] = colorEnd;
        backgroundAnimation.setIntValues(iArr2);
        new ArgbEvaluator();
        backgroundAnimation.setEvaluator(typeEvaluator);
        final View view2 = view;
        new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view2.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        backgroundAnimation.addUpdateListener(animatorUpdateListener);
        if (animCallback != null) {
            backgroundAnimation.addListener(animCallback);
        }
        return backgroundAnimation;
    }

    static Animation animateViewSmallToLarge(View view, int duration, Interpolator interpolator, Animation.AnimationListener animationListener) {
        Animation animation;
        View view2 = view;
        Animation.AnimationListener animCallback = animationListener;
        new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        Animation scaleAnimation = animation;
        scaleAnimation.setDuration((long) duration);
        scaleAnimation.setInterpolator(interpolator);
        if (animCallback != null) {
            scaleAnimation.setAnimationListener(animCallback);
        }
        view2.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
