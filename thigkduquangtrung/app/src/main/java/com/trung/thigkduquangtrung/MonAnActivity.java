package com.trung.thigkduquangtrung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class MonAnActivity extends AppCompatActivity {

    RecyclerView rvMonAn;
    ArrayList<MonAn> list = new ArrayList<>();
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        rvMonAn = findViewById(R.id.rvMonAn);

        // QUAN TRỌNG
        rvMonAn.setLayoutManager(new LinearLayoutManager(this));

        loadData();

        adapter = new MonAnAdapter(this, list);
        rvMonAn.setAdapter(adapter);
    }

    private void loadData() {
        try {
            InputStream is = getAssets().open("monan.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String json = new String(buffer, "UTF-8");

            JSONArray arr = new JSONArray(json);

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);

                list.add(new MonAn(
                        obj.getString("ten"),
                        obj.getString("mota")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}