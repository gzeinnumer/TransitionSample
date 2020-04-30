package com.gzeinnumer.transitionsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleLoginClick();
            }
        });
    }

    private void handleLoginClick(){
        Log.d(TAG, "handleLoginClick: ");
        Intent i =  new Intent(this, MainActivity.class);
        i.putExtra("num", num+1);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in_anim,R.anim.fade_out_anim);
        //pilihan
        //blink_anim
        //entry_anim
        //exit_anim
        //fade_in_anim
        //fade_out_anim
        //move_anim
        //ratate_anim
        //slide_down_anim
        //slide_left_anim
        //slide_right_anim
        //slide_up_anim
        //zoom_in_anim
        //zoom_out_anim

    }

    @Override
    protected void onStart() {
        super.onStart();
        num = getIntent().getIntExtra("num",0);
        Log.d(TAG, "onStart: "+num);
        setTitle("Num "+ num);
    }
}
