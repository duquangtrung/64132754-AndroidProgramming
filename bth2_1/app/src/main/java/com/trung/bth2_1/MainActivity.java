package com.trung.bth2_1;

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
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong( View view) {
       EditText editTextSoA = findViewById(R.id.edtA);
       EditText editTextSoB = findViewById(R.id.edtB);
       EditText editTextKQ = findViewById(R.id.edtKQ);
    }
           String stRA= editTextSoA.getText().toString();
        String strB= editTextSoB.getText().toString();

}