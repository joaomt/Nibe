package com.joao.nibe.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.joao.nibe.R;

public class Activity_abertura extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);
        Typeface roboto_sub_logo = Typeface.createFromAsset(getAssets(),"Roboto-Thin.ttf");
        Typeface roboto_logo = Typeface.createFromAsset(getAssets(),"RobotoMono-Light.ttf");

        TextView txtLogo = findViewById(R.id.txt_logo);
        TextView txtSub_Logo = findViewById(R.id.txt_sub_logo);

        txtLogo.setTypeface(roboto_logo);
        txtSub_Logo.setTypeface(roboto_sub_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_abertura.this, Activity_login.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }

}
