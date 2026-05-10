package com.trung.thigkduquangtrung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BaiThuocActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<BaiThuoc> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baithuoc);

        rv = findViewById(R.id.rvBaiThuoc);
        rv.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        // DỮ LIỆU TEST
        list.add(new BaiThuoc("Trị ho", "7 ngày"));
        list.add(new BaiThuoc("Giải cảm", "5 ngày"));
        list.add(new BaiThuoc("Đau bụng", "3 ngày"));
        list.add(new BaiThuoc("Mất ngủ", "10 ngày"));

        BaiThuocAdapter adapter = new BaiThuocAdapter(this, list);
        rv.setAdapter(adapter);
    }
}