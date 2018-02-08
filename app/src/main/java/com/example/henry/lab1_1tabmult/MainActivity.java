package com.example.henry.lab1_1tabmult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btncalcu;
    int num;
    EditText etnum;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalcu = findViewById(R.id.button);
        etnum = findViewById(R.id.editText);
        resultado = findViewById(R.id.textView2);

        btncalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(etnum.getText().toString());
                resultado.setText(num+"x 1 ="+num*1+"\n"+
                                  num+"x 2 ="+num*2+"\n"+
                                    num+"x 2 ="+num*3+"\n"+
                                    num+"x 1 ="+num*4+"\n"+
                        num+"x 1 ="+num*5+"\n"+
                        num+"x 1 ="+num*6+"\n"+
                        num+"x 1 ="+num*7+"\n"+
                        num+"x 1 ="+num*8+"\n"+
                        num+"x 1 ="+num*9+"\n"+
                        num+"x 1 ="+num*10+"\n");


            }
        });

    }
}
