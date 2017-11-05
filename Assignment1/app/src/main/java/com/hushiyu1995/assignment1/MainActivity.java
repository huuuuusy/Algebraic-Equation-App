package com.hushiyu1995.assignment1;
/**
 * Created by Hu Shiyu on 1/11/2017.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    private Button btn_about;
    private Button btn_demo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView t1 = (TextView) findViewById(R.id.tv1);

        btn_start = (Button) findViewById(R.id.btn1);
        btn_start.setOnClickListener(new MyonclickListener());
        btn_about = (Button) findViewById(R.id.btn2);
        btn_about.setOnClickListener(new MyonclickListener());
        btn_demo = (Button) findViewById(R.id.btn3);
        btn_demo.setOnClickListener(new MyonclickListener());


    }

    public class MyonclickListener implements OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    Intent intent1 = new Intent(MainActivity.this, question1.class);
                    startActivity(intent1);
                    break;
                case R.id.btn2:
                    Uri uri1 = Uri.parse("http://hushiyu1995.com/2017/11/04/algebraic-equation-app-development/");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri1);
                    startActivity(intent2);
                    break;
                case R.id.btn3:
                    Uri uri2 = Uri.parse("https://www.youtube.com/watch?v=Qc76Fri1ils&feature=youtu.be/");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent3);
                    break;

            }
        }


    }
}

