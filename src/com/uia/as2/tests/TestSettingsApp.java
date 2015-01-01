package com.uia.as2.tests;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.uia.as2.app.App;
import com.uia.as2.app.Option;
import com.uia.as2.app.Settings;

public class TestSettingsApp extends Test {
    private App mApp;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mApp = getApp();
        mApp.launchSettings();
    }

    public void testSmoke() throws UiObjectNotFoundException {
        assertEquals("should navigate to Setting page", "Settings", mApp.actionBarTitle());
        assertEquals("should have list", "Settings", new Settings().listTitle());
        assertEquals("should have default sync duration", "1 minute", new Option(new Settings(),
                "Sync Duration", "1 minute").description());
    }

    public void testUpNavigation() throws UiObjectNotFoundException {
        mApp.up();
        assertEquals("should navigate to App page", "AutoSync2 Free", mApp.actionBarTitle());
    }
}