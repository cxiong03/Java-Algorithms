package com.codewithchang;

public class CelsiusToFahrenheit {
    float celsius;
    float fahrenheit;

    public void Fahrenheit() {
        celsius = 13;
        fahrenheit = ((celsius * 9)/ 5) + 32;
        System.out.println("The temperature is: " + fahrenheit + "F");
    }
}
