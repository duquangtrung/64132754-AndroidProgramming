package com.trung.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

    }
     void TimDieuKhien(){
        editTextSo1 = editTextSo1.getText().toString();
        editTextSo2 = editTextSo2.getText().toString();
        editTextKQ  = editTextSo2.getText().toString()
     }
    void XuLyCong(View){
        EditText editTextSo1 =(EditText)findViewById(R.id.edtSo1)
        EditText editTextSo2 =(EditText)findViewById(R.id.edtSo2
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA + soB;
                EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
                String chuoiKQ = String.valueOf(Tong);
                editTextKQ.setText(chuoiKQ;)
    }
    void XuLyTru(View){
                EditText editTextSo1 =(EditText)findViewById(R.id.edtSo1)
                EditText editTextSo2 =(EditText)findViewById(R.id.edtSo2
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA - soB;
                EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
                String chuoiKQ = String.valueOf(Tru;
                editTextKQ.setText(chuoiKQ;)

    }
    void XuLyNhan(View){
                EditText editTextSo1 =(EditText)findViewById(R.id.edtSo1)
                EditText editTextSo2 =(EditText)findViewById(R.id.edtSo2
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA * soB;
                EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
                String chuoiKQ = String.valueOf(Nhan);
                editTextKQ.setText(chuoiKQ;)
    }
    void XulyChia(View){
                EditText editTextSo1 =(EditText)findViewById(R.id.edtSo1)
                EditText editTextSo2 =(EditText)findViewById(R.id.edtSo2
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA / soB;
                EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
                String chuoiKQ = String.valueOf(Chia);
                editTextKQ.setText(chuoiKQ;)
    }
}