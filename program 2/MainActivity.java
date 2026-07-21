package com.example.myapplication2;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private void show(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        show("onCreate()");

        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        show("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        show("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        show("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        show("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        show("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        show("onDestroy()");
    }
}
