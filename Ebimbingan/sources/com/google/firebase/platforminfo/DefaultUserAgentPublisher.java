package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(Set<LibraryVersion> libraryVersions, GlobalLibraryVersionRegistrar gamesSDKRegistrar2) {
        this.javaSDKVersionUserAgent = toUserAgent(libraryVersions);
        this.gamesSDKRegistrar = gamesSDKRegistrar2;
    }

    public String getUserAgent() {
        StringBuilder sb;
        if (this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }
        new StringBuilder();
        return sb.append(this.javaSDKVersionUserAgent).append(' ').append(toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions())).toString();
    }

    private static String toUserAgent(Set<LibraryVersion> tokens) {
        StringBuilder sb;
        new StringBuilder();
        StringBuilder sb2 = sb;
        Iterator<LibraryVersion> iterator = tokens.iterator();
        while (iterator.hasNext()) {
            LibraryVersion token = iterator.next();
            StringBuilder append = sb2.append(token.getLibraryName()).append('/').append(token.getVersion());
            if (iterator.hasNext()) {
                StringBuilder append2 = sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(LibraryVersion.class)).factory(DefaultUserAgentPublisher$$Lambda$1.lambdaFactory$()).build();
    }

    static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer c) {
        UserAgentPublisher userAgentPublisher;
        new DefaultUserAgentPublisher(c.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
        return userAgentPublisher;
    }
}
