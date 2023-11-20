package com.xiaoeryu.printout;

import android.util.Log;

public class milk implements liquid {
    public String flow(){
        Log.d("3interface", "flowing : interface ");
        return "nihao";
    };
    public static void main() {
        milk m = new milk();
        m.flow();
    }
}
