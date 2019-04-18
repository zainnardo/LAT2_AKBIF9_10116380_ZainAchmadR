package com.r.a10116380_akb9_zainachmadr;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
    public void almost (View view){
        Intent intent = new Intent(RegisterActivity.this, almostActivity.class);
        startActivity(intent);
    }

}
