package com.example.a1202007_alaadaryaquop_ass1;


    import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            setupButton(R.id.button1, LearnTableX1Activity.class);
            setupButton(R.id.button02, LearnTableX2Activity.class);

        }

        private void setupButton(int buttonId, Class<?> activityClass) {
            Button button = findViewById(buttonId);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, activityClass);
                    startActivity(intent);
                }
            });
        }
    }


