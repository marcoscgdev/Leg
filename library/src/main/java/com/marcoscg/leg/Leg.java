package com.marcoscg.leg;

import android.text.TextUtils;
import android.util.Log;

public final class Leg {

    public static void d(String message) {
        Log.d(generateTag(null), message);
    }

    public static void d(String message, Throwable tr) {
        Log.d(generateTag(null), message, tr);
    }

    public static void d(String extra, String message) {
        Log.d(generateTag(extra), message);
    }

    public static void d(String extra, String message, Throwable tr) {
        Log.d(generateTag(extra), message, tr);
    }

    public static void e(String message) {
        Log.e(generateTag(null), message);
    }

    public static void e(String message, Throwable tr) {
        Log.e(generateTag(null), message, tr);
    }

    public static void e(String extra, String message) {
        Log.e(generateTag(extra), message);
    }

    public static void e(String extra, String message, Throwable tr) {
        Log.e(generateTag(extra), message, tr);
    }

    public static void i(String message) {
        Log.i(generateTag(null), message);
    }

    public static void i(String message, Throwable tr) {
        Log.i(generateTag(null), message, tr);
    }

    public static void i(String extra, String message) {
        Log.i(generateTag(extra), message);
    }

    public static void i(String extra, String message, Throwable tr) {
        Log.i(generateTag(extra), message, tr);
    }

    public static void v(String message) {
        Log.v(generateTag(null), message);
    }

    public static void v(String message, Throwable tr) {
        Log.v(generateTag(null), message, tr);
    }

    public static void v(String extra, String message) {
        Log.v(generateTag(extra), message);
    }

    public static void v(String extra, String message, Throwable tr) {
        Log.v(generateTag(extra), message, tr);
    }

    public static void w(String message) {
        Log.w(generateTag(null), message);
    }

    public static void w(String message, Throwable tr) {
        Log.w(generateTag(null), message, tr);
    }

    public static void w(String extra, String message) {
        Log.w(generateTag(extra), message);
    }

    public static void w(String extra, String message, Throwable tr) {
        Log.w(generateTag(extra), message, tr);
    }

    public static void wtf(String message) {
        Log.wtf(generateTag(null), message);
    }

    public static void wtf(String message, Throwable tr) {
        Log.wtf(generateTag(null), message, tr);
    }

    public static void wtf(String extra, String message) {
        Log.wtf(generateTag(extra), message);
    }

    public static void wtf(String extra, String message, Throwable tr) {
        Log.wtf(generateTag(extra), message, tr);
    }

    private static String generateTag(String extra) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];

        String tag = getBaseFileName(stackTraceElement.getFileName()) + "." +
                stackTraceElement.getMethodName();

        if (extra != null && !TextUtils.isEmpty(extra))
            tag += " " + extra;

        return tag;
    }

    private static String getBaseFileName(String fileName) {
        if (fileName == null || TextUtils.isEmpty(fileName) || !fileName.contains("."))
            return fileName;

        return fileName.substring(0, fileName.lastIndexOf("."));
    }

}
