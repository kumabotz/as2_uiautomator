package com.uia.as2.tests.devices;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class XiaoMi extends UiAutomatorTestCase implements Device {
    private final UiDevice mUiDevice;

    public XiaoMi() {
        mUiDevice = UiDevice.getInstance();
    }

    @Override
    public void exitApp() throws RemoteException, UiObjectNotFoundException {
        mUiDevice.pressHome();
        mUiDevice.pressRecentApps();
        sleep(500);
        new UiObject(new UiSelector().text("AutoSync2 Free")).swipeUp(40);
    }
}
