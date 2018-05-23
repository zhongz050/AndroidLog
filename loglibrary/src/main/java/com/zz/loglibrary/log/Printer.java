package com.zz.loglibrary.log;

import android.util.Log;

/**
 * Created by bevis.zhong on 2018/5/9.
 */

final class Printer implements IPrintable {

    private boolean isRelease = false;

    @Override
    public void setVersionType(boolean isRelease) {
        this.isRelease = isRelease;
    }

    @Override
    public void v(String tag, String content) {
        if(isRelease) {
            return;
        }
        Log.v(tag, content);
    }

    @Override
    public void d(String tag, String content) {
        if(isRelease) {
            return;
        }
        Log.d(tag, content);
    }

    @Override
    public void i(String tag, String content) {
        if(isRelease) {
            return;
        }
        Log.i(tag, content);
    }

    @Override
    public void w(String tag, String content) {
        if(isRelease) {
            return;
        }
        Log.w(tag, content);
    }

    @Override
    public void e(String tag, String content) {
        if(isRelease) {
            return;
        }
        Log.e(tag, content);
    }

    @Override
    public void v(String tag, String content, Throwable throwable) {
        if(isRelease) {
            return;
        }
        Log.v(tag, content, throwable);
    }

    @Override
    public void d(String tag, String content, Throwable throwable) {
        if(isRelease) {
            return;
        }
        Log.d(tag, content, throwable);
    }

    @Override
    public void i(String tag, String content, Throwable throwable) {
        if(isRelease) {
            return;
        }
        Log.i(tag, content, throwable);
    }

    @Override
    public void w(String tag, String content, Throwable throwable) {
        if(isRelease) {
            return;
        }
        Log.w(tag, content, throwable);
    }

    @Override
    public void e(String tag, String content, Throwable throwable) {
        if(isRelease) {
            return;
        }
        Log.e(tag, content, throwable);
    }

}
