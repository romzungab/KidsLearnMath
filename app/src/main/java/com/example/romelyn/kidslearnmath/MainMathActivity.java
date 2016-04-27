package com.example.romelyn.kidslearnmath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by romelyn on 27/04/2016.
 */
public class MainMathActivity extends AppCompatActivity {
    TextView tvLearnMath;
    String operation;
    int level;
    TextView tvLevel;
    TextView tvNo1;
    TextView tvNo2;
    TextView tvOperator;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_math);
        Intent intent = this.getIntent();
        operation = intent.getExtras().getString("operation");
        level = Integer.parseInt(intent.getExtras().getString("level"));


        tvLevel = (TextView) findViewById(R.id.tvLevel);
        tvNo1 = (TextView) findViewById(R.id.tvNo1);
        tvNo2 = (TextView) findViewById(R.id.tvNo2);
        tvOperator = (TextView) findViewById(R.id.tvOperator);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle.setText("Learn "+operator);
        tvLevel.setText("Level: "+level);
        loadData();

    }


        private void loadData(){
            //int level 1
            int no1 = (int)(Math.random() * 5)*level;
            int no2 = (int) (Math.random() * 5) * level;

            tvNo1.setText(String.valueOf(no1));
            tvNo1.setText(String.valueOf(no2));
        }

}