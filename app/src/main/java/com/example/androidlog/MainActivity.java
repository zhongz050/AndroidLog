package com.example.androidlog;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zz.loglibrary.log.Logger;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.setVersionType(!isDebug(getApplicationContext()));
        Logger.v(TAG, "v");
        Logger.d(TAG, "d");
        Logger.i(TAG, "i");
        Logger.w(TAG, "w");
        Logger.e(TAG, "e");
    }

    public boolean isDebug(Context context) {
        try {
            ApplicationInfo info = context.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            return false;
        }
    }
}
