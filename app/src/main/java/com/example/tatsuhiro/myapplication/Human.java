package com.example.tatsuhiro.myapplication;

/**
 * Created by Tatsuhiro on 2017/09/23.
 */

import android.util.Log;


public class Human extends Animal implements Thinkable{

    static String hobby = "夢";

    Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say(){
        Log.d("javatest"+"私の名前は", name + "です。");
        Log.d("javatest"+"年は", age + "です。");
    }

    @Override
    public void think() {
        Log.d("javatest"+"私は", hobby + "について考える");
    }
}
