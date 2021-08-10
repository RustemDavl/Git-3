package com.company;

import java.util.Arrays;

public class Converter {
    public static String[] data = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    public static int[] convertToArabic(String[] massivChisloOperatorChislo) {

        int pervoeChislo = Arrays.asList(data).indexOf(massivChisloOperatorChislo[0]) + 1;

        int vtoroeChislo = Arrays.asList(data).indexOf(massivChisloOperatorChislo[2]) + 1;


        int[] arrayTranslatedNumbers = {pervoeChislo, vtoroeChislo};

        return arrayTranslatedNumbers;
    }

    public static String convertToRoman(int resultVArabNEW) {

        String rezultMatViragRim = data[resultVArabNEW - 1];
        return rezultMatViragRim;
    }

    public static int[] convertNumberFromString(String massivChisloOperatorChislo[]) {

        int pervoeChislo = Integer.parseInt(massivChisloOperatorChislo[0]);

        int vtoroeChislo = Integer.parseInt(massivChisloOperatorChislo[2]);

        int[] numberFromString = {pervoeChislo, vtoroeChislo};

        return numberFromString;
    }

}