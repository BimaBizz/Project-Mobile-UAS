package com.onesignal.outcomes.model;

import com.onesignal.influence.model.OSInfluenceChannel;

public class OSCachedUniqueOutcome {
    private OSInfluenceChannel channel;
    private String influenceId;

    public OSCachedUniqueOutcome(String influenceId2, OSInfluenceChannel channel2) {
        this.influenceId = influenceId2;
        this.channel = channel2;
    }

    public String getInfluenceId() {
        return this.influenceId;
    }

    public OSInfluenceChannel getChannel() {
        return this.channel;
    }
}
