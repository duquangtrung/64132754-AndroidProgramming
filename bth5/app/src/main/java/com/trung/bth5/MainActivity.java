package com.trung.bth5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button nutCong,nutTru,nutNhan,nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

    }
    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ= (EditText) findViewById(R.id.edtKetQua);
        nutCong=(Button) findViewById(R.id.btnCong);
        nutCong=(Button) findViewById(R.id.btnTru);
        nutCong=(Button) findViewById(R.id.btnNhan);
        nutCong=(Button) findViewById(R.id.btnChia);


    }
    void xulicong(View v) {

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA + soB;

        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);




    }
    void xulitru( View v) {

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA - soB;
        EditText editTextKQ= (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tong);



    }
    void xulinhan( View v){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA * soB;
        EditText editTextKQ= (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tong);



    }
    void xulichia(View v) {

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA / soB;
        EditText editTextKQ= (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tong);



    }
}