package com.example.mylibrary2;

import android.util.Log;

import com.example.mylibrary3.MyClass3;

public class MyClass2 {
    public static void hello() {
        Log.v("hello", "MyClass2");
        MyClass3.hello();
    }
}
