package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText enternum;
    Button m;
    Button cm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output=findViewById(R.id.textView2);
        enternum=findViewById(R.id.editText);
        m=findViewById(R.id.button);
        cm=findViewById(R.id.button2);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=enternum.getText().toString();
                int number=Integer.parseInt(num);
                float meter=(number/100);
                output.setText("Value in meter:"+meter);

            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=enternum.getText().toString();
                int number=Integer.parseInt(num);
                float centi=(number*100);
                output.setText("Value in centimeter:"+centi);

            }
        });

    }
}
