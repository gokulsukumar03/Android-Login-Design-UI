package com.login.logindesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LoginActivity extends AppCompatActivity {

    private String tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        startActivity(new Intent(this, SplashActivity.class));

        /*MyThreadOne one = new MyThreadOne();
        one.start();
        MyThreadTwo two = new MyThreadTwo();
        two.start();

        HashMap h = new HashMap();
        HashSet s = new HashSet();
        Hashtable t = new Hashtable();*/

    }

    private class MyThreadOne extends Thread{

        @Override
        public void run() {
            super.run();
            syncTest(5);
        }
    }

    private class MyThreadTwo extends Thread {

        @Override
        public void run() {
            super.run();
            syncTest(100);
        }
    }

    private synchronized void syncTest(int n){

        for(int i=1;i<6;i++){

            Log.d(tag, "   "   + i*n);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
