package com.company;

public class Auditor {

    static String[] allowedRomanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static boolean checkInputIntervalRoman(String[] massivChisloOperatorChislo) {

        String componentRoman1 = massivChisloOperatorChislo[0];
        String componentRoman3 = massivChisloOperatorChislo[2];

        boolean found0 = false;
        for (int i = 0; i < allowedRomanNumerals.length; i++) {
            if (allowedRomanNumerals[i].equals(componentRoman1)) {
                found0 = true;
            }
        }
        boolean found00 = false;
        for (int j = 0; j < allowedRomanNumerals.length; j++) {
            if (allowedRomanNumerals[j].equals(componentRoman3)) {
                found00 = true;
            }
        }

        return (found0 & found00);
    }

    public static int[] allowedArabNumerals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static String[] allowedOperators = {"*", "/", "+", "-"};

    public static boolean checkInputIntervalArab(int[] pervoeVtoroeChislo, String operator) throws NumberFormatException {

        int pervoeChisloArNEW = pervoeVtoroeChislo[0];
        int vtoroeChisloArNEW = pervoeVtoroeChislo[1];

        boolean found1 = false;
        for (int x : allowedArabNumerals) {
            if (x == pervoeChisloArNEW) {
                found1 = true;
                break;
            }
        }
        boolean found2 = false;
        for (int y : allowedArabNumerals) {
            if (y == vtoroeChisloArNEW) {
                found2 = true;
            }
        }

        String operatorMath = operator;
        boolean found = false;
        for (int i = 0; i < allowedOperators.length; i++) {
            if (allowedOperators[i].equals(operatorMath)) {
                found = true;
            }
        }
        if (!(found1 & found2 & found)) {
            throw new IllegalArgumentException("Воможные причины сбоя: т.к. используются одновременно разные системы счисления\n" +
                    "т.к. строка не является математической операцией\n" +
                    "т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n" +
                    "т.к. символ не является арабским числом или оно за пределами диапазона 1-10");
        } else
            return (found1 & found2);
    }
}



