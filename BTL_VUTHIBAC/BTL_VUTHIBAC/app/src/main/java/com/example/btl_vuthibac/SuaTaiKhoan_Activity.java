package com.example.btl_vuthibac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class SuaTaiKhoan_Activity extends AppCompatActivity {
    Database database;


    ArrayList<TaiKhoan> mangTK;
    TaiKhoanAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_tai_khoan);


        mangTK = new ArrayList<>();
        adapter = new TaiKhoanAdapter(getApplicationContext(), R.layout.ds_taikhoan, mangTK);
//        lv.setAdapter(adapter);
        database = new Database(this, "datlichkham.db", null, 1);
        database.QueryData("CREATE TABLE IF NOT EXISTS taikhoan(tendn VARCHAR(20) PRIMARY KEY, matkhau VARCHAR(50), quyen VARCHAR(50))");

    }
}