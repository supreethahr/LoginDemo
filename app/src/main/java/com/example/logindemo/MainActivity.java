package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.cert.Extension;

import static com.example.logindemo.R.id.txtPass;

import android.widget.Button;
public class MainActivity extends
    AppCompatActivity implements View.OnClickListener {
    EditText txtName, txtPass;

    private static final String NAME_KEY = "username";
    private static final String PASS_KEY = "password";

    Button btnSave;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtPass = findViewById(R.id.txtPass);
        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSave:
                //code for save button
                String name = txtName.getText().toString();
                String pass = txtPass.getText().toString();


                Intent intent = new Intent(this, welcomeActivity.class);

                Bundle bb = new Bundle();
                bb.putString(NAME_KEY, name);
                bb.putString(PASS_KEY, name);
                //bundle.putString(
                //txtName.putTxt().toString());
                intent.putExtras(bb);
                startActivity(intent);
                break;

            case R.id.btnCancel:
                //code for cancel button
                break;
        }
    }
}
