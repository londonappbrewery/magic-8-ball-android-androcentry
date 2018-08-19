package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final Random randomNumberGenreator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbutton;
        final ImageView ball_image;

        final int imagesIdArr[] = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askbutton = findViewById(R.id.askbutton);
        ball_image = findViewById(R.id.image_eightBall);

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int number = randomNumberGenreator.nextInt(4);
                    ball_image.setImageResource(imagesIdArr[number]);

            }
        });

    }
}
