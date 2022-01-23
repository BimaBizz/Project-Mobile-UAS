package com.onesignal.influence.model;

import androidx.annotation.NonNull;

public enum OSInfluenceType {
    ;

    public boolean isDirect() {
        return equals(DIRECT);
    }

    public boolean isIndirect() {
        return equals(INDIRECT);
    }

    public boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public boolean isUnattributed() {
        return equals(UNATTRIBUTED);
    }

    public boolean isDisabled() {
        return equals(DISABLED);
    }

    @NonNull
    public static OSInfluenceType fromString(String str) {
        String value = str;
        if (value == null || value.isEmpty()) {
            return UNATTRIBUTED;
        }
        OSInfluenceType[] values = values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            OSInfluenceType type = values[i];
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return UNATTRIBUTED;
    }
}
