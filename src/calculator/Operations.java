/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author student
 */
public class Operations {

    public float addition(float number1, float number2) {
        return number1 + number2;
    }

    public float subtraction(float number1, float number2) {
        return number1 - number2;
    }

    public float multiplication(float number1, float number2) {
        return number1 * number2;
    }

    public float division(float number1, float number2) {
        return number1 / number2;
    }

    public float power(float number1, float number2) {
        return (float) java.lang.Math.pow(number1, number2);
    }
}
