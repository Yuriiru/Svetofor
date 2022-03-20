package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGreen(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#25EA5D"));
    }
    public void onClickRed(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#E10707"));
    }
    public void onClickBlue(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#031480"));
    }
}