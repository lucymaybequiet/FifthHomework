package com.example.fifthhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TEXTVIEWActivity extends AppCompatActivity {
    private TextView mtv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        mtv3 = findViewById(R.id.textview_3);
        mtv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mtv3.getPaint().setAntiAlias(true);
    }
}
