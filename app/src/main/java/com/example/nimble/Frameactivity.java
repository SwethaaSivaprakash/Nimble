package com.example.nimble;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Frameactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.frame);

        Log.d("MainActivity:", "onCreate: created activity_main.xml UI succesfully.");

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Frameactivity.this, Details.class));
                finish();

                Log.d("MainActivity:", "onCreate: waiting 5 seconds for MainActivity... loading PrimaryActivity.class");
            }
        }, 2000 );
    }


}

