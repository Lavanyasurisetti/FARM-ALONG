package com.example.user.biscuit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class V_Upload extends YouTubeBaseActivity {

    Button b1;
    YouTubePlayerView youTubePlayer;
    Button button;
//    ImageButton img;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__upload);
        b1 = (Button)findViewById(R.id.submit);
//        img =(ImageButton)findViewById(R.id.home);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(V_Upload.this, DashboardActivity.class);
//                startActivity(i);
//
//            }
//        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(V_Upload.this,"THANK YOU FOR YOUR RESPONSE", Toast.LENGTH_SHORT).show();
            }
        });
        youTubePlayer =(YouTubePlayerView)findViewById(R.id.youtubeplayer);
        button = findViewById(R.id.buttonplayer);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("NXVCGiM2fXs");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayer.initialize(PlayerConfig.API_KEY, onInitializedListener);
            }
        });


    }
}
