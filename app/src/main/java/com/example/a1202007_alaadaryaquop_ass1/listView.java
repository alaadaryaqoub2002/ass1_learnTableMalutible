package com.example.a1202007_alaadaryaquop_ass1;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class listView  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_item_to_learn);
        ListView listViewJAVA=(android.widget.ListView) findViewById(R.id.ListViewTable);
        String[] Companies={"X1","X2","X3","X4","X5","X6","X7","X8","X9"};
        int xmlFile= androidx.transition.R.layout.support_simple_spinner_dropdown_item;
        ArrayAdapter adapter =  new ArrayAdapter(listView.this,xmlFile,Companies);
        listViewJAVA.setAdapter(adapter);





    }

    }


