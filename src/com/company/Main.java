package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {

        Beginning beginning = new Beginning();
        System.out.println(beginning.textOutput());                 //вывод приветствия для начало работы

        Scissors scissors = new Scissors();                         //ввод математического выражения (текст), разрезаем
        Scanner concole = new Scanner(System.in);                   //на элементы, заносим их в массив
        String inputMathExpressText = concole.nextLine();
        String[] massivNumbMathOperatNumber = scissors.transformTextInDataArray(inputMathExpressText);

        Auditor auditor = new Auditor();                           //проверка входящих элементов массива
        boolean permissionToConvertToRoman = auditor.checkInputIntervalRoman(massivNumbMathOperatNumber); //на соответствие римским цифрам и вхождение в интервал I-X

        if (permissionToConvertToRoman) {
            Converter converter = new Converter();
            int[] temp = converter.convertToArabic(massivNumbMathOperatNumber);  //возвращает массив temp (араб.цифр) из переведенных двух римских цифр

            Calculations calculations = new Calculations();
            int resultArabFromRoman = calculations.calculateMathExpression(temp, massivNumbMathOperatNumber); //отправляем массив temp (араб.цифр)
            //на вычисление в калькулятор и возвращаем результат вычисления

            String resultRoman = converter.convertToRoman(resultArabFromRoman); //переводим результат вычислении из арабского в римский и возвращаем
            System.out.println(resultRoman);

        } else if (!permissionToConvertToRoman) {                                //если введенный текст не соотвествовал римским цифрам, интервалу,
            Converter converter = new Converter();
            int[] temp = converter.convertNumberFromString(massivNumbMathOperatNumber); //пробуем перевести строковые символы в арабские и возвращаем

            boolean permissionToCalculateArab = Auditor.checkInputIntervalArab(temp, massivNumbMathOperatNumber[1]); //проверка входящих элементов

            if (permissionToCalculateArab) {
                Calculations calculations = new Calculations();
                int resultArab = calculations.calculateMathExpression(temp, massivNumbMathOperatNumber); //отправляем массив temp (араб.цифр)
                System.out.println(resultArab);//на вычисление в калькулятор и возвращаем результат вычисления
            }
        }
    }
}
