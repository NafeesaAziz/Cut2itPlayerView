package com.cut2it.playerviewlibrary01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cut2it.playerviewlibrary01.avcommunication.AVCommunication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AVCommunication avCommunication = new AVCommunication(this);
        VideoPlayerView videoPlayerView = findViewById(R.id.player);
        avCommunication.makeStream(videoPlayerView,"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");

    }
}
