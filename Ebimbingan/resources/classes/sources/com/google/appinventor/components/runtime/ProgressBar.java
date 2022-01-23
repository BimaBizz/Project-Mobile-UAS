package com.google.appinventor.components.runtime;

import android.graphics.Rect;
import android.view.View;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.appinventor.components.runtime.util.ProgressHelper;
import com.google.appinventor.components.runtime.util.YailList;
import java.util.List;

@SimpleObject
@DesignerComponent(category = ComponentCategory.USERINTERFACE, description = "", version = 4)
@UsesLibraries({"spinkit.jar"})
public final class ProgressBar extends AndroidViewComponent {
    private final android.widget.ProgressBar B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
    private String ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I = ComponentConstants.DEFAULT_PROGRESSBAR_ANIMATION;
    private int backgroundColor;
    private Rect hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

    /* renamed from: hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME  reason: collision with other field name */
    private Sprite f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
    private int zWdiPvy9THbs14kS37O202JH95jn5GzRAXQdLdM0hhw5e6hZSAshBMBb0bJkJXW5 = Component.COLOR_CYAN_DAK;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProgressBar(com.google.appinventor.components.runtime.ComponentContainer r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r0
            r3 = r1
            r2.<init>(r3)
            r2 = r0
            r3 = -16741493(0xffffffffff008b8b, float:-1.7086573E38)
            r2.zWdiPvy9THbs14kS37O202JH95jn5GzRAXQdLdM0hhw5e6hZSAshBMBb0bJkJXW5 = r3
            r2 = r0
            java.lang.String r3 = "Wave"
            r2.ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I = r3
            r2 = r0
            android.widget.ProgressBar r3 = new android.widget.ProgressBar
            r6 = r3
            r3 = r6
            r4 = r6
            r5 = r1
            android.app.Activity r5 = r5.$context()
            r4.<init>(r5)
            r2.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = r3
            r2 = r0
            r3 = -16741493(0xffffffffff008b8b, float:-1.7086573E38)
            r2.Color(r3)
            r2 = r0
            r6 = r2
            r2 = r6
            r3 = r6
            java.lang.String r3 = r3.ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I
            r2.AnimationStyle(r3)
            r2 = r1
            r3 = r0
            r2.$add(r3)
            r2 = r0
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2.BackgroundColor(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.ProgressBar.<init>(com.google.appinventor.components.runtime.ComponentContainer):void");
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public final int BackgroundColor() {
        return this.backgroundColor;
    }

    @DesignerProperty(defaultValue = "&H00FFFFFF", editorType = "color")
    @SimpleProperty(category = PropertyCategory.APPEARANCE, description = "Sets the background color of this component.")
    public final void BackgroundColor(int i) {
        int i2 = i;
        this.backgroundColor = i2;
        this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.setBackgroundColor(i2);
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public final int Color() {
        return this.zWdiPvy9THbs14kS37O202JH95jn5GzRAXQdLdM0hhw5e6hZSAshBMBb0bJkJXW5;
    }

    @DesignerProperty(defaultValue = "&HFF008b8b", editorType = "color")
    @SimpleProperty(description = "Sets the color of the component")
    public final void Color(int i) {
        int i2 = i;
        if (this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
            this.zWdiPvy9THbs14kS37O202JH95jn5GzRAXQdLdM0hhw5e6hZSAshBMBb0bJkJXW5 = i2;
            this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setColor(i2);
        }
    }

    @SimpleFunction(description = "Gets style names of all possible animations.")
    public final YailList GetAnimationStyleNames() {
        return YailList.makeList((List) ProgressHelper.getAnimationStyles());
    }

    @DesignerProperty(defaultValue = "Wave", editorType = "progress_options")
    @SimpleProperty(description = "Allows you to set animation style. Valid (case-insensitive) values are: ChasingDots, Circle, CubeGrid, DoubleBounce, FadingCircle, FoldingCube, Pulse, RotatingCircle, RotatingPlane, ThreeBounce, WanderingCubes, Wave. If invalid style is used, Wave animation will be used.")
    public final void AnimationStyle(String str) {
        this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = getSprite(str);
        this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.start();
        this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setColor(this.zWdiPvy9THbs14kS37O202JH95jn5GzRAXQdLdM0hhw5e6hZSAshBMBb0bJkJXW5);
        this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.setIndeterminateDrawable(this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
        if (this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME == null) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getBounds();
        }
        this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBounds(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.left, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.top, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.right, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.bottom);
        this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.invalidateDrawable(this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.github.ybq.android.spinkit.sprite.Sprite getSprite(java.lang.String r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r3 = r0
            r4 = r1
            r3.ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I = r4
            r3 = r1
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = "\\s"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replaceAll(r4, r5)
            r1 = r3
            r3 = -1
            r2 = r3
            r3 = r1
            int r3 = r3.hashCode()
            switch(r3) {
                case -1360216880: goto L_0x0041;
                case -817913340: goto L_0x009c;
                case -741786634: goto L_0x0075;
                case 3642105: goto L_0x00c9;
                case 40036904: goto L_0x008f;
                case 105393403: goto L_0x004e;
                case 107027353: goto L_0x0082;
                case 509233141: goto L_0x0034;
                case 1143631270: goto L_0x00ab;
                case 1217522153: goto L_0x00ba;
                case 1384198729: goto L_0x0068;
                case 1471386009: goto L_0x005b;
                default: goto L_0x0020;
            }
        L_0x0020:
            r3 = r2
            switch(r3) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00f9;
                case 4: goto L_0x0104;
                case 5: goto L_0x010f;
                case 6: goto L_0x011a;
                case 7: goto L_0x0125;
                case 8: goto L_0x0130;
                case 9: goto L_0x013b;
                case 10: goto L_0x0146;
                case 11: goto L_0x0151;
                default: goto L_0x0024;
            }
        L_0x0024:
            r3 = r0
            java.lang.String r4 = "Wave"
            r3.ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I = r4
            com.github.ybq.android.spinkit.style.Wave r3 = new com.github.ybq.android.spinkit.style.Wave
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
        L_0x0033:
            return r0
        L_0x0034:
            r3 = r1
            java.lang.String r4 = "chasingdots"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 0
            r2 = r3
            goto L_0x0020
        L_0x0041:
            r3 = r1
            java.lang.String r4 = "circle"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 1
            r2 = r3
            goto L_0x0020
        L_0x004e:
            r3 = r1
            java.lang.String r4 = "cubegrid"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 2
            r2 = r3
            goto L_0x0020
        L_0x005b:
            r3 = r1
            java.lang.String r4 = "doublebounce"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 3
            r2 = r3
            goto L_0x0020
        L_0x0068:
            r3 = r1
            java.lang.String r4 = "fadingcircle"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            r2 = r3
            goto L_0x0020
        L_0x0075:
            r3 = r1
            java.lang.String r4 = "foldingcube"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 5
            r2 = r3
            goto L_0x0020
        L_0x0082:
            r3 = r1
            java.lang.String r4 = "pulse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 6
            r2 = r3
            goto L_0x0020
        L_0x008f:
            r3 = r1
            java.lang.String r4 = "rotatingcircle"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 7
            r2 = r3
            goto L_0x0020
        L_0x009c:
            r3 = r1
            java.lang.String r4 = "rotatingplane"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 8
            r2 = r3
            goto L_0x0020
        L_0x00ab:
            r3 = r1
            java.lang.String r4 = "threebounce"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 9
            r2 = r3
            goto L_0x0020
        L_0x00ba:
            r3 = r1
            java.lang.String r4 = "wanderingcubes"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 10
            r2 = r3
            goto L_0x0020
        L_0x00c9:
            r3 = r1
            java.lang.String r4 = "wave"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0020
            r3 = 11
            r2 = r3
            goto L_0x0020
        L_0x00d8:
            com.github.ybq.android.spinkit.style.ChasingDots r3 = new com.github.ybq.android.spinkit.style.ChasingDots
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x00e3:
            com.github.ybq.android.spinkit.style.Circle r3 = new com.github.ybq.android.spinkit.style.Circle
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x00ee:
            com.github.ybq.android.spinkit.style.CubeGrid r3 = new com.github.ybq.android.spinkit.style.CubeGrid
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x00f9:
            com.github.ybq.android.spinkit.style.DoubleBounce r3 = new com.github.ybq.android.spinkit.style.DoubleBounce
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x0104:
            com.github.ybq.android.spinkit.style.FadingCircle r3 = new com.github.ybq.android.spinkit.style.FadingCircle
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x010f:
            com.github.ybq.android.spinkit.style.FoldingCube r3 = new com.github.ybq.android.spinkit.style.FoldingCube
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x011a:
            com.github.ybq.android.spinkit.style.Pulse r3 = new com.github.ybq.android.spinkit.style.Pulse
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x0125:
            com.github.ybq.android.spinkit.style.RotatingCircle r3 = new com.github.ybq.android.spinkit.style.RotatingCircle
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x0130:
            com.github.ybq.android.spinkit.style.RotatingPlane r3 = new com.github.ybq.android.spinkit.style.RotatingPlane
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x013b:
            com.github.ybq.android.spinkit.style.ThreeBounce r3 = new com.github.ybq.android.spinkit.style.ThreeBounce
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x0146:
            com.github.ybq.android.spinkit.style.WanderingCubes r3 = new com.github.ybq.android.spinkit.style.WanderingCubes
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        L_0x0151:
            com.github.ybq.android.spinkit.style.Wave r3 = new com.github.ybq.android.spinkit.style.Wave
            r6 = r3
            r3 = r6
            r4 = r6
            r4.<init>()
            r0 = r3
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.ProgressBar.getSprite(java.lang.String):com.github.ybq.android.spinkit.sprite.Sprite");
    }

    @SimpleProperty(description = "Gets current animation style")
    public final String AnimationStyle() {
        return this.ZBOPOXf20XZKrN6ycbQhEDPC2OsW2QCGfMHApJMYjAVGCpHVQNyA3eb1TXx8tY2I;
    }

    @SimpleProperty
    public final void Height(int i) {
        super.Height(i);
        moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0();
    }

    @SimpleProperty
    public final void Width(int i) {
        super.Width(i);
        moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0();
    }

    private void moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0() {
        try {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getBounds();
            this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBounds(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.left, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.top, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.right, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.bottom);
            this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.invalidateDrawable(this.f199hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
        } catch (Exception e) {
        }
    }

    public final View getView() {
        return this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
    }
}
