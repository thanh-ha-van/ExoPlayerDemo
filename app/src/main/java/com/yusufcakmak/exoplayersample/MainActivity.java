package com.yusufcakmak.exoplayersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button videoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoButton = (Button) findViewById(R.id.customVideoButton1);

        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Global.typeToPlay = 1;
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });

        videoButton = (Button) findViewById(R.id.customVideoButton2);

        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Global.typeToPlay = 2;
                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
