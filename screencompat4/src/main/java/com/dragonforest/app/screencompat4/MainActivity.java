package com.dragonforest.app.screencompat4;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCustomDensity(this, getApplication());
        setContentView(R.layout.activity_main);
    }

    private void setCustomDensity(Activity activity, Application application) {
        DisplayMetrics appDisplayMetrics = application.getResources().getDisplayMetrics();
        float targetDensity = appDisplayMetrics.widthPixels / Design.DESIGN_WIDTH_DP;
        appDisplayMetrics.density = appDisplayMetrics.scaledDensity = targetDensity;

        DisplayMetrics acDisplayMetrics = activity.getResources().getDisplayMetrics();
        acDisplayMetrics.density = acDisplayMetrics.scaledDensity = targetDensity;
    }
}
