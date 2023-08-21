package com.metanit;


class Roman {
    static String integerToRoman(int number) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                romanNumeral.append(symbols[i]);
                number -= values[i];
            }
        }

        return romanNumeral.toString();
    }

    static int romanToInteger(String romanNumeral) {
        int[] values = { 1000, 500, 100, 50, 10, 5, 1 };
        char[] symbols = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = 0;
            for (int j = 0; j<symbols.length;j++){
                if (symbols[j] == romanNumeral.charAt(i)){
                    currentValue = values[j];
                    break;
                }
            }
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
