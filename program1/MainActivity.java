package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b1;
TextView t1,t2, t3;
EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        e1 = findViewById(R.id.editTextText2);
        e2 = findViewById(R.id.editTextTextPassword);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = e1.getText().toString();
                String p = e2.getText().toString();

                if (n.equals("abc") && p.equals("123")) {
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this,"invalid credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
