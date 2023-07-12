package com.vokasi.sqliteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    EditText editNama;
    EditText editAlamat;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editNama= findViewById(R.id.edit_nama);
        editAlamat= findViewById(R.id.edit_alamat);
        databaseHelper=new DatabaseHelper(this);
    }

    public void submitData(View view) {
        String nama=editNama.getText().toString();
        String alamat=editAlamat.getText().toString();
        if(nama.length()>0 && alamat.length()>0){
            databaseHelper.addStudent(nama, alamat);
            onBackPressed();
        }
    }
}