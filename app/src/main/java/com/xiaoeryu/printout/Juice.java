package com.xiaoeryu.printout;

import android.util.Log;

import com.xiaoeryu.printout.Water;

public class Juice extends Water { // 果汁 类 继承了水类

    public String fillEnergy(){
        Log.d("2Object", "Juice: i`m fillingEnergy!");
        return "Juice: i`m fillingEnergy!";
    }

    public static void main() {

        Water w1 = new Water();
        flow(w1) ; //

        Juice J = new Juice(); // 实例化果汁类对象
        flow(J) ; // 调用水的方法  向上转型 J → W

        Water w2 = new Juice();
        ((Juice) w2).fillEnergy();
    }
}
