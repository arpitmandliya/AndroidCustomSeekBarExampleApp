package com.java2blog.customseekbarexampleapp;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.java2blog.customseekbarexampleapp.R;

public class MainActivity extends Activity {

    SeekBar customSeekbar;
    TextView progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customSeekbar = (SeekBar)findViewById(R.id.seekBar);
        progress = (TextView)findViewById(R.id.textView);

        customSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                progress.setText( " " + i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });

    }

}
