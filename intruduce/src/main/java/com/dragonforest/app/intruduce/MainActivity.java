package com.dragonforest.app.intruduce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_screen_info:
                go(ScreenInfoActivity.class);
                break;
        }
    }

    private void go(Class clazz) {
        startActivity(new Intent(MainActivity.this,clazz));
    }
}
