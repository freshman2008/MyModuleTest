package com.example.mylibrary1;

import android.util.Log;

import com.example.mylibrary2.MyClass2;

public class MyClass1 {
    public static void hello() {
        Log.v("hello", "MyClass1");
        MyClass2.hello();
    }
}
