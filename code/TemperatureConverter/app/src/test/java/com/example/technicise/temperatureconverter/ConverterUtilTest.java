package com.example.technicise.temperatureconverter;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConverterUtilTest {

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = ConverterUtil.convertCelsiusToFahrenheit(100); // class ConverterUtil is already in package
        // com.example.technicise.temperatureconverter and it is already imported
        // expected value is 212
        float expected = 200;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected,
                actual, 0.001);
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = ConverterUtil.convertFahrenheitToCelsius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from fahrenheit to celsius failed", expected,
                actual, 0.001);
    }

}
