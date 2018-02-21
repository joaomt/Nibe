package com.joao.nibe.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.joao.nibe.R;
import com.joao.nibe.utils.fonts_text;

public class Activity_login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface rb_light = Typeface.createFromAsset(getAssets(),"Roboto-Light.ttf");
        Typeface rb_regular = Typeface.createFromAsset(getAssets(),"Roboto-Regular.ttf");
        Typeface rb_medium = Typeface.createFromAsset(getAssets(),"Roboto-Medium.ttf");

        TextView txt_cad = findViewById(R.id.txt_cad); // roboto Light
        TextView txt_nibe = findViewById(R.id.txt_NiBe); // roboto Regular
        TextView txt_usar = findViewById(R.id.txt_usar); // light
        TextView txt_termos = findViewById(R.id.txt_termos); // light
        TextView txt_termos_uso = findViewById(R.id.txt_termos_uso); // medium

        txt_cad.setTypeface(rb_light);
        txt_nibe.setTypeface(rb_regular);
        txt_usar.setTypeface(rb_light);
        txt_termos.setTypeface(rb_light);
        txt_termos_uso.setTypeface(rb_medium);

        Button btn_entrar = (Button) findViewById(R.id.btn_entrar);
        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Activity_login.this,Activity_home.class);
                startActivity(it);
            }
        });
    }
}
