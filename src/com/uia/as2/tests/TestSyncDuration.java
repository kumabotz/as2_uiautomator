package com.uia.as2.tests;

import android.os.RemoteException;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.uia.as2.app.App;
import com.uia.as2.app.settings.SyncDuration;

public class TestSyncDuration extends BaseTest {
    private App mApp;
    private SyncDuration mSyncDuration;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mApp = getApp();
        mApp.launchSettings();
        mSyncDuration = new SyncDuration();
    }

    @Override
    protected void tearDown() throws Exception {
        mSyncDuration.reset();
        super.tearDown();
    }

    public void testSaveSyncDuration() throws UiObjectNotFoundException, RemoteException {
        String value = "5 seconds";
        mSyncDuration.save(value);
        relaunchSettings();
        assertEquals("should saved sync duration value", value, mSyncDuration.description());
    }

    private void relaunchSettings() throws UiObjectNotFoundException, RemoteException {
        mApp.relaunch();
        mApp.launchSettings();
    }
}