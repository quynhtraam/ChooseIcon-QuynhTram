package com.example.chooseicon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgQues, imgHappy, imgSad, imgPlane, imgPort, imgNote, imgMoon, imgAndroid;
    int index;

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view){
            if (view.getId()==R.id.imgHappy){
                index = 1;
            } else if (view.getId()==R.id.imgSad){
                index = 2;
            } else if (view.getId()==R.id.imgPlane){
                index = 3;
            } else if (view.getId()==R.id.imgPort){
                index = 4;
            } else if (view.getId()==R.id.imgNote){
                index = 5;
            } else if (view.getId()==R.id.imgMoon){
                index = 6;
            } else {
                index = 7;
            }
            if (index != num){
                (Toast.makeText(getApplicationContext(),"Wrong Icon!", Toast.LENGTH_SHORT)).show();
            } else {
                num = rand.nextInt(7);
                showImgQues(num);
            }
        }
    };

    Random rand = new Random();
    int num = rand.nextInt(7);
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgQues = findViewById(R.id.imgQues);
        imgHappy = findViewById(R.id.imgHappy);
        imgSad = findViewById(R.id.imgSad);
        imgPlane = findViewById(R.id.imgPlane);
        imgPort = findViewById(R.id.imgPort);
        imgNote = findViewById(R.id.imgNote);
        imgMoon = findViewById(R.id.imgMoon);
        imgAndroid = findViewById(R.id.imgAndroid);

        showImgQues(num);

        imgHappy.setOnClickListener(click);
        imgSad.setOnClickListener(click);
        imgPlane.setOnClickListener(click);
        imgPort.setOnClickListener(click);
        imgNote.setOnClickListener(click);
        imgMoon.setOnClickListener(click);
        imgAndroid.setOnClickListener(click);


    }
    private void showImgQues(int num){
        if (num==1){
            imgQues.setImageResource(R.drawable.ic_baseline_emoji_emotions_24);
        } else if (num==2){
            imgQues.setImageResource(R.drawable.ic_baseline_mood_bad_24);
        } else if (num==3){
            imgQues.setImageResource(R.drawable.ic_baseline_airplanemode_active_24);
        } else if (num==4){
            imgQues.setImageResource(R.drawable.ic_baseline_airport_shuttle_24);
        } else if (num==5){
            imgQues.setImageResource(R.drawable.ic_baseline_audiotrack_24);
        } else if (num==6){
            imgQues.setImageResource(R.drawable.ic_baseline_bedtime_24);
        } else {
            imgQues.setImageResource(R.drawable.ic_baseline_android_24);
        }
    }
}