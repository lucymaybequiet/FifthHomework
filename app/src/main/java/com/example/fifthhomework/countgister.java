package com.example.fifthhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class countgister extends AppCompatActivity {

    private Button btn1,btn2;
    private EditText et1,et2;
    private Drawable drawable1,drawable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countgister);
        btn1 = findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(countgister.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(countgister.this,"正在登录中",Toast.LENGTH_SHORT).show();
            }
        });
        et1 = findViewById(R.id.et_1);
        et2 = findViewById(R.id.et_2);
        Drawable drawable1 = getResources().getDrawable(R.drawable.ic_user);
        drawable1.setBounds(0,0,80,80);
        et1.setCompoundDrawables(drawable1,null,null,null);
        Drawable drawable2 = getResources().getDrawable(R.drawable.ic_lock);
        drawable2.setBounds(0,0,80,80);
        et2.setCompoundDrawables(drawable2,null,null,null);
    }
}