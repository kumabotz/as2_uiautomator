package com.uia.as2.tests;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.uia.as2.app.App;
import com.uia.as2.devices.DeviceFactory;

public class BaseTest extends UiAutomatorTestCase {
    private App mApp;

    public BaseTest() {
        try {
            // NOTE: this syntax is needed to make it works and i don't know why
            mApp = new App(DeviceFactory.getDevice(getUiDevice().getInstance().getProductName()),
                    "AutoSync2 Free");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mApp.launchApp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        mApp.exitApp();
    }

    protected App getApp() {
        return mApp;
    }
}