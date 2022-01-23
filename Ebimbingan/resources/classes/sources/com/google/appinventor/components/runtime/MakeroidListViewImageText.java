package com.google.appinventor.components.runtime;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.util.KodularUtil;
import com.google.appinventor.components.runtime.util.MediaUtil;
import com.google.appinventor.components.runtime.util.TextViewUtil;
import com.google.appinventor.components.runtime.util.YailList;
import java.util.ArrayList;

@DesignerComponent(category = ComponentCategory.LISTVIEWS, description = "This is a visible component that displays a list of a image and two labels", helpUrl = "https://docs.kodular.io/components/user-interface/list-view-image-and-text/", iconName = "images/listView.png", version = 4)
@UsesLibraries({"glide.jar"})
@SimpleObject
@UsesPermissions({"android.permission.INTERNET"})
public class MakeroidListViewImageText extends MakeroidListViewBase {
    private int ATBpAON767TQmZZYK3lMfxQA5S6eF21JqXY9TAJY6l4cbZGeVMlZehfHdCrTaqio = 0;
    /* access modifiers changed from: private */
    public boolean JTEvmldvMjbbtPPlVS4hmZghOoRNnXC0kZOUUAZdwkVNl1VM5pL0vCTYv5HQZ7AX = false;
    /* access modifiers changed from: private */
    public boolean MYUGxENNZgpsWEBTVSKDauXfXur6zyPKrPdlATl7m89YCcguzmIKP8wXNDkxMYaw = false;
    private boolean RC7PBJGdnqEffr8752ypFkbK8qZYkmQ3ci6maWfntRZXmeHa8bLhdKUgkXcpRo6T = false;
    private String TcZoKXUijRhvOFm1gZ0ppEfXWxECqlUNNvncSPIfT3ZrTDcozo05OAb21mkMXciT = "";
    private int XBLVE91Zp5kvRRn2aG2d0scvywAN7zOQf8gZkaueK9XPU163NLSIe4vWoTpXMo6u = 0;
    private boolean gKFqoeV0mIepwKqPzQqyF42NDV4lXNBYlbBqvrWypn3hvG8Ace2UniGxwzdDn1SZ = false;
    private float gti6bIqu0aXgALoDtkq1foMnPcdzXO0EAPAgw4lcaEF132GirFLns82VqwKc8x6R = 14.0f;
    private int hqHtvKVLFGgMVMSKZM3hViIxQKdIh8YXfZOV4lmVWV1e2Mndp07BOheWTgPW1jrN = 1;
    private ListAdapter hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

    /* renamed from: hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME  reason: collision with other field name */
    private ArrayList<ArrayList<String>> f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
    private float n86Bi3TT8lkq4OIAY6TQzz40yEQcROLeML3EOzGKfDOtlcMXWXcB7P2XOFzT0DDv = 14.0f;
    private boolean pFeTJgO2w7vELkZyStZDj0uZpMYRqdjcmMjC2zcPDquoynj4tIsgJjD3RDJtFf88 = false;
    private String pixa37in9tdgjNQb2jpfjxTaBGtatW1GnEvNM302mGQljyvLBwDosTGoRPcRGYok = "";
    private int size = 1;
    private int titleColor = 0;
    private int xy1Y0dkIX1oFLPndkUFF3zQF6ijcSVPdmgekjoDrBgvDBhvpj0INgajUPNaUhxY6 = 0;
    private boolean z819s2db3SwWOaVhKbPTp947sGRXlCsEqH9IfB6VLe6W07abBod2oRho8IvcelHj = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MakeroidListViewImageText(ComponentContainer componentContainer) {
        super(componentContainer, 1);
        ArrayList<ArrayList<String>> arrayList;
        new ArrayList<>();
        this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = arrayList;
        TextViewUtil.setContext(this.context);
        ItemSize(1);
        ImageSide(1);
        TitleTextSize(this.n86Bi3TT8lkq4OIAY6TQzz40yEQcROLeML3EOzGKfDOtlcMXWXcB7P2XOFzT0DDv);
        TitleBold(this.gKFqoeV0mIepwKqPzQqyF42NDV4lXNBYlbBqvrWypn3hvG8Ace2UniGxwzdDn1SZ);
        TitleColor(DEFAULT_PRIMARY_TEXT_COLOR);
        TitleFontTypeface(this.XBLVE91Zp5kvRRn2aG2d0scvywAN7zOQf8gZkaueK9XPU163NLSIe4vWoTpXMo6u);
        TitleFontTypefaceImport("");
        TitleHTML(this.MYUGxENNZgpsWEBTVSKDauXfXur6zyPKrPdlATl7m89YCcguzmIKP8wXNDkxMYaw);
        TitleItalic(this.z819s2db3SwWOaVhKbPTp947sGRXlCsEqH9IfB6VLe6W07abBod2oRho8IvcelHj);
        SubtitleTextSize(this.gti6bIqu0aXgALoDtkq1foMnPcdzXO0EAPAgw4lcaEF132GirFLns82VqwKc8x6R);
        SubtitleBold(this.RC7PBJGdnqEffr8752ypFkbK8qZYkmQ3ci6maWfntRZXmeHa8bLhdKUgkXcpRo6T);
        SubtitleColor(DEFAULT_SECONDARY_TEXT_COLOR);
        SubtitleFontTypeface(this.xy1Y0dkIX1oFLPndkUFF3zQF6ijcSVPdmgekjoDrBgvDBhvpj0INgajUPNaUhxY6);
        SubtitleFontTypefaceImport("");
        SubtitleHTML(this.JTEvmldvMjbbtPPlVS4hmZghOoRNnXC0kZOUUAZdwkVNl1VM5pL0vCTYv5HQZ7AX);
        SubtitleItalic(this.pFeTJgO2w7vELkZyStZDj0uZpMYRqdjcmMjC2zcPDquoynj4tIsgJjD3RDJtFf88);
    }

