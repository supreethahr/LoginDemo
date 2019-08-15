package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class welcomeActivity extends AppCompatActivity {

    TextView txtName;
    private final String NAME_KEY="username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtName = (TextView)findViewById(R.id.txtName);
        //Bundle bundle=new Bundle();
        String name=getIntent().getExtras().get(NAME_KEY).toString();
        txtName.setText("   Welcome     "+name);
    }
}
