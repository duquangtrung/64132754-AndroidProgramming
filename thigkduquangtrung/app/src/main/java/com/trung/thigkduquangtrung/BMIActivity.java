package com.trung.thigkduquangtrung;

import android.os.Bundle;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmiactivity);

        EditText edtCan = findViewById(R.id.edtCan);
        EditText edtCao = findViewById(R.id.edtCao);
        TextView txtKQ = findViewById(R.id.txtKQ);
        Button btnTinh = findViewById(R.id.btnTinh);

        btnTinh.setOnClickListener(v -> {
            try {
                double can = Double.parseDouble(edtCan.getText().toString());
                double cao = Double.parseDouble(edtCao.getText().toString());

                double bmi = can / (cao * cao);

                String danhGia;
                if (bmi < 18.5) danhGia = "Gầy";
                else if (bmi < 25) danhGia = "Bình thường";
                else if (bmi < 30) danhGia = "Thừa cân";
                else danhGia = "Béo phì";

                txtKQ.setText("BMI: " + String.format("%.2f", bmi) + " - " + danhGia);

            } catch (Exception e) {
                Toast.makeText(this, "Nhập thiếu dữ liệu!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}