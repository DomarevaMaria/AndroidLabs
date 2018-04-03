package com.example.masha.testapplication;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MyFirstActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonHello;
    private CheckBox cbMusic, cbSport, cbSerials;
    private ImageView iwMusic, iwSport, iwSerials;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        buttonHello = (Button)findViewById(R.id.bHello);
        cbMusic = (CheckBox)findViewById(R.id.cbMusic);
        cbSport = (CheckBox)findViewById(R.id.cbSport);
        cbSerials = (CheckBox)findViewById(R.id.cbSerials);
        iwMusic = (ImageView)findViewById(R.id.iwMusic);
        iwSport = (ImageView)findViewById(R.id.iwSport);
        iwSerials = (ImageView)findViewById(R.id.iwSerials);
        etName = (EditText)findViewById(R.id.etName);

        iwMusic.setVisibility(View.INVISIBLE);
        iwSport.setVisibility(View.INVISIBLE);
        iwSerials.setVisibility(View.INVISIBLE);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id){
                    case R.id.rbBoy: buttonHello.setBackgroundColor(Color.parseColor("#A9E2F3"));
                        break;

                    case R.id.rbGirl: buttonHello.setBackgroundColor(Color.parseColor("#F5A9F2"));
                        break;
                }
            }
        });

        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                switch (compoundButton.getId()){
                    case R.id.cbMusic:
                        iwMusic.setVisibility(isChecked ? View.VISIBLE : View.INVISIBLE);
                        break;

                    case R.id.cbSport:
                        iwSport.setVisibility(isChecked ? View.VISIBLE : View.INVISIBLE);
                        break;

                    case R.id.cbSerials:
                        iwSerials.setVisibility(isChecked ? View.VISIBLE : View.INVISIBLE);
                        break;

                    default:
                        break;
                }
            }
        };
        cbMusic.setOnCheckedChangeListener(onCheckedChangeListener);
        cbSport.setOnCheckedChangeListener(onCheckedChangeListener);
        cbSerials.setOnCheckedChangeListener(onCheckedChangeListener);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello " + etName.getText()+ "!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
