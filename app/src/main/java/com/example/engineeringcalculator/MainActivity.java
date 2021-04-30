package com.example.engineeringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button buttonDot;
    private Button buttonC;
    private Button buttonZ;
    private Button buttonPrc;
    private Button buttonD;
    private Button buttonX;
    private Button buttonM;
    private Button buttonPlus;
    private Button buttonR;
    private Button buttonNormal;
    private Button buttonEngineering;
    private View engineeringView;
    private View normalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buttonClick();
    }



    private void initViews() {
        output = findViewById(R.id.textOut);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        buttonDot = findViewById(R.id.buttonDot);
        buttonC = findViewById(R.id.buttonC);
        buttonZ = findViewById(R.id.buttonZ);
        buttonPrc = findViewById(R.id.buttonPrc);
        buttonD = findViewById(R.id.buttonD);
        buttonX = findViewById(R.id.buttonX);
        buttonM = findViewById(R.id.buttonM);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonR = findViewById(R.id.buttonR);
        engineeringView = findViewById(R.id.engineeringView);
        normalView = findViewById(R.id.root);
        buttonEngineering = findViewById(R.id.buttonEngineering);
        buttonNormal = findViewById(R.id.buttonNormal);
    }

    private void buttonClick() {
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("0");
            }
        });
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("-");
            }
        });
        buttonPrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("%");
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("/");
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("x");
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("-");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("+");
            }
        });
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("=");
            }
        });

        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                engineeringView.setVisibility(View.INVISIBLE);
                normalView.setVisibility(View.VISIBLE);
            }
        });

        buttonEngineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normalView.setVisibility(View.INVISIBLE);
                engineeringView.setVisibility(View.VISIBLE);
            }
        });

    }
}