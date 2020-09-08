package com.minkyung.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class SelectActivity extends AppCompatActivity {

    private ArrayAdapter adapter1,adapter2;
    private Spinner spinner1,spinner2;
    String choice_do="";
    String choice_se="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        spinner1 = (Spinner)findViewById(R.id.spinner_지역1);
        spinner2 = (Spinner)findViewById(R.id.spinner_지역2);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.array_지역, android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapter1.getItem(i).equals("서울")) {
                    choice_do = "서울";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_서울, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adapter1.getItem(i).equals("경기도")) {
                    choice_do = "경기도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_경기도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }else if (adapter1.getItem(i).equals("강원도")) {
                    choice_do = "강원도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_강원도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }else if (adapter1.getItem(i).equals("충청도")) {
                    choice_do = "충청도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_충청도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }else if (adapter1.getItem(i).equals("경상도")) {
                    choice_do = "경상도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_경상도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }else if (adapter1.getItem(i).equals("전라도")) {
                    choice_do = "전라도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_전라도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }else if (adapter1.getItem(i).equals("제주도")) {
                    choice_do = "제주도";
                    adapter2 = ArrayAdapter.createFromResource(SelectActivity.this, R.array.array_제주도, android.R.layout.simple_spinner_dropdown_item);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter(adapter2);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            choice_se = adapter2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void OnclickSearch(View view){
        Toast.makeText(SelectActivity.this, choice_do + "/" + choice_se, Toast.LENGTH_SHORT).show();
    }
}