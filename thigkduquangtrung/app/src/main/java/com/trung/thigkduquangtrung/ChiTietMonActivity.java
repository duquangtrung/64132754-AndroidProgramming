package com.trung.thigkduquangtrung;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChiTietMonActivity extends AppCompatActivity {

    TextView txtTen, txtMoTa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietmon);

        txtTen = findViewById(R.id.txtTen);
        txtMoTa = findViewById(R.id.txtMoTa);

        MonAn m = (MonAn) getIntent().getSerializableExtra("data");

        if (m != null) {
            txtTen.setText(m.getTen());
            txtMoTa.setText(m.getMota());
        }
    }
}