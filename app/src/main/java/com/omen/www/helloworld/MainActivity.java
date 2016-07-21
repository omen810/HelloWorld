package com.omen.www.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText activity_main_edt_username;
    private Button activity_main_btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_main_edt_username=(EditText)findViewById(R.id.edt_username);
        activity_main_btn_submit=(Button)findViewById(R.id.btn_submit);
        activity_main_btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("omen","you have clicked the submit button");
                String username=activity_main_edt_username.getText().toString();
                Toast.makeText(MainActivity.this,username,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
