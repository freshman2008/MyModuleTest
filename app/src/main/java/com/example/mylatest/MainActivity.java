package com.example.mylatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary1.MyClass1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyClass1.hello();
//        MyClass2.hello();
    }
}
