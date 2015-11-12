package com.example.android

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class ProgressDialogChained extends ProgressDialog {
    private static ProgressDialog instance;

    public ProgressDialogChained(Context context) {
        this(context, com.android.internal.R.style.Theme_Dialog_Alert);
    }

    public ProgressDialogChained(Context context, int theme) {
        super(context, theme);
        this.instance = new ProgressDialog(context, theme);
    }

    public static ProgressDialog show(Context context, CharSequence title,
                                      CharSequence message) {
        instance = instance.show(context, title, message);
        return instance;
    }

    public static ProgressDialog show(Context context, CharSequence title,
                                      CharSequence message, boolean indeterminate) {
        instance = instance.show(context, title, message, indeterminate);
        return instance;
    }

    public static ProgressDialog show(Context context, CharSequence title,
                                      CharSequence message, boolean indeterminate, boolean cancelable) {
        instance = instance.show(context, title, message, indeterminate, cancelable);
        return instance;
    }

    public static ProgressDialog show(Context context, CharSequence title,
                                      CharSequence message, boolean indeterminate,
                                      boolean cancelable, OnCancelListener cancelListener) {
        instance = instance.show(context, title, message, indeterminate, cancelable, cancelListener);
        return instance;
    }

    
    public ProgressDialog setProgress(int value) {
        instance.setProgress(value);
        return instance;
    }

    public ProgressDialog setSecondaryProgress(int secondaryProgress) {
        instance.setSecondaryProgress(secondaryProgress);
        return instance;
    }

    public int getProgress() {
        return instance.getProgress();
    }

    public int getSecondaryProgress() {
        return instance.getSecondaryProgress();
    }

    public int getMax() {
        return instance.getMax();
    }

    public ProgressDialog setMax(int max) {
        instance.setMax(max);
        return instance;
    }

    public ProgressDialog incrementProgressBy(int diff) {
        instance.incrementProgressBy(diff);
        return instance;
    }

    public ProgressDialog incrementSecondaryProgressBy(int diff) {
        instance.incrementSecondaryProgressBy(diff);
        return instance;
    }

    public ProgressDialog setProgressDrawable(Drawable d) {
        instance.setProgressDrawable(d);
        return instance;
    }

    public ProgressDialog setIndeterminateDrawable(Drawable d) {
        instance.setIndeterminateDrawable(d);
        return instance;
    }

    public ProgressDialog setIndeterminate(boolean indeterminate) {
        instance.setIndeterminate(indeterminate);
        return instance;
    }

    public boolean isIndeterminate() {
        return instance.isIndeterminate();
    }

    @Override
    public ProgressDialog setMessage(CharSequence message) {
        instance.setMessage(message);
        return instance;
    }

    public ProgressDialog setProgressStyle(int style) {
        instance.setProgressStyle(style);
        return instance;
    }

    public ProgressDialog setProgressNumberFormat(String format) {
        instance.setProgressNumberFormat(format);
        return instance;
    }


    private void onProgressChanged() {
        //TODO implement workaround for private access modifier
    }
}