package com.joao.nibe.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.joao.nibe.R;
import com.joao.nibe.fragments.Fragment_ajustes;
import com.joao.nibe.fragments.Fragment_alarm;
import com.joao.nibe.fragments.Fragment_cronometro;
import com.joao.nibe.fragments.Fragment_timer;

public class Activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Fragment_alarm frag_alarm = new Fragment_alarm();
        getSupportFragmentManager().beginTransaction().add(R.id.content,frag_alarm).commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_alarm:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.content, frag_alarm);
                        transaction.commit();
                        break;

                    case R.id.action_timer:
                        Fragment_timer frag_timer = new Fragment_timer();
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.content, frag_timer);
                        transaction2.commit();
                        break;

                    case R.id.action_cronom:
                        Fragment_cronometro frag_cronometro = new Fragment_cronometro();
                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                        transaction3.replace(R.id.content, frag_cronometro);
                        transaction3.commit();
                        break;

                    case R.id.action_ajustes:
                        Fragment_ajustes frag_ajustes = new Fragment_ajustes();
                        FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                        transaction4.replace(R.id.content, frag_ajustes);
                        transaction4.commit();
                        break;
                }
                return true;
            }
        });

    }
}
