package com.example.alotaibi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int playing;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playing =0;
        player= new MediaPlayer();
        player= MediaPlayer.create(this, R.raw.sound);

        Button button3= (Button) findViewById(R.id.button);
        Button button4 = (Button) findViewById(R.id.button2);
        ImageView koala = (ImageView) findViewById(R.id.imageView);

        koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing){
                    case 0: player.start();
                            playing=1; break;

                    case 1: player.pause();
                        playing=0; break;
                }



            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });
    }
}