    public void click(int i) {
        int i2 = i;
        try {
            Click(i2, (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(1), (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(2), (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(0));
        } catch (ArrayIndexOutOfBoundsException e) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
        }
    }

    public void longClick(int i) {
        int i2 = i;
        try {
            LongClick(i2, (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(1), (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(2), (String) this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(i2).get(0));
        } catch (ArrayIndexOutOfBoundsException e) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
        }
    }

    @SimpleEvent(description = "Triggers when the user clicks on a item in the list")
    public void Click(int i, String str, String str2, String str3) {
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        Object[] objArr2 = objArr;
        objArr2[1] = str;
        Object[] objArr3 = objArr2;
        objArr3[2] = str2;
        Object[] objArr4 = objArr3;
        objArr4[3] = str3;
        boolean dispatchEvent = EventDispatcher.dispatchEvent(this, "Click", objArr4);
    }

    @SimpleEvent(description = "Triggers when the user long clicks on a item in the list")
    public void LongClick(int i, String str, String str2, String str3) {
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        Object[] objArr2 = objArr;
        objArr2[1] = str;
        Object[] objArr3 = objArr2;
        objArr3[2] = str2;
        Object[] objArr4 = objArr3;
        objArr4[3] = str3;
        boolean dispatchEvent = EventDispatcher.dispatchEvent(this, "LongClick", objArr4);
    }

    @SimpleFunction(description = "Add a item to the list")
    public void AddItem(String str, String str2, String str3) {
        ArrayList arrayList;
        new ArrayList();
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        boolean add = arrayList2.add(str);
        boolean add2 = arrayList3.add(str2);
        boolean add3 = arrayList3.add(str3);
        boolean add4 = this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.add(arrayList3);
        this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
    }

    @SimpleFunction(description = "Add a item to the list")
    public void AddItemFromList(YailList yailList) throws ArrayIndexOutOfBoundsException {
        YailList yailList2 = yailList;
        AddItem(yailList2.getString(0), yailList2.getString(1), yailList2.getString(2));
    }

    @SimpleFunction(description = "Remove all the items from the list")
    public void ClearList() {
        this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.clear();
        this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
    }

    @SimpleFunction(description = "Update a item of the list")
    public void UpdateItem(int i, String str, String str2, String str3) throws ArrayIndexOutOfBoundsException {
        ArrayList arrayList;
        new ArrayList();
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        boolean add = arrayList2.add(str);
        boolean add2 = arrayList3.add(str2);
        boolean add3 = arrayList3.add(str3);
        ArrayList<String> arrayList4 = this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.set(i, arrayList3);
        this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
    }

    @SimpleFunction(description = "Remove a item from the list")
    public void RemoveItem(int i) throws ArrayIndexOutOfBoundsException {
        ArrayList<String> remove = this.f166hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.remove(i);
        this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.notifyDataSetChanged();
    }

    @DesignerProperty(defaultValue = "1", editorType = "list_item_size")
    @SimpleProperty(description = "Set ListItem Size.\nSet it to 1 for Normal size, 2 for Small size and 3 for Big size.")
    public void ItemSize(int i) {
        this.size = i;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE, description = "Returns ListItem size")
    public int ItemSize() {
        return this.size;
    }

    @DesignerProperty(defaultValue = "1", editorType = "left_right")
    @SimpleProperty(description = "Set the side of the image.\nSet it to 1 for Left side and 2 for Right side")
    public void ImageSide(int i) {
        this.hqHtvKVLFGgMVMSKZM3hViIxQKdIh8YXfZOV4lmVWV1e2Mndp07BOheWTgPW1jrN = i;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE, description = "Returns the Image Side")
    public int ImageSide() {
        return this.hqHtvKVLFGgMVMSKZM3hViIxQKdIh8YXfZOV4lmVWV1e2Mndp07BOheWTgPW1jrN;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean")
    @SimpleProperty(description = "Whether the title should be in bold text")
    public void TitleBold(boolean z) {
        this.gKFqoeV0mIepwKqPzQqyF42NDV4lXNBYlbBqvrWypn3hvG8Ace2UniGxwzdDn1SZ = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean TitleBold() {
        return this.gKFqoeV0mIepwKqPzQqyF42NDV4lXNBYlbBqvrWypn3hvG8Ace2UniGxwzdDn1SZ;
    }

    @DesignerProperty(defaultValue = "&HFF212121", editorType = "color")
    @SimpleProperty(description = "Changed the color of the title text")
    public void TitleColor(int i) {
        int i2 = i;
        this.titleColor = i2 == 0 ? DEFAULT_PRIMARY_TEXT_COLOR : i2;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public int TitleColor() {
        return this.titleColor;
    }

    @DesignerProperty(defaultValue = "0", editorType = "typeface")
    @SimpleProperty(description = "Change the Typeface of the Title", userVisible = false)
    public void TitleFontTypeface(int i) {
        this.XBLVE91Zp5kvRRn2aG2d0scvywAN7zOQf8gZkaueK9XPU163NLSIe4vWoTpXMo6u = i;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public int TitleFontTypeface() {
        return this.XBLVE91Zp5kvRRn2aG2d0scvywAN7zOQf8gZkaueK9XPU163NLSIe4vWoTpXMo6u;
    }

    @DesignerProperty(defaultValue = "", editorType = "font_asset", propertyType = "advanced")
    @SimpleProperty(description = "Set a custom title font.")
    public void TitleFontTypefaceImport(String str) {
        String str2 = str;
        this.TcZoKXUijRhvOFm1gZ0ppEfXWxECqlUNNvncSPIfT3ZrTDcozo05OAb21mkMXciT = str2;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean", propertyType = "advanced")
    @SimpleProperty(description = "If true, then the title will show html text else it will show plain text. Note: Not all HTML is supported.")
    public void TitleHTML(boolean z) {
        this.MYUGxENNZgpsWEBTVSKDauXfXur6zyPKrPdlATl7m89YCcguzmIKP8wXNDkxMYaw = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean TitleHTML() {
        return this.MYUGxENNZgpsWEBTVSKDauXfXur6zyPKrPdlATl7m89YCcguzmIKP8wXNDkxMYaw;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean")
    @SimpleProperty(description = "Whether the title should be in italic text")
    public void TitleItalic(boolean z) {
        this.z819s2db3SwWOaVhKbPTp947sGRXlCsEqH9IfB6VLe6W07abBod2oRho8IvcelHj = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean TitleItalic() {
        return this.z819s2db3SwWOaVhKbPTp947sGRXlCsEqH9IfB6VLe6W07abBod2oRho8IvcelHj;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean")
    @SimpleProperty(description = "Whether the subtitle should be in bold text")
    public void SubtitleBold(boolean z) {
        this.RC7PBJGdnqEffr8752ypFkbK8qZYkmQ3ci6maWfntRZXmeHa8bLhdKUgkXcpRo6T = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @DesignerProperty(defaultValue = "&HFF757575", editorType = "color")
    @SimpleProperty(description = "Changed the color of the subtitle text")
    public void SubtitleColor(int i) {
        int i2 = i;
        this.ATBpAON767TQmZZYK3lMfxQA5S6eF21JqXY9TAJY6l4cbZGeVMlZehfHdCrTaqio = i2 == 0 ? DEFAULT_SECONDARY_TEXT_COLOR : i2;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public int SubtitleColor() {
        return this.ATBpAON767TQmZZYK3lMfxQA5S6eF21JqXY9TAJY6l4cbZGeVMlZehfHdCrTaqio;
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean SubtitleBold() {
        return this.RC7PBJGdnqEffr8752ypFkbK8qZYkmQ3ci6maWfntRZXmeHa8bLhdKUgkXcpRo6T;
    }

    @DesignerProperty(defaultValue = "0", editorType = "typeface")
    @SimpleProperty(description = "Change the Typeface of the Subtitle", userVisible = false)
    public void SubtitleFontTypeface(int i) {
        this.xy1Y0dkIX1oFLPndkUFF3zQF6ijcSVPdmgekjoDrBgvDBhvpj0INgajUPNaUhxY6 = i;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public int SubtitleFontTypeface() {
        return this.xy1Y0dkIX1oFLPndkUFF3zQF6ijcSVPdmgekjoDrBgvDBhvpj0INgajUPNaUhxY6;
    }

    @DesignerProperty(defaultValue = "", editorType = "font_asset", propertyType = "advanced")
    @SimpleProperty(description = "Set a custom title font.")
    public void SubtitleFontTypefaceImport(String str) {
        String str2 = str;
        this.pixa37in9tdgjNQb2jpfjxTaBGtatW1GnEvNM302mGQljyvLBwDosTGoRPcRGYok = str2;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean", propertyType = "advanced")
    @SimpleProperty(description = "If true, then the subtitle will show html text else it will show plain text. Note: Not all HTML is supported.")
    public void SubtitleHTML(boolean z) {
        this.JTEvmldvMjbbtPPlVS4hmZghOoRNnXC0kZOUUAZdwkVNl1VM5pL0vCTYv5HQZ7AX = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean SubtitleHTML() {
        return this.JTEvmldvMjbbtPPlVS4hmZghOoRNnXC0kZOUUAZdwkVNl1VM5pL0vCTYv5HQZ7AX;
    }

    @DesignerProperty(defaultValue = "False", editorType = "boolean")
    @SimpleProperty(description = "Whether the subtitle should be in italic text")
    public void SubtitleItalic(boolean z) {
        this.pFeTJgO2w7vELkZyStZDj0uZpMYRqdjcmMjC2zcPDquoynj4tIsgJjD3RDJtFf88 = z;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(category = PropertyCategory.APPEARANCE)
    public boolean SubtitleItalic() {
        return this.pFeTJgO2w7vELkZyStZDj0uZpMYRqdjcmMjC2zcPDquoynj4tIsgJjD3RDJtFf88;
    }

    @DesignerProperty(defaultValue = "14", editorType = "non_negative_float")
    @SimpleProperty(description = "The text size of the title.")
    public void TitleTextSize(float f) {
        this.n86Bi3TT8lkq4OIAY6TQzz40yEQcROLeML3EOzGKfDOtlcMXWXcB7P2XOFzT0DDv = f;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(description = "Return the text size of the title.")
    public float TitleTextSize() {
        return this.n86Bi3TT8lkq4OIAY6TQzz40yEQcROLeML3EOzGKfDOtlcMXWXcB7P2XOFzT0DDv / this.context.getResources().getDisplayMetrics().scaledDensity;
    }

    @DesignerProperty(defaultValue = "14", editorType = "non_negative_float")
    @SimpleProperty(description = "The text size of the subtitle.")
    public void SubtitleTextSize(float f) {
        this.gti6bIqu0aXgALoDtkq1foMnPcdzXO0EAPAgw4lcaEF132GirFLns82VqwKc8x6R = f;
        LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn();
    }

    @SimpleProperty(description = "Return the text size of the subtitle.")
    public float SubtitleTextSize() {
        return this.gti6bIqu0aXgALoDtkq1foMnPcdzXO0EAPAgw4lcaEF132GirFLns82VqwKc8x6R / this.context.getResources().getDisplayMetrics().scaledDensity;
    }

    private void LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn() {
        ListAdapter listAdapter;
        new ListAdapter(this);
        this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = listAdapter;
        this.recyclerView.setAdapter(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
    }

    public class ListAdapter extends RecyclerView.Adapter<a> {
        final /* synthetic */ MakeroidListViewImageText hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

        public ListAdapter(MakeroidListViewImageText makeroidListViewImageText) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = makeroidListViewImageText;
            int i = Log.i("ListViewImageText", "ListAdapter Created");
        }

        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            StringBuilder sb;
            a aVar;
            ViewGroup viewGroup2 = viewGroup;
            int i2 = i;
            LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
            Resources resources = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.context.getResources();
            new StringBuilder("makeroid_list_image_text_");
            new a(this, from.inflate(resources.getIdentifier(sb.append(MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME)).append(MakeroidListViewImageText.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME)).toString(), "layout", this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.context.getPackageName()), viewGroup2, false));
            return aVar;
        }

        public void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            ArrayList arrayList = (ArrayList) MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).get(i);
            if (Build.VERSION.SDK_INT >= 21) {
                KodularUtil.LoadPicture(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.context, (String) arrayList.get(0), aVar2.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.isCompanion);
            } else {
                try {
                    aVar2.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setImageBitmap(MediaUtil.getBitmapDrawable(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form, (String) arrayList.get(0)).getBitmap());
                } catch (Exception e) {
                    int e2 = Log.e("ListViewImageText", String.valueOf(e));
                }
            }
            TextViewUtil.setTextColor(aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            TextViewUtil.setTextColor(aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, MakeroidListViewImageText.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            TextViewUtil.setFontSize(aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            TextViewUtil.setFontSize(aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, MakeroidListViewImageText.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            if (MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME) == null || MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).isEmpty()) {
                TextViewUtil.setFontTypeface(aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            } else {
                TextViewUtil.setCustomFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form, aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            }
            if (MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME) == null || MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).isEmpty()) {
                TextViewUtil.setFontTypeface(aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            } else {
                TextViewUtil.setCustomFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form, aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME), MakeroidListViewImageText.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
            }
            if (((String) arrayList.get(1)).length() > 0) {
                aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R.setVisibility(0);
                if (this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.MYUGxENNZgpsWEBTVSKDauXfXur6zyPKrPdlATl7m89YCcguzmIKP8wXNDkxMYaw) {
                    TextViewUtil.setTextHTML(aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, (String) arrayList.get(1));
                } else {
                    TextViewUtil.setText(aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, (String) arrayList.get(1));
                }
            } else {
                aVar2.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R.setVisibility(8);
            }
            if (((String) arrayList.get(2)).length() > 0) {
                aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE.setVisibility(0);
                if (this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.JTEvmldvMjbbtPPlVS4hmZghOoRNnXC0kZOUUAZdwkVNl1VM5pL0vCTYv5HQZ7AX) {
                    TextViewUtil.setTextHTML(aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, (String) arrayList.get(2));
                } else {
                    TextViewUtil.setText(aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE, (String) arrayList.get(2));
                }
            } else {
                aVar2.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE.setVisibility(8);
            }
        }

        public int getItemCount() {
            return MakeroidListViewImageText.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).size();
        }

        class a extends RecyclerView.ViewHolder {
            private /* synthetic */ ListAdapter B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
            ImageView hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
            TextView qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;
            TextView vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            a(com.google.appinventor.components.runtime.MakeroidListViewImageText.ListAdapter r10, android.view.View r11) {
                /*
                    r9 = this;
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r0
                    r4 = r1
                    r3.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = r4
                    r3 = r0
                    r4 = r2
                    r3.<init>(r4)
                    r3 = r0
                    r4 = r2
                    r5 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r5 = r5.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r5 = r5.context
                    android.content.res.Resources r5 = r5.getResources()
                    java.lang.String r6 = "image"
                    java.lang.String r7 = "id"
                    r8 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r8 = r8.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r8 = r8.context
                    java.lang.String r8 = r8.getPackageName()
                    int r5 = r5.getIdentifier(r6, r7, r8)
                    android.view.View r4 = r4.findViewById(r5)
                    android.widget.ImageView r4 = (android.widget.ImageView) r4
                    r3.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = r4
                    r3 = r0
                    r4 = r2
                    r5 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r5 = r5.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r5 = r5.context
                    android.content.res.Resources r5 = r5.getResources()
                    java.lang.String r6 = "title"
                    java.lang.String r7 = "id"
                    r8 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r8 = r8.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r8 = r8.context
                    java.lang.String r8 = r8.getPackageName()
                    int r5 = r5.getIdentifier(r6, r7, r8)
                    android.view.View r4 = r4.findViewById(r5)
                    android.widget.TextView r4 = (android.widget.TextView) r4
                    r3.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R = r4
                    r3 = r0
                    r4 = r2
                    r5 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r5 = r5.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r5 = r5.context
                    android.content.res.Resources r5 = r5.getResources()
                    java.lang.String r6 = "subtitle"
                    java.lang.String r7 = "id"
                    r8 = r1
                    com.google.appinventor.components.runtime.MakeroidListViewImageText r8 = r8.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME
                    android.content.Context r8 = r8.context
                    java.lang.String r8 = r8.getPackageName()
                    int r5 = r5.getIdentifier(r6, r7, r8)
                    android.view.View r4 = r4.findViewById(r5)
                    android.widget.TextView r4 = (android.widget.TextView) r4
                    r3.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.MakeroidListViewImageText.ListAdapter.a.<init>(com.google.appinventor.components.runtime.MakeroidListViewImageText$ListAdapter, android.view.View):void");
            }
        }
    }
}
