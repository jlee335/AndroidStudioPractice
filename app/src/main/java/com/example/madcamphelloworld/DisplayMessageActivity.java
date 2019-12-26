package com.example.madcamphelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message); //display xml?
        Intent intent = getIntent();
        // intent 를 가져옴
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // MainActivity 에서 넘겨받은 변수 이용 (string)
        TextView textView = (TextView) findViewById(R.id.textView2); // activity 안에서 UI 찾기!
        textView.setText(message);
    }
}
