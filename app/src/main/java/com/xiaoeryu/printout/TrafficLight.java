package com.xiaoeryu.printout;

import android.util.Log;

enum Signal {
    GREEN, YELLOW, RED
}
public class TrafficLight {
    public static Signal color = Signal.RED;
    public static void main() {
//        Log.d("4enum", "enum "+ color.getClass().getName().toString());
        Log.d("4enum", "enum" + color);
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
        }
    }


}