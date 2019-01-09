package com.fffrowies.servicesdemo;

import android.app.Service;

public class MyBoundService extends Service {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        return (float)a / (float)b;
    }
}
