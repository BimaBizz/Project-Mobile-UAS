package com.google.appinventor.components.runtime;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventDispatcher {
    private static final Map<HandlesEventDispatching, b> vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq;

    static final class a {
        final String PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY;
        final String vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ a(String str, String str2, byte b) {
            this(str, str2);
            byte b2 = b;
        }

        private a(String str, String str2) {
            this.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK = str;
            this.PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY = str2;
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r0
                r3 = r1
                if (r2 != r3) goto L_0x0009
                r2 = 1
                r0 = r2
            L_0x0008:
                return r0
            L_0x0009:
                r2 = r1
                if (r2 == 0) goto L_0x0018
                r2 = r0
                java.lang.Class r2 = r2.getClass()
                r3 = r1
                java.lang.Class r3 = r3.getClass()
                if (r2 == r3) goto L_0x001b
            L_0x0018:
                r2 = 0
                r0 = r2
                goto L_0x0008
            L_0x001b:
                r2 = r1
                com.google.appinventor.components.runtime.EventDispatcher$a r2 = (com.google.appinventor.components.runtime.EventDispatcher.a) r2
                r1 = r2
                r2 = r0
                java.lang.String r2 = r2.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK
                r3 = r1
                java.lang.String r3 = r3.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x002e
                r2 = 0
                r0 = r2
                goto L_0x0008
            L_0x002e:
                r2 = r0
                java.lang.String r2 = r2.PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY
                r3 = r1
                java.lang.String r3 = r3.PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x003d
                r2 = 0
                r0 = r2
                goto L_0x0008
            L_0x003d:
                r2 = 1
                r0 = r2
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.EventDispatcher.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (31 * this.PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY.hashCode()) + this.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK.hashCode();
        }
    }

    static final class b {
        private final HandlesEventDispatching hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

        /* renamed from: hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME  reason: collision with other field name */
        final HashMap<String, Set<a>> f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

        b(HandlesEventDispatching handlesEventDispatching) {
            HashMap<String, Set<a>> hashMap;
            new HashMap<>();
            this.f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = hashMap;
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = handlesEventDispatching;
        }
    }

    static {
        Map<HandlesEventDispatching, b> map;
        new HashMap();
        vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = map;
    }

    private EventDispatcher() {
    }

    /* access modifiers changed from: private */
    public static b hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(HandlesEventDispatching handlesEventDispatching) {
        b bVar;
        HandlesEventDispatching handlesEventDispatching2 = handlesEventDispatching;
        b bVar2 = vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.get(handlesEventDispatching2);
        b bVar3 = bVar2;
        if (bVar2 == null) {
            new b(handlesEventDispatching2);
            bVar3 = bVar;
            b put = vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.put(handlesEventDispatching2, bVar3);
        }
        return bVar3;
    }

    public static void registerEventForDelegation(HandlesEventDispatching handlesEventDispatching, String str, String str2) {
        Object obj;
        Set set;
        String str3 = str;
        String str4 = str2;
        b hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching);
        b bVar = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
        Set set2 = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(str4);
        Set set3 = set2;
        if (set2 == null) {
            new HashSet();
            set3 = set;
            Set<a> put = bVar.f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put(str4, set3);
        }
        new a(str3, str4, (byte) 0);
        boolean add = set3.add(obj);
    }

    public static void unregisterEventForDelegation(HandlesEventDispatching handlesEventDispatching, String str, String str2) {
        Set set;
        String str3 = str;
        Set set2 = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching).f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(str2);
        Set<a> set3 = set2;
        if (set2 != null && !set3.isEmpty()) {
            new HashSet();
            Set<a> set4 = set;
            for (a aVar : set3) {
                a aVar2 = aVar;
                if (aVar.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK.equals(str3)) {
                    boolean add = set4.add(aVar2);
                }
            }
            for (a remove : set4) {
                boolean remove2 = set3.remove(remove);
            }
        }
    }

    public static void unregisterAllEventsForDelegation() {
        for (b bVar : vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.values()) {
            bVar.f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.clear();
        }
    }

    public static boolean dispatchEvent(Component component, String str, Object... objArr) {
        Component component2 = component;
        String str2 = str;
        Object[] objArr2 = objArr;
        boolean z = false;
        HandlesEventDispatching dispatchDelegate = component2.getDispatchDelegate();
        HandlesEventDispatching handlesEventDispatching = dispatchDelegate;
        if (dispatchDelegate.canDispatchEvent(component2, str2)) {
            Set set = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching).f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(str2);
            Set set2 = set;
            if (set != null && set2.size() > 0) {
                z = hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching, set2, component2, objArr2);
            }
            handlesEventDispatching.dispatchGenericEvent(component2, str2, !z, objArr2);
        }
        return z;
    }

    public static void dispatchEvent(View view, Component component, String str, Object... objArr) {
        Runnable runnable;
        final Component component2 = component;
        final String str2 = str;
        final Object[] objArr2 = objArr;
        new Runnable() {
            public final void run() {
                boolean z = false;
                HandlesEventDispatching dispatchDelegate = component2.getDispatchDelegate();
                HandlesEventDispatching handlesEventDispatching = dispatchDelegate;
                if (dispatchDelegate.canDispatchEvent(component2, str2)) {
                    Set set = EventDispatcher.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching).f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(str2);
                    Set set2 = set;
                    if (set != null && set2.size() > 0) {
                        z = EventDispatcher.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(handlesEventDispatching, set2, component2, objArr2);
                    }
                    handlesEventDispatching.dispatchGenericEvent(component2, str2, !z, objArr2);
                }
            }
        };
        boolean post = view.post(runnable);
    }

    /* access modifiers changed from: private */
    public static boolean hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(HandlesEventDispatching handlesEventDispatching, Set<a> set, Component component, Object... objArr) {
        HandlesEventDispatching handlesEventDispatching2 = handlesEventDispatching;
        Component component2 = component;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (a next : set) {
            if (handlesEventDispatching2.dispatchEvent(component2, next.vB3WjEtL56PUGm0spJ96S19MI1O4vPR6yju8tUYcKrC4atk0AV5GbVcHQNB7BlIK, next.PJTNEFub7t830GnsJOreZR2G4QGerhYk5JzZTaNM1rn2OjCmiPf1GPWMoDtnF4UY, objArr2)) {
                z = true;
            }
        }
        return z;
    }

    public static String makeFullEventName(String str, String str2) {
        StringBuilder sb;
        new StringBuilder();
        return sb.append(str).append('$').append(str2).toString();
    }

    public static void removeDispatchDelegate(HandlesEventDispatching handlesEventDispatching) {
        b remove = vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.remove(handlesEventDispatching);
        b bVar = remove;
        if (remove != null) {
            bVar.f54hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.clear();
        }
    }
}
