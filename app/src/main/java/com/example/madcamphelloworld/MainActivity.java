package com.example.madcamphelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.madcamphelloworld.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        //fab.setOnClickListener(new FABClickListener());
        // FAB 의 클릭 listener 를 시작 시 설정
    }

    //By OnClick, this is tied to the button. Function called when button pressed
    public void buttonDo(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        // 여기서 editText 라는 object 를 id로 찾음... editText 는 텍스트 입력창
        String message = editText.getText().toString();
        // 입력된 text 를 받아서 변수로 저장
        intent.putExtra(EXTRA_MESSAGE,message);
        // activity 를 옮김과 동시에, 새 activity 에 변수를 넘기고 싶을 때!
        startActivity(intent); // intent 를 통해 새 activity 에 접속?
    }

    public void gotoRecycleView(View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent); // intent 를 통해 새 activity 에 접속?
    }



    public void toggle_switch(View view){}


    }
