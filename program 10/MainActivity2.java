package com.example.intent;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView e1, e2,e3,e4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity2_main);
        e1 = findViewById(R.id.textView);
        e2 = findViewById(R.id.textView2);
        e3 = findViewById(R.id.textView3);
        e4 = findViewById(R.id.textView4);
        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("age");
        String text2 = extra.getString("place");
        String text3 = extra.getString("college");


        e1.setText(text);
        e2.setText(text1);
        e3.setText(text2);
        e4.setText(text3);
    }
}
