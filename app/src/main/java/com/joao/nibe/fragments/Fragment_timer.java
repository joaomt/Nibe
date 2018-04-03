package com.joao.nibe.fragments;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.joao.nibe.R;
import com.joao.nibe.activity.Activity_timers;
import com.joao.nibe.adapter.TimerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_timer extends Fragment {
    private NumberPicker np_hour,nb_minute,nb_seconds;
    private TextView txt_definir_timer_info;
    public static int hour=0,minute=0,seconds=0,time_total=0;
    private Button btn_iniciar;

    public Fragment_timer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_timer, container, false);

        np_hour = view.findViewById(R.id.np_hour);
        np_hour.setMaxValue(99);
        np_hour.setMinValue(0);
        np_hour.setDividerPadding(10);
        np_hour.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);


        nb_minute = view.findViewById(R.id.nb_minute);
        nb_minute.setMaxValue(60);
        nb_minute.setMinValue(0);
        nb_minute.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        nb_seconds = view.findViewById(R.id.nb_seconds);
        nb_seconds.setMaxValue(60);
        nb_seconds.setMinValue(0);
        nb_seconds.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        Typeface rb_light = Typeface.createFromAsset(getActivity().getAssets(),"Roboto-Light.ttf");
        txt_definir_timer_info = view.findViewById(R.id.txt_tt);
        txt_definir_timer_info.setTypeface(rb_light);

        //np_hour.setDividerDrawable(R.color.colorPrimary);
        //np_hour.setDividerColor(ContextCompat.getColor(this, R.color.colorPrimary));

        btn_iniciar = view.findViewById(R.id.btn_iniciar);
        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hour  = np_hour.getValue();
                minute = nb_minute.getValue();
                seconds = nb_seconds.getValue();
                time_total = ((hour*3600)*1000)+(minute*60000)+seconds*1000;
                if(hour == 0 & minute == 0 & seconds == 0){
                    Toast.makeText(getActivity(),"Defina um tempo",Toast.LENGTH_LONG).show();
                }else {
                    Intent it = new Intent(getActivity(), Activity_timers.class);
                    startActivity(it);
                }
            }
        });


        return view;
    }

}
