package com.trung.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Gắn Layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }

    // Đây là bô lắng nghe và xử lí sự kiên lên 1 Click Tính Tổng
    public void XuLyCong(View view) {
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        String strA= editTextSoA.getText().toString();
        String strB= EditTextSoB.getText().toString();
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        int tong= so_A + so_B;
        String strTong = String.valueDf(Tong);
        editTextKetQua.setText(strTong);
        
    }
}