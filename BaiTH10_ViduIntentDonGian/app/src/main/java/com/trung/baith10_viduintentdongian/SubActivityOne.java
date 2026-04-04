package com.trung.baith10_viduintentdongian;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    public void goBackMain(View view) {
        finish(); // quay lại màn hình trước
    }
}