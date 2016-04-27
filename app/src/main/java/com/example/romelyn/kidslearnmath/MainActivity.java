package com.example.romelyn.kidslearnmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAdd(View v){
        Intent intent = new Intent(this, MathActivity.class);
        intent.putExtra("Operation","Addition");
        startActivity(intent);
    }

    public void btnSub(View v){
        Intent intent = new Intent(this, MathActivity.class);
        intent.putExtra("Operation","Subtraction");
        startActivity(intent);
    }

    public void btnMul(View v){
        Intent intent = new Intent(this, MathActivity.class);
        intent.putExtra("Operation","Multiplication");
        startActivity(intent);
    }

    public void btnDiv(View v){
        Intent intent = new Intent(this, MathActivity.class);
        intent.putExtra("Operation","Division");
        startActivity(intent);
    }

}
