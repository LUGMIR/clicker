package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    Button button;
    static int count = 0;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                button.setText(count+"");

                if (count > 10 && count < 50){
                    textView.setText("Маловато");
                }
                if (count > 100 && count < 500){
                    textView.setText("Можно и лучше");
                }
                if (count > 600 && count < 1000) {
                    textView.setText("Ещё немного и можно выводить");
                }
                if (count > 1000 && count < 100000000) {
                    textView.setText("Не, мы ничего не выводим");
                }
                if (count == 50) {
                    Toast.makeText(getApplicationContext(),"Ты набрал 50, ну кароче лох", Toast.LENGTH_SHORT).show();
                }
                if (count == 100) {
                    Toast.makeText(getApplicationContext(),"Ты набрал 100, такие копейки не выводим", Toast.LENGTH_LONG).show();
                }
                if (count == 500) {
                    Toast.makeText(getApplicationContext(),"Ты набрал 500, всё ещё мало для вывода", Toast.LENGTH_LONG).show();
                }
                if (count == 1000) {
                    Toast.makeText(getApplicationContext(),"Ты набрал 1000. Ты конченый?", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Обработчик нажатия на объект TextView

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
            }
        });
    }
}