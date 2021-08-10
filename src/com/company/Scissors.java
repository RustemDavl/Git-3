package com.company;

public class Scissors {

    public static String[] transformTextInDataArray(String inMathText) { //метод разрезает введенный текст на элементы (чз пробел) и возвращает массив из них

        String[] arrayNumbMathOperatNumber = inMathText.split(" ");

        return arrayNumbMathOperatNumber;
    }
}
