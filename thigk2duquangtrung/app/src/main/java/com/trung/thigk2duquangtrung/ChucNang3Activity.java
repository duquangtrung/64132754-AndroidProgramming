package com.trung.thigk2duquangtrung;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ChucNang3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        ListView listView = findViewById(R.id.listView);
        List<String> monHoc = new ArrayList<>();
        monHoc.add("Tin học đại cương");
        monHoc.add("Lập trình Java");
        monHoc.add("Phát triển Ứng dụng web");
        monHoc.add("Khai phá dữ liệu lớn");
        monHoc.add("Kinh tế chính trị Mác - Lê nin");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, monHoc);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String mon = monHoc.get(position);
            Toast.makeText(this, "Bạn chọn: " + mon, Toast.LENGTH_SHORT).show();
        });
    }
}
