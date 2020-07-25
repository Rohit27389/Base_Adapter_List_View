package com.example.custom_list_view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String data[]={"Banglore","Patna","Muzaffarpur","Mangalore","Chennai","Kolakata","Durgapur","Pune","Mumbai","Hydrabad",
                "Gwalior","Indor","Bhopal","Jaipur","Delhi","Kanpur","Lacknow","Kanpur","Ranchi","Motipur","Motihari",};

        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(new Activity_BaseAdpter(getApplicationContext(),data,R.drawable.smile));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,position + " Selected Item :" +data[position],Toast.LENGTH_LONG).show();

            }
        });
    }
}