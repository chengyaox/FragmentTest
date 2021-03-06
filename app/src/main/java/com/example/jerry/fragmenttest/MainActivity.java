package com.example.jerry.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.FrameMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        reaplaceFragment(new RightFragment());
    }

    private void reaplaceFragment(Fragment fragment){
        /*
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.rigth_layout,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
        */
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                reaplaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }
}
