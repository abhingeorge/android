package com.example.toggle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView image1, image2;
    Button btnToggle;
    boolean isFirstImage = true;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.imageView);
        image2=findViewById(R.id.imageView3);
        btnToggle=findViewById(R.id.toggleButton4);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstImage){
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                }else {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                }
                isFirstImage = !isFirstImage;
            }
        });
    }
}
