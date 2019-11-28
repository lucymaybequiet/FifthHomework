package com.example.fifthhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EnrollActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private EditText et1,et2;
    private Drawable drawable1,drawable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);
        btn1 = findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnrollActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        et1 = findViewById(R.id.et_1);
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btn2 = findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EnrollActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
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
