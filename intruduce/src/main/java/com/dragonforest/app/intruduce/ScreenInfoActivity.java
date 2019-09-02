package com.dragonforest.app.intruduce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScreenInfoActivity extends AppCompatActivity {

    private TextView tv_density;
    private TextView tv_ppi;
    private TextView tv_px;
    private TextView tv_scaledDensity;
    private TextView tv_xdpi;
    private TextView tv_ydpi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_info);
        initView();
        initData();
    }

    private void initView() {
        tv_density = findViewById(R.id.tv_density);
        tv_ppi = findViewById(R.id.tv_ppi);
        tv_px = findViewById(R.id.tv_px);
        tv_scaledDensity = findViewById(R.id.tv_scaledDensity);
        tv_xdpi = findViewById(R.id.tv_xdpi);
        tv_ydpi = findViewById(R.id.tv_ydpi);
    }

    private void initData() {
        float density = getResources().getDisplayMetrics().density;
        tv_density.setText(density + "");
        int densityDpi = getResources().getDisplayMetrics().densityDpi;
        tv_ppi.setText(densityDpi + "");
        int heightPixels = getResources().getDisplayMetrics().heightPixels;
        int widthPixels = getResources().getDisplayMetrics().widthPixels;
        tv_px.setText(widthPixels + " x " + heightPixels);
        float scaledDensity = getResources().getDisplayMetrics().scaledDensity;
        tv_scaledDensity.setText(scaledDensity + "");
        float xdpi = getResources().getDisplayMetrics().xdpi;
        tv_xdpi.setText(xdpi + "");
        float ydpi = getResources().getDisplayMetrics().ydpi;
        tv_ydpi.setText(ydpi + "");
    }
}
