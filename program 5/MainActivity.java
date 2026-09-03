package com.example.myapplication5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.editTextText);
        t2 = findViewById(R.id.editTextText2);
        t3 = findViewById(R.id.editTextText3);
        bt = findViewById(R.id.button);

        bt.setOnClickListener(v -> {

            String name = t1.getText().toString();
            String email = t2.getText().toString();
            String phone = t3.getText().toString();

            SharedPreferences sp = getSharedPreferences("UserData", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("name", name);
            editor.putString("email", email);
            editor.putString("phone", phone);

            editor.commit();

            Toast.makeText(MainActivity.this,
                    "Registration Successful",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("username", name);
            startActivity(intent);
        });
    }
}
