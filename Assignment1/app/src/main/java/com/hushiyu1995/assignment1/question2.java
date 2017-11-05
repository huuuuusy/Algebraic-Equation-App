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

import static com.hushiyu1995.assignment1.R.id.et1;
import static com.hushiyu1995.assignment1.R.id.et2;

public class question2 extends AppCompatActivity {
    private EditText txt_inputx1;
    private EditText txt_inputx2;
    private Button btn_enter;
    private Button btn_new;
    private TextView t3;
    Random rand = new Random();
    int[] number = new int[3];
    public countQuestion count;
    int correctNumber;
    int wrongNumber;
    int clickNumber;
    int incompleteNumber;

    long timeA = System.currentTimeMillis();
    private TextView t6;
    private TextView t7;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);

        number[0] = Math.abs(rand.nextInt() % 198) - 99;
        number[1] = Math.abs(rand.nextInt() % 198) - 99;
        number[2] = Math.abs(rand.nextInt() % 198) - 99;
        checkNumber(number);
        count.addClick();
        clickNumber = count.getClick();
        //The TextView which shows the function
        TextView t1 = (TextView) findViewById(R.id.tv1);
        TextView t5 = (TextView) findViewById(R.id.tv5);

        t5.setText("Quadratic Equation: Question "+ clickNumber);
        int a1 = number[0];
        int a2 = number[1];
        int a3 = number[2];


        if (a2 < 0) {
            if (a3 < 0) {
                t1.setText(a1 + "x^2" + " -" + " " + Math.abs(a2) + "x"+" -" + " " + Math.abs(a3) + " = 0");
            } else {
                t1.setText(a1 + "x^2" + " -" + " " + Math.abs(a2) +"x"+" +" + " " + a3 + " = 0");
            }
        } else {
            if (a3 < 0) {
                t1.setText(a1 + "x^2" + " + "+ a2 +"x"+ " -" + " " + Math.abs(a3) + " = 0");
            } else {
                t1.setText(a1 + "x^2"+ " + " + a2 +"x" + " +" + " " + a3 + " = 0");
            }
        }

//            Input your computation


            txt_inputx1 = (EditText)findViewById(et1);
            txt_inputx2 = (EditText)findViewById(et2);

            btn_enter = (Button)findViewById(R.id.btn1);
            btn_enter.setOnClickListener(new MyonclickListener());
            btn_new = (Button)findViewById(R.id.btn2);
            btn_new.setOnClickListener(new MyonclickListener());



            //Show result
        t3 = (TextView) findViewById(R.id.tv3);
        t6 = (TextView) findViewById(R.id.tv6);
        t7 = (TextView) findViewById(R.id.tv7);
    }

    public int[] checkNumber(int[] array){
        while((array[1]*array[1] - 4*array[0]*array[2]) <= 0){
            array[0] = Math.abs(rand.nextInt() % 198) - 99;
            array[1] = Math.abs(rand.nextInt() % 198) - 99;
            array[2] = Math.abs(rand.nextInt() % 198) - 99;
        }

        return array;
    }

    public class MyonclickListener implements OnClickListener {

            @Override
            public void onClick(View v) {


                switch(v.getId()){
                    case R.id.btn1:
                        int a1 = number[0];
                        int a2 = number[1];
                        int a3 = number[2];
                        long timeB = System.currentTimeMillis();
                        long time = timeB - timeA;
                        float duration = (float)time/1000;
                        count.addDuration(duration);
                        float usedTime = count.getDuration();

                        String x1 = txt_inputx1.getText().toString();
                        String x2 = txt_inputx2.getText().toString();
                        double delta1 = Math.sqrt(a2*a2 - 4*a1*a3);
                        double result1 = (-(double) a2+ delta1)/ (2*(double)a1);
                        double result2 = (-(double) a2- delta1)/ (2*(double)a1);
                        String result11 = String.format("%.2f", result1);
                        String result22 = String.format("%.2f", result2);

                        t6.setText("You've used "+usedTime+" seconds in this question.");
                        t7.setText("RESULT");
                        t7.setBackgroundColor(Color.rgb(31,110,212));


                        if ((result11.equals(x1)&&result22.equals(x2))||(result11.equals(x2)&&result22.equals(x1))) {
                            count.addCorrect();
                            correctNumber = count.getCorrect();
                            t3.setTextColor(Color.rgb(17,205,134));
                            t3.setText("Right! You've answered "+correctNumber+" questions correctly!");
                        } else {
                            if (((x1.equals(""))&&((result22.equals(x2))||(result11.equals(x2))))||((x2.equals(""))&&((result11.equals(x1))||(result22.equals(x1))))){
                                count.addIncomplete();
                                incompleteNumber = count.getIncomplete();
                                t3.setTextColor(Color.rgb(247,173,10));
                                t3.setText("Incomplete! The right answer is "+result11+" and "+result22+". Sorry, you've answered "+incompleteNumber+" questions incompletely.");
                            }

                            else{
                                count.addWrong();
                                wrongNumber = count.getWrong();
                                t3.setTextColor(Color.rgb(209,28,22));
                                t3.setText("Error! The right answer is "+result11+" and "+result22+". Sorry, you've answered "+wrongNumber+" questions wrong.");
                            }

                        }
                        break;
                    case R.id.btn2:
                        if (clickNumber< 10){
                            Intent intent = new Intent(question2.this, question2.class);
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(question2.this, result.class);
                            startActivity(intent);
                        }
                        break;
                }

            }


    }
}


