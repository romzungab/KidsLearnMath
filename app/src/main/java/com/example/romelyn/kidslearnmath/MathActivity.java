package com.example.romelyn.kidslearnmath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by romelyn on 27/04/2016.
 */
public class MathActivity extends AppCompatActivity {
    TextView tvOperation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        tvOperation = (TextView)findViewById(R.id.tvOperation);


        Intent intent = this.getIntent();
        String operation = intent.getExtras().getString("Operation");
        tvOperation.setText("Learn " + operation);
    }

    private void btnGoHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
         startActivity(intent);
    }

    private void btnStart(View v){
        Intent intent = new Intent(this, MainMathActivity.class);
        startActivity(intent);
    }


}
