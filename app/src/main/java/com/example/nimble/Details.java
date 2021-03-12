package com.example.nimble;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.b2);

        MediaController mediaController = new MediaController(this);
       mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
        Log.d("MainActivity:", "onCreate: created activity_main.xml UI successfully.");

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Details.this, MainActivity.class));
                finish();

                Log.d("MainActivity:", "onCreate: waiting 5 seconds for MainActivity... loading PrimaryActivity.class");
            }
        }, 1500 );
    }

}