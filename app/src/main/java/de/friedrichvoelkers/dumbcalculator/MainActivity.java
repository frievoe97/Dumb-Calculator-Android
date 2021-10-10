package de.friedrichvoelkers.dumbcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button button00, button01, button02, button03, button04, button05, button06, button07, button08, button09, button10, button11, button12, button13, button14, button15;
    TextView resultTextView;
    String resultString = "0";
    Double resultDouble = 0.0;
    Double lastNumber = 0.0;
    String currentMode = "";
    Boolean rounded = false;
    Double preResultNumber = null;
    Boolean lastButtonWasOperation = false;
    Button[] buttonsElements;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button00 = findViewById(R.id.button00);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);
        button04 = findViewById(R.id.button04);
        button05 = findViewById(R.id.button05);
        button06 = findViewById(R.id.button06);
        button07 = findViewById(R.id.button07);
        button08 = findViewById(R.id.button08);
        button09 = findViewById(R.id.button09);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);

        String[] buttons = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "/", "*", "-", "+", "=", ","};
        //Button[] buttonsElements = {button00, button01, button02, button03, button04, button05, button06, button07, button08, button09, button10, button11, button12, button13, button14, button15};
        buttonsElements[button00.getId()] = button00;
        buttonsElements[button01.getId()] = button01;
        buttonsElements[button02.getId()] = button02;
        buttonsElements[button03.getId()] = button03;
        buttonsElements[button04.getId()] = button04;
        buttonsElements[button05.getId()] = button05;
        buttonsElements[button06.getId()] = button06;
        buttonsElements[button07.getId()] = button07;
        buttonsElements[button08.getId()] = button08;
        buttonsElements[button09.getId()] = button09;
        buttonsElements[button10.getId()] = button10;
        buttonsElements[button11.getId()] = button11;
        buttonsElements[button12.getId()] = button12;
        buttonsElements[button13.getId()] = button13;
        buttonsElements[button14.getId()] = button14;
        buttonsElements[button15.getId()] = button15;

        for(int i = 0; i < 15; i++) {
            //buttonsElements[i].setText(buttons[i]);
        }


    }


    public void pressButton(View view) {
        int id = view.getId();
        String value = (String) buttonsElements[id].getText();
        System.out.println(value);



    }

}
































