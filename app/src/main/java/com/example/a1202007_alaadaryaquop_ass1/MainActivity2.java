package com.example.a1202007_alaadaryaquop_ass1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity {
    TextView txtName;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="MyPref";
    private static final String KEY_NAME="Name",KEY_NUMBER= "Number";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_multiplication);
        txtName=findViewById(R.id.nametxt);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String stringName = sharedPreferences.getString(KEY_NAME,null);

        txtName.setText("First Name:"+stringName);



    }


}










