package com.example.myjava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textView);
        Button btn0 = findViewById(R.id.zero);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button clear = findViewById(R.id.clear);

        clear.setOnClickListener(v -> {
            textView.setText("");
        });
        btn0.setOnClickListener(v -> {
            textView.setText(textView.getText() + "0");
        });
        btn1.setOnClickListener(v -> {
            textView.setText(textView.getText() + "1");
        });

        btn2.setOnClickListener(v -> {
            textView.setText(textView.getText() + "2");
        });
        btn3.setOnClickListener(v -> {
            textView.setText(textView.getText() + "3");
        });
        btn4.setOnClickListener(v -> {
            textView.setText(textView.getText() + "4");
        });
        btn5.setOnClickListener(v -> {
            textView.setText(textView.getText() + "5");
        });
        btn6.setOnClickListener(v -> {
            textView.setText(textView.getText() + "6");
        });
        btn7.setOnClickListener(v -> {
            textView.setText(textView.getText() + "7");
        });
        btn8.setOnClickListener(v -> {
            textView.setText(textView.getText() + "8");
        });
        btn9.setOnClickListener(v -> {
            textView.setText(textView.getText() + "9");
        });
    }
}