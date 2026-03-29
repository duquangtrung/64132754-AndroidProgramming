package com.trung.bth7_listview;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsTenTinhThanhVN;
        dsTenTinhThanhVN = new ArrayList<String>();

        dsTenTinhThanhVN.add("Hà Nôi");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Bình Thuận");

        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                                android.R.layout.simple_list_item_1,
                                dsTenTinhThanhVN
                                );
        ListView lvTenTinhThanh= findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

    }
    AdapterView.OnItemClickListener BoLangNgevaXL = new AdapterView<.OnItemClickListener()> {
        @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this,"Bạn vừa chọn:" +String.valueOf(i), Toast.LENGTH_LONG).show();
        }
    }

}