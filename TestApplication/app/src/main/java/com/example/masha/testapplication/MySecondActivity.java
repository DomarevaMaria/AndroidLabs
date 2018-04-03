package com.example.masha.testapplication;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MySecondActivity extends AppCompatActivity {

    private SeekBar sbRed, sbGreen, sbBlue;
    private TextView twColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);

        twColor = (TextView)findViewById(R.id.twColor);

        sbRed = (SeekBar)findViewById(R.id.sbRed);
        sbGreen = (SeekBar)findViewById(R.id.sbGreen);
        sbBlue = (SeekBar)findViewById(R.id.sbBlue);

        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                int red = sbRed.getProgress();
                int green = sbGreen.getProgress();
                int blue = sbBlue.getProgress();
                twColor.setBackgroundColor(Color.rgb(red,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };

        sbRed.setOnSeekBarChangeListener(onSeekBarChangeListener);
        sbGreen.setOnSeekBarChangeListener(onSeekBarChangeListener);
        sbBlue.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}
