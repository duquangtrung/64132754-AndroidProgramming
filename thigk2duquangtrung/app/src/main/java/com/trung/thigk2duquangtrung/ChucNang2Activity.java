package com.trung.thigk2duquangtrung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {

    private EditText edtDiemGiuaKy, edtDiemCuoiKy;
    private Button btnTinhDiemTB;
    private TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        edtDiemGiuaKy = findViewById(R.id.edtDiemGiuaKy);
        edtDiemCuoiKy = findViewById(R.id.edtDiemCuoiKy);
        btnTinhDiemTB = findViewById(R.id.btnTinhDiemTB);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTinhDiemTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhDiemTrungBinh();
            }
        });
    }

    private void tinhDiemTrungBinh() {
        String strDiemGiuaKy = edtDiemGiuaKy.getText().toString().trim();
        String strDiemCuoiKy = edtDiemCuoiKy.getText().toString().trim();

        if (strDiemGiuaKy.isEmpty() || strDiemCuoiKy.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ điểm!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double diemGiuaKy = Double.parseDouble(strDiemGiuaKy);
            double diemCuoiKy = Double.parseDouble(strDiemCuoiKy);

            if (diemGiuaKy < 0 || diemGiuaKy > 10 || diemCuoiKy < 0 || diemCuoiKy > 10) {
                Toast.makeText(this, "Điểm nhập vào phải từ 0 đến 10!", Toast.LENGTH_SHORT).show();
                return;
            }

            double diemTB = (diemGiuaKy * 0.5) + (diemCuoiKy * 0.5);
            txtKetQua.setText("Điểm trung bình: " + String.format("%.2f", diemTB));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}