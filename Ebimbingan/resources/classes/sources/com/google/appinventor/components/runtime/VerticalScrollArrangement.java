package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.ComponentConstants;

@SimpleObject
@DesignerComponent(category = ComponentCategory.LAYOUT_GENERAL, description = "<p>A formatting element in which to place components that should be displayed one below another.  (The first child component is stored on top, the second beneath it, etc.)  If you wish to have components displayed next to one another, use <code>HorizontalArrangement</code> instead.</p><p> This version is scrollable", iconName = "images/verticalScroll.png", version = 7)
public class VerticalScrollArrangement extends HVArrangement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalScrollArrangement(ComponentContainer componentContainer) {
        super(componentContainer, 1, ComponentConstants.SCROLLABLE_ARRANGEMENT);
    }
}
