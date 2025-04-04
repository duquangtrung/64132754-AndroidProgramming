package com.trung.gk;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Cau2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);

        ListView listView = findViewById(R.id.listViewCau2);

        // Danh sách dữ liệu
        String[] data = {"Sự kiện 1", "Sự kiện 2", "Sự kiện 3", "Sự kiện 4", "Sự kiện 5"};

        // Tạo Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // Gán Adapter vào ListView
        listView.setAdapter(adapter);
    }
}
