package com.zz.loglibrary.log;

/**
 * Created by bevis.zhong on 2018/5/9.
 */

interface IPrintable {
    void setVersionType(boolean isRelease);
    void v(String tag, String content);
    void d(String tag, String content);
    void i(String tag, String content);
    void w(String tag, String content);
    void e(String tag, String content);
    void v(String tag, String content, Throwable throwable);
    void d(String tag, String content, Throwable throwable);
    void i(String tag, String content, Throwable throwable);
    void w(String tag, String content, Throwable throwable);
    void e(String tag, String content, Throwable throwable);
}
