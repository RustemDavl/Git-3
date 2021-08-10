package com.company;

public class Calculations {

    public static int calculateMathExpression(int[] temp, String[] massivChisloOperatorChislo) {

        int pervoeChisloT = temp[0];
        int vtoroeChisloT = temp[1];

        char matemOperator = massivChisloOperatorChislo[1].charAt(0);

        int rezultatMatemViragenie = 0;
        if (matemOperator == '+') {
            rezultatMatemViragenie = pervoeChisloT + vtoroeChisloT;
        } else if (matemOperator == '-') {
            rezultatMatemViragenie = pervoeChisloT - vtoroeChisloT;
        } else if (matemOperator == '*') {
            rezultatMatemViragenie = pervoeChisloT * vtoroeChisloT;
        } else if (matemOperator == '/') {
            rezultatMatemViragenie = pervoeChisloT / vtoroeChisloT;
        }

        return rezultatMatemViragenie;
    }
}