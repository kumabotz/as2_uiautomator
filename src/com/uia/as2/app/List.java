package com.uia.as2.app;

import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

public class List {
    private final UiScrollable mList;
    private final String mLayoutClass;

    public List(String layoutClass) {
        mList = new UiScrollable(
                new UiSelector().className(android.widget.ListView.class.getName()));
        mLayoutClass = layoutClass;
    }

    public UiScrollable getList() {
        return mList;
    }

    public String getLayoutClass() {
        return mLayoutClass;
    }
}
