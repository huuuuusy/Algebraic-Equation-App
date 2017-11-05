package com.hushiyu1995.assignment1;
/**
 * Created by Hu Shiyu on 1/11/2017.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t7;
    private TextView t8;
    private TextView t9;
    public countQuestion count;
    int correctNumber;
    int wrongNumber;
    int incompleteNumber;
    private Button btn_finish;
    float longestTime;
    float shortestTime;
    float averageTime;




        @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

            correctNumber = count.getCorrect();
            wrongNumber = count.getWrong();
            incompleteNumber = count.getIncomplete();
            longestTime = count.getLongestTime();
            shortestTime = count.getShortestTime();
            averageTime = count.getAverageTime();



            TextView t3 = (TextView) findViewById(R.id.tv3);
            TextView t4 = (TextView) findViewById(R.id.tv4);
            TextView t5 = (TextView) findViewById(R.id.tv5);
            TextView t7 = (TextView) findViewById(R.id.tv7);
            TextView t8 = (TextView) findViewById(R.id.tv8);
            TextView t9 = (TextView) findViewById(R.id.tv9);

            t3.setText("Correct: "+ correctNumber);
            t3.setTextColor(Color.rgb(17,205,134));
            t4.setText("Wrong: "+ wrongNumber);
            t4.setTextColor(Color.rgb(209,28,22));
            t5.setText("Incomplete: "+ incompleteNumber);
            t5.setTextColor(Color.rgb(247,173,10));
            t7.setText("Longest Time: "+ longestTime);
            t8.setText("Shortest Time: "+ shortestTime);
            t9.setText("Average Time: "+ averageTime);


            btn_finish = (Button)findViewById(R.id.btn1);
            btn_finish.setOnClickListener(new MyonclickListener());

    }


    public class MyonclickListener implements OnClickListener {
            @Override
            public void onClick(View v) {
                onCreate(null);
            }

    }

}



