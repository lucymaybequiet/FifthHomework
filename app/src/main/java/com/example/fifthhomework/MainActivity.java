package com.example.fifthhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btm1, btm2, btm3, btm4;
    private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btm1 =  findViewById(R.id.btn_1);
        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, countgister.class);
                startActivity(intent);
            }
        });

        btm4 = findViewById(R.id.btn_4);
        btm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);
            }
        });
        btm2 = findViewById(R.id.btn_2);
        btm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"努力开发中",Toast.LENGTH_SHORT).show();
            }
        });
        btm3 = findViewById(R.id.btn_3);
        btm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"努力开发中",Toast.LENGTH_SHORT).show();
            }
        });
        Drawable drawable = getResources().getDrawable(R.drawable.ic_user);
        drawable.setBounds(0, 0, 80, 80);
        btm1.setCompoundDrawables(drawable, null,null , null);

    }
}
