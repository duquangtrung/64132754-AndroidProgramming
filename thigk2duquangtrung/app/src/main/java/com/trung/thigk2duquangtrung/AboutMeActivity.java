package com.trung.thigk2duquangtrung;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutMeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Tên: Dư Quang Trung\nMã số sinh viên: 64132754");
    }
}