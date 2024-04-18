package com.example.a1202007_alaadaryaquop_ass1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.a1202007_alaadaryaquop_ass1.databinding.ActivityMainBinding;

import sharedPreferences.Editor;

public class MainActivity extends AppCompatActivity {
    EditText name,number;
    Button signUp;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME="MyPref";
    private static final String KEY_NAME="Name",KEY_NUMBER= "Number";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number = findViewById(R.id.number);
        signUp = findViewById(R.id.signUp);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        Editor editor = (Editor) sharedPreferences.edit();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().length()==0){
                    name.setError("Enter First Name");
                }else if (number.getText().length()==0){
                    number.setError("Enter Moblie Number ");
                }
                else{
                    editor.putSring(KEY_NAME,name.getText().toString());
                    editor.putSring(KEY_NUMBER,number.getText().toString());
                    editor.apply();
                    Toast.makeText(MainActivity.this,"Log in sussfully",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);

                }
            }
        });

    }




}