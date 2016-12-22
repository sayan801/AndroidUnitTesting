package com.example.technicise.temperatureconverter;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/* Abhisek Roy  */
public class MainActivity extends AppCompatActivity {
    private EditText text;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View button)
    {
        if (text.getText().length() == 0)
        {
            Toast.makeText(this, "Please enter a valid temperature for conversion", Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            switch (button.getId())
            {
                case R.id.button1:
                    RadioButton to_celsius = (RadioButton)findViewById(R.id.radio0);
                    RadioButton to_fahrenheit = (RadioButton)findViewById(R.id.radio1);
                    if (to_celsius.isChecked())
                    {
                        float fahrenheit_value = Float.parseFloat(text.getText().toString());
                        text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(fahrenheit_value)));
                        to_celsius.setChecked(false);
                        to_fahrenheit.setChecked(true);
                    }
                    else if (to_fahrenheit.isChecked())
                    {
                        float celsius_value = Float.parseFloat(text.getText().toString());
                        text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(celsius_value)));
                        to_celsius.setChecked(true);
                        to_fahrenheit.setChecked(false);
                    }
                    break;

            }
        }
    }


}
