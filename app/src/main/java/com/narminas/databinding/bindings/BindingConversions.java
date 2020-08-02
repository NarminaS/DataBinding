package com.narminas.databinding.bindings;

import android.view.View;

import androidx.databinding.BindingConversion;

public class BindingConversions {
    private BindingConversions() { throw new AssertionError(); }

    @BindingConversion
    public static int convertBooleanToVisibility(boolean visible) {
        return visible ? View.VISIBLE : View.GONE;
    }
}
