package com.example.ospcg.radiogroup_radiobutton_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup= (RadioGroup) findViewById(R.id.radioPrincipal);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"Número 1",Toast.LENGTH_LONG).show();
                }else if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"Número 2",Toast.LENGTH_LONG).show();
                }else if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"Número 3",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
