package com.google.appinventor.components.runtime.util;

import java.util.Arrays;
import java.util.List;

public class ProgressHelper {
    public ProgressHelper() {
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setButtonProgressAnimation(android.widget.TextView r13, java.lang.String r14, java.lang.String r15, int r16, int r17) {
        /*
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r1
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r8 = "\\s"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replaceAll(r8, r9)
            r5 = r7
            r7 = -1
            r6 = r7
            r7 = r5
            int r7 = r7.hashCode()
            switch(r7) {
                case -1360216880: goto L_0x0071;
                case -817913340: goto L_0x00d0;
                case -741786634: goto L_0x00a6;
                case 3642105: goto L_0x00fd;
                case 40036904: goto L_0x00c2;
                case 105393403: goto L_0x007e;
                case 107027353: goto L_0x00b4;
                case 509233141: goto L_0x0064;
                case 1143631270: goto L_0x00df;
                case 1217522153: goto L_0x00ee;
                case 1384198729: goto L_0x0098;
                case 1471386009: goto L_0x008b;
                default: goto L_0x0021;
            }
        L_0x0021:
            r7 = r6
            switch(r7) {
                case 0: goto L_0x010c;
                case 1: goto L_0x0117;
                case 2: goto L_0x0122;
                case 3: goto L_0x012d;
                case 4: goto L_0x0138;
                case 5: goto L_0x0143;
                case 6: goto L_0x014e;
                case 7: goto L_0x0159;
                case 8: goto L_0x0164;
                case 9: goto L_0x016f;
                case 10: goto L_0x017a;
                case 11: goto L_0x0185;
                default: goto L_0x0025;
            }
        L_0x0025:
            r7 = 0
            r1 = r7
        L_0x0027:
            r7 = r1
            if (r7 == 0) goto L_0x003d
            r7 = r1
            r8 = 0
            r9 = 0
            r10 = r3
            r12 = r10
            r10 = r12
            r11 = r12
            r7.setBounds(r8, r9, r10, r11)
            r7 = r1
            r7.start()
            r7 = r1
            r8 = r4
            r7.setColor(r8)
        L_0x003d:
            r7 = r2
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r8 = "\\s"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replaceAll(r8, r9)
            r5 = r7
            r7 = -1
            r6 = r7
            r7 = r5
            int r7 = r7.hashCode()
            switch(r7) {
                case -1383228885: goto L_0x01ac;
                case 115029: goto L_0x0190;
                case 108511772: goto L_0x019e;
                default: goto L_0x0057;
            }
        L_0x0057:
            r7 = r6
            switch(r7) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01c4;
                case 2: goto L_0x01ce;
                default: goto L_0x005b;
            }
        L_0x005b:
            r7 = r0
            r8 = r1
            r9 = 0
            r10 = 0
            r11 = 0
            r7.setCompoundDrawables(r8, r9, r10, r11)
        L_0x0063:
            return
        L_0x0064:
            r7 = r5
            java.lang.String r8 = "chasingdots"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 0
            r6 = r7
            goto L_0x0021
        L_0x0071:
            r7 = r5
            java.lang.String r8 = "circle"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 1
            r6 = r7
            goto L_0x0021
        L_0x007e:
            r7 = r5
            java.lang.String r8 = "cubegrid"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 2
            r6 = r7
            goto L_0x0021
        L_0x008b:
            r7 = r5
            java.lang.String r8 = "doublebounce"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 3
            r6 = r7
            goto L_0x0021
        L_0x0098:
            r7 = r5
            java.lang.String r8 = "fadingcircle"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 4
            r6 = r7
            goto L_0x0021
        L_0x00a6:
            r7 = r5
            java.lang.String r8 = "foldingcube"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 5
            r6 = r7
            goto L_0x0021
        L_0x00b4:
            r7 = r5
            java.lang.String r8 = "pulse"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 6
            r6 = r7
            goto L_0x0021
        L_0x00c2:
            r7 = r5
            java.lang.String r8 = "rotatingcircle"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 7
            r6 = r7
            goto L_0x0021
        L_0x00d0:
            r7 = r5
            java.lang.String r8 = "rotatingplane"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 8
            r6 = r7
            goto L_0x0021
        L_0x00df:
            r7 = r5
            java.lang.String r8 = "threebounce"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 9
            r6 = r7
            goto L_0x0021
        L_0x00ee:
            r7 = r5
            java.lang.String r8 = "wanderingcubes"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 10
            r6 = r7
            goto L_0x0021
        L_0x00fd:
            r7 = r5
            java.lang.String r8 = "wave"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0021
            r7 = 11
            r6 = r7
            goto L_0x0021
        L_0x010c:
            com.github.ybq.android.spinkit.style.ChasingDots r7 = new com.github.ybq.android.spinkit.style.ChasingDots
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0117:
            com.github.ybq.android.spinkit.style.Circle r7 = new com.github.ybq.android.spinkit.style.Circle
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0122:
            com.github.ybq.android.spinkit.style.CubeGrid r7 = new com.github.ybq.android.spinkit.style.CubeGrid
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x012d:
            com.github.ybq.android.spinkit.style.DoubleBounce r7 = new com.github.ybq.android.spinkit.style.DoubleBounce
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0138:
            com.github.ybq.android.spinkit.style.FadingCircle r7 = new com.github.ybq.android.spinkit.style.FadingCircle
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0143:
            com.github.ybq.android.spinkit.style.FoldingCube r7 = new com.github.ybq.android.spinkit.style.FoldingCube
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x014e:
            com.github.ybq.android.spinkit.style.Pulse r7 = new com.github.ybq.android.spinkit.style.Pulse
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0159:
            com.github.ybq.android.spinkit.style.RotatingCircle r7 = new com.github.ybq.android.spinkit.style.RotatingCircle
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0164:
            com.github.ybq.android.spinkit.style.RotatingPlane r7 = new com.github.ybq.android.spinkit.style.RotatingPlane
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x016f:
            com.github.ybq.android.spinkit.style.ThreeBounce r7 = new com.github.ybq.android.spinkit.style.ThreeBounce
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x017a:
            com.github.ybq.android.spinkit.style.WanderingCubes r7 = new com.github.ybq.android.spinkit.style.WanderingCubes
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0185:
            com.github.ybq.android.spinkit.style.Wave r7 = new com.github.ybq.android.spinkit.style.Wave
            r12 = r7
            r7 = r12
            r8 = r12
            r8.<init>()
            r1 = r7
            goto L_0x0027
        L_0x0190:
            r7 = r5
            java.lang.String r8 = "top"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0057
            r7 = 0
            r6 = r7
            goto L_0x0057
        L_0x019e:
            r7 = r5
            java.lang.String r8 = "right"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0057
            r7 = 1
            r6 = r7
            goto L_0x0057
        L_0x01ac:
            r7 = r5
            java.lang.String r8 = "bottom"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0057
            r7 = 2
            r6 = r7
            goto L_0x0057
        L_0x01ba:
            r7 = r0
            r8 = 0
            r9 = r1
            r10 = 0
            r11 = 0
            r7.setCompoundDrawables(r8, r9, r10, r11)
            goto L_0x0063
        L_0x01c4:
            r7 = r0
            r8 = 0
            r9 = 0
            r10 = r1
            r11 = 0
            r7.setCompoundDrawables(r8, r9, r10, r11)
            goto L_0x0063
        L_0x01ce:
            r7 = r0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r1
            r7.setCompoundDrawables(r8, r9, r10, r11)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.util.ProgressHelper.setButtonProgressAnimation(android.widget.TextView, java.lang.String, java.lang.String, int, int):void");
    }

    public static List<String> getAnimationStyles() {
        return Arrays.asList("ChasingDots,Circle,CubeGrid,DoubleBounce,FadingCircle,FoldingCube,Pulse,RotatingCircle,RotatingPlane,ThreeBounce,WanderingCubes,Wave".split("\\s*,\\s*"));
    }
}
