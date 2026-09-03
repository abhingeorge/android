package com.example.myapplication6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextText, editTextText2;
    Button button, button2, button3, button4;
    TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        textView8 = findViewById(R.id.textView8);

        button.setOnClickListener(v -> {
            double a = Double.parseDouble(editTextText.getText().toString());
            double b = Double.parseDouble(editTextText2.getText().toString());
            textView8.setText("Result = " + (a + b));
        });

        button2.setOnClickListener(v -> {
            double a = Double.parseDouble(editTextText.getText().toString());
            double b = Double.parseDouble(editTextText2.getText().toString());
            textView8.setText("Result = " + (a - b));
        });

        button3.setOnClickListener(v -> {
            double a = Double.parseDouble(editTextText.getText().toString());
            double b = Double.parseDouble(editTextText2.getText().toString());
            textView8.setText("Result = " + (a * b));
        });

        button4.setOnClickListener(v -> {
            double a = Double.parseDouble(editTextText.getText().toString());
            double b = Double.parseDouble(editTextText2.getText().toString());

            if (b != 0) {
                textView8.setText("Result = " + (a / b));
            } else {
                textView8.setText("Cannot divide by zero");
            }
        });
    }
}
