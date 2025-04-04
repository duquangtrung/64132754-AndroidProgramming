package com.trung.thigk2duquangtrung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChucNang2 = findViewById(R.id.btnChucNang2);
        Button btnChucNang3 = findViewById(R.id.btnChucNang3);
        Button btnChucNang4 = findViewById(R.id.btnChucNang4);
        Button btnAboutMe = findViewById(R.id.btnAboutMe);

        btnChucNang2.setOnClickListener(v -> startActivity(new Intent(this, ChucNang2Activity.class)));
        btnChucNang3.setOnClickListener(v -> startActivity(new Intent(this, ChucNang3Activity.class)));
        btnChucNang4.setOnClickListener(v -> startActivity(new Intent(this, ChucNang4Activity.class)));
        btnAboutMe.setOnClickListener(v -> startActivity(new Intent(this, AboutMeActivity.class)));
    }
}
