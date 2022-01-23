package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.util.ErrorMessages;

@SimpleObject
public abstract class LegoMindstormsNxtSensor extends LegoMindstormsNxtBase {
    private String iA1fsPSZHTCVXA414XY2edBmEFVpo23ZLLJ3ntPGDoZ3Lc1O8L7tucf7fjSxdGWm;
    protected int port;

    public abstract void SensorPort(String str);

    /* access modifiers changed from: protected */
    public abstract void initializeSensor(String str);

    static class a<T> {
        final boolean hqHtvKVLFGgMVMSKZM3hViIxQKdIh8YXfZOV4lmVWV1e2Mndp07BOheWTgPW1jrN;
        final T qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;

        a(boolean z, T t) {
            this.hqHtvKVLFGgMVMSKZM3hViIxQKdIh8YXfZOV4lmVWV1e2Mndp07BOheWTgPW1jrN = z;
            this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = t;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected LegoMindstormsNxtSensor(ComponentContainer componentContainer, String str) {
        super(componentContainer, str);
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "The sensor port that the sensor is connected to.", userVisible = false)
    public String SensorPort() {
        return this.iA1fsPSZHTCVXA414XY2edBmEFVpo23ZLLJ3ntPGDoZ3Lc1O8L7tucf7fjSxdGWm;
    }

    /* access modifiers changed from: protected */
    public final void setSensorPort(String str) {
        String str2 = str;
        String str3 = "SensorPort";
        try {
            int convertSensorPortLetterToNumber = convertSensorPortLetterToNumber(str2);
            this.iA1fsPSZHTCVXA414XY2edBmEFVpo23ZLLJ3ntPGDoZ3Lc1O8L7tucf7fjSxdGWm = str2;
            this.port = convertSensorPortLetterToNumber;
            if (this.bluetooth != null && this.bluetooth.IsConnected()) {
                initializeSensor(str3);
            }
        } catch (IllegalArgumentException e) {
            this.form.dispatchErrorOccurredEvent(this, str3, ErrorMessages.ERROR_NXT_INVALID_SENSOR_PORT, str2);
        }
    }

    public void afterConnect(BluetoothConnectionBase bluetoothConnectionBase) {
        BluetoothConnectionBase bluetoothConnectionBase2 = bluetoothConnectionBase;
        initializeSensor("Connect");
    }
}
