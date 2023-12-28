package com.example.scherbakov_v_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button button = findViewById(R.id.loginButton); // Предположим, что у вас есть кнопка с id "button" на вашем макете (layout)

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(login.this, personal_area.class);
                startActivity(intent); // Запускаем активность
            }
        });
    }
}