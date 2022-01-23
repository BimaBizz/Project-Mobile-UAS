package com.onesignal;

import android.view.animation.Interpolator;

class OneSignalBounceInterpolator implements Interpolator {
    private double mAmplitude = 1.0d;
    private double mFrequency = 10.0d;

    OneSignalBounceInterpolator(double amplitude, double frequency) {
        this.mAmplitude = amplitude;
        this.mFrequency = frequency;
    }

    public float getInterpolation(float f) {
        float time = f;
        return (float) ((-1.0d * Math.pow(2.718281828459045d, ((double) (-time)) / this.mAmplitude) * Math.cos(this.mFrequency * ((double) time))) + 1.0d);
    }
}
