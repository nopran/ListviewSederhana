package com.example.razor.listviewsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem; //inisiasi listview

    //mendeklarasikan listview var dan menginisialasi array tipe data string
    private String[] bahasapemrograman = new String[]{
            "ASP.NET","C++","C#" ,"BASIC", "SQL", "PHP", "Phyton","Javascript","Java", "Visual Basic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, bahasapemrograman);
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //methode yang digunakan ketika item list view diklik
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //menampilkan toast message pada saat item dari listview diklik
                Toast.makeText(MainActivity.this, "Memilih : "+bahasapemrograman[position], Toast.LENGTH_LONG).show();
            }
        });

    }
}
