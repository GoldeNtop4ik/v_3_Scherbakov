    package com.example.scherbakov_v_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

    public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton imageButton = findViewById(R.id.nazad); // Предположим, что у вас есть кнопка с id "button" на вашем макете (layout)
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton imageButton1 = findViewById(R.id.exitt); // Предположим, что у вас есть кнопка с id "button" на вашем макете (layout)

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(Notice.this, personal_area.class);
                startActivity(intent); // Запускаем активность
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(Notice.this, login.class);
                startActivity(intent); // Запускаем активность
            }
        });
    }
}