package com.joao.nibe.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.ContextThemeWrapper;

/**
 * Created by joao on 16/02/2018.
 */

public class fonts_text extends ContextThemeWrapper {
    public Typeface rb_light = Typeface.createFromAsset(getAssets(),"Roboto-Light.ttf");
    public Typeface rb_regular = Typeface.createFromAsset(getAssets(),"Roboto-Regular.ttf");
    public Typeface rb_medium = Typeface.createFromAsset(getAssets(),"Roboto-Medium.ttf");
    public final Typeface rb_thin = Typeface.createFromAsset(getAssets(),"Roboto-Thin.ttf");
    public final Typeface rb_mono_light = Typeface.createFromAsset(getAssets(),"RobotoMono-Light.ttf");

    public fonts_text(){}

}
