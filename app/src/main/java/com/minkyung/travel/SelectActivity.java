package com.minkyung.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        spinner = (Spinner)findViewById(R.id.spinner_지역1);
        adapter = ArrayAdapter.createFromResource(this, R.array.지역1, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    public void OnclickSearch(View view){
        Intent intent = new Intent(getApplicationContext(),IntroActivity.class);
        startActivity(intent);
    }
}