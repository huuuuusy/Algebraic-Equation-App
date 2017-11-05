package com.hushiyu1995.assignment1;
/**
 * Created by Hu Shiyu on 1/11/2017.
 */

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class question1 extends AppCompatActivity {
    private EditText txt_input;
    private Button btn_enter;
    private Button btn_next;
    private TextView t3;
    public countQuestion count;
    int correctNumber;
    int wrongNumber;
    int clickNumber;
    long timeA = System.currentTimeMillis();
    private TextView t6;
    private TextView t7;

        Random rand = new Random();
        int a1 = Math.abs(rand.nextInt() % 198) - 99;
        int a2 = Math.abs(rand.nextInt() % 198) - 99;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.question1);
            TextView t4 = (TextView) findViewById(R.id.tv4);
            count.addClick();
            clickNumber = count.getClick();
            t4.setText("Linear Equation: Question "+ clickNumber);


            //The TextView which shows the function
            TextView t1 = (TextView) findViewById(R.id.tv1);

            if (a2 < 0) {
                t1.setText(a1 + "x" + " -" + " " + Math.abs(a2) + " = 0");
            } else {
                t1.setText(a1 + "x" + " +" + " " + a2 + " = 0");
            }

            //Input your computation
            txt_input = (EditText)findViewById(R.id.et1);
            btn_enter = (Button)findViewById(R.id.btn1);
            btn_enter.setOnClickListener(new MyonclickListener());
            btn_next = (Button)findViewById(R.id.btn2);
            btn_next.setOnClickListener(new MyonclickListener());

            //Show result
            t3 = (TextView) findViewById(R.id.tv3);
            t6 = (TextView) findViewById(R.id.tv6);
            t7 = (TextView) findViewById(R.id.tv7);
        }



        public class MyonclickListener implements OnClickListener{

            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.btn1:
                        long timeB = System.currentTimeMillis();
                        long time = timeB - timeA;
                        float duration = (float)time/1000;
                        count.addDuration(duration);
                        float usedTime = count.getDuration();

                        String x1 = txt_input.getText().toString();
                        double result1 = -((double)a2/(double)a1);
                        String result=String.format("%.2f",result1);
                        t6.setText("You've used "+usedTime+" seconds in this question.");
                        t7.setText("RESULT");
                        t7.setBackgroundColor(Color.rgb(31,110,212));

                        if(result.equals(x1))
                        {
                            count.addCorrect();
                            correctNumber = count.getCorrect();
                            t3.setTextColor(Color.rgb(17,205,134));
                            t3.setText("Right! You've answered "+correctNumber+" questions correctly!");
                        }
                        else{
                            count.addWrong();
                            wrongNumber = count.getWrong();
                            t3.setTextColor(Color.rgb(209,28,22));
                            t3.setText("Error! The right answer is "+result+". Sorry, you've answered "+wrongNumber+" questions wrong.");
                        }
                        break;
                    case R.id.btn2:

                        if (clickNumber< 5){
                            Intent intent1 = new Intent(question1.this,question1.class);
                            startActivity(intent1);
                        }
                        else{
                            Intent intent1 = new Intent(question1.this,  question2.class);
                            startActivity(intent1);
                        }
                        break;
                }
            }


        }


}

