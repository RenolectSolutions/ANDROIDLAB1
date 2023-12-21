package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private Button buttonShowText;
    private Button buttonChangeColor;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowText = findViewById(R.id.buttonShowText);
        buttonChangeColor = findViewById(R.id.buttonChangeColor);
        textView = findViewById(R.id.textView);

        buttonShowText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code to execute when the button is clicked
                textView.setText("MIPT 1");
            }
        });

        buttonChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text color to a random color
                int randomColor = Color.rgb(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)
                );
                textView.setTextColor(randomColor);
            }
        });
    }
}