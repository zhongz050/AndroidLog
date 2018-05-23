package com.zz.loglibrary.log;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/**
 * Created by bevis.zhong on 2018/5/9.
 */

public final class Logger {

    private static IPrintable printer = new Printer();

    public static void setVersionType(boolean isRelease){
        printer.setVersionType(isRelease);
    }

    public static void setVersionType(Context context){
        try {
            ApplicationInfo info = context.getApplicationInfo();
            boolean isRelease = ((info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0);
            printer.setVersionType(isRelease);
        } catch (Exception e) {
            printer.setVersionType(false);
        }
    }

    public static void v(String tag, String content){
        printer.v(tag, content);
    }

    public static void d(String tag, String content){
        printer.d(tag, content);
    }

    public static void i(String tag, String content){
        printer.i(tag, content);
    }

    public static void w(String tag, String content){
        printer.w(tag, content);
    }

    public static void e(String tag, String content){
        printer.e(tag, content);
    }

    public static void v(String tag, String content, Throwable throwable){
        printer.v(tag, content, throwable);
    }

    public static void d(String tag, String content, Throwable throwable){
        printer.d(tag, content, throwable);
    }

    public static void i(String tag, String content, Throwable throwable){
        printer.i(tag, content, throwable);
    }

    public static void w(String tag, String content, Throwable throwable){
        printer.w(tag, content, throwable);
    }

    public static void e(String tag, String content, Throwable throwable){
        printer.e(tag, content, throwable);
    }

}
