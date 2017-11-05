package com.hushiyu1995.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static android.R.attr.duration;
import static android.R.attr.max;

/**
 * Created by Hu Shiyu on 1/11/2017.
 */

public class countQuestion{
    public static int correct = 0;
    public static int wrong = 0;
    public static int incomplete = 0;
    public static int click = 0;
    public static List<Float> durations = new ArrayList<Float>();


    countQuestion(int correct, int wrong, int incomplete,int click,List<Float> durations){
        this.correct = correct;
        this.wrong = wrong;
        this.incomplete = incomplete;
        this.click = click;
        durations = new ArrayList<Float>();
    }

    public static void addCorrect(){
        correct++;
    }

    public static int getCorrect(){
        return correct;
    }

    public static void addWrong(){
        wrong++;
    }

    public static int getWrong(){
        return wrong;
    }

    public static void addIncomplete(){
        incomplete++;
    }

    public static int getIncomplete(){
        return incomplete;
    }

    public static void addClick(){
        click++;
    }

    public static int getClick(){
        return click;
    }

    public static void addDuration(float duration){
        durations.add(duration);
    }

    public static float getDuration(){
        return durations.get(durations.size()-1);
    }

    public static float getLongestTime(){
        return Collections.max(durations);
    }

    public static float getShortestTime(){
        return Collections.min(durations);
    }

    public static float getAverageTime(){
        float sum = 0;
        for (int i=0; i < durations.size();i++){
            sum += durations.get(i);
        }
        return (float)sum/durations.size();
    }

}


