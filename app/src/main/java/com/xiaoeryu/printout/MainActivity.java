package com.xiaoeryu.printout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TrafficLight.main();
        com.xiaoeryu.printout.Juice.main();
        milk.main();


        Log.d("SimpleArray", "onCreate: SImpleArray");
        char arr[][] = new char[4][]; // 创建一个4行的二维数组
        arr[0] = new char[] { '春', '眠', '不', '觉', '晓' }; // 为每一行赋值
        arr[1] = new char[] { '处', '处', '闻', '啼', '鸟' };
        arr[2] = new char[] { '夜', '来', '风', '雨', '声' };
        arr[3] = new char[] { '花', '落', '知', '多', '少' };
        Log.d("SimpleArray", "-----横版-----");
        for (int i = 0; i < 4; i++) { // 循环4行
            Log.d("SimpleArraysToString", Arrays.toString(arr[i]));
            Log.d("SimpleStringBytes", Arrays.toString (Arrays.toString (arr[i]).getBytes()));
            for (int j = 0; j < 5; j++) { // 循环5列
                Log.d("SimpleArray", Character.toString(arr[i][j])); // 输出数组中的元素
            }
            if (i % 2 == 0) {
                Log.d("SimpleArray", ",");// 如果是一、三句，输出逗号
            } else {
                Log.d("SimpleArray", "。");// 如果是二、四句，输出句号
            }
        }

        Map<String, String> mapr0ysue = new HashMap<>(); // 创建Map集合对象
        mapr0ysue.put("xiaoeryu 1", "张三"); // 向Map集合中添加元素
        mapr0ysue.put("xiaoeryu 2", "李四");
        mapr0ysue.put("xiaoeryu 3", "王五");
        mapr0ysue.put("xiaoeryu 4", "赵六");

        Log.d("5map", "key值toString"+mapr0ysue.toString());




        Set<String> set = mapr0ysue.keySet(); // 构建Map集合中所有key的Set集合
        Iterator<String> it = set.iterator(); // 创建Iterator迭代器
        Log.d("5map", "key值：");
        while (it.hasNext()) { // 遍历并输出Map集合中的key值
            try {
                Thread.sleep(5000);
                Log.d("5map", it.next()+"  ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
