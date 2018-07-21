package com.login.logindesign;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    protected Typeface mTfRegular;
    TextView app_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.happy);


        app_name = (TextView) findViewById(R.id.app_name);
        mTfRegular = Typeface.createFromAsset(getAssets(), "logo_regular.ttf");

        app_name.setTypeface(mTfRegular);


        app_name.startAnimation(AnimationUtils.loadAnimation(SplashActivity.this,R.anim.right_in));

    }
}
