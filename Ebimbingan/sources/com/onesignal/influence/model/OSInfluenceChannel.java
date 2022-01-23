package com.onesignal.influence.model;

import androidx.annotation.NonNull;

public enum OSInfluenceChannel {
    ;
    
    private final String name;

    private OSInfluenceChannel(String name2) {
        String str = r8;
        int i = r9;
        this.name = name2;
    }

    public boolean equalsName(String otherName) {
        return this.name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

    @NonNull
    public static OSInfluenceChannel fromString(String str) {
        String value = str;
        if (value == null || value.isEmpty()) {
            return NOTIFICATION;
        }
        OSInfluenceChannel[] values = values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            OSInfluenceChannel type = values[i];
            if (type.equalsName(value)) {
                return type;
            }
        }
        return NOTIFICATION;
    }
}
