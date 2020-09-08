package com.minkyung.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void sendMessageMap(View view){
        Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(intent);
    }

    public void sendMessageList(View view){
        Intent intent = new Intent(getApplicationContext(),ItemListActivity.class);
        startActivity(intent);
    }
}