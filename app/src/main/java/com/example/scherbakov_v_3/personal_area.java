package com.example.scherbakov_v_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class personal_area extends AppCompatActivity {

    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton button = findViewById(R.id.back); // Предположим, что у вас есть кнопка с id "button" на вашем макете (layout)
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton button1 = findViewById(R.id.settings);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(personal_area.this, login.class);
                startActivity(intent); // Запускаем активность
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(personal_area.this, Notice.class);
                startActivity(intent); // Запускаем активность
            }
        });
    }
}