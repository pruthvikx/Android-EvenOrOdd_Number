package com.iif.evenorodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkFunction(View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        String stringEditText = editText.getText().toString();
        int intEditText = Integer.parseInt(stringEditText);

        String message;

        if (intEditText < 0){
            message = "enter valid number";
        } else if(intEditText % 2 == 0){
            message = "Even Number";
        } else {
            message = "Odd Number";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}