package com.famtechnology.calculadora4sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0, bAdd, bEval;
    float v1, v2;
    TextView ed1;
    boolean add;

    private void resetOperation() {
        add = false;
    }

    private void resetValues() {
        v1 = v2 = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetValues();
        resetOperation();
        bt0 = findViewById(R.id.bt0);
        bEval = findViewById(R.id.igualBT);
        bAdd = findViewById(R.id.somaBT);
        ed1 = findViewById(R.id.result);
        ed1.setText("");

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.append("0");

            }
        });
    }

    public void inputTexts() {

    }
}