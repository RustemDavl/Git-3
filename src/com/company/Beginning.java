package com.company;

public class Beginning {

    public static String textOutput() {

        String message = "Введите выражение в одну строку в формате:\n" +
                "[целое число: арабское (0-10) или римское (I-X)]   [пробел]   [операнд (+, -, * или /)]   [пробел]   [целое число: арабское (0-10) или римское (I-X)]" +
                "\nПосле нажмите Enter";
        return message;
    }
}
