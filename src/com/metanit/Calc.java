package com.metanit;




import java.io.IOException;

class Calc {

    static void Calculator(String str) throws IOException{
        String[] act = new String[]{"*", "+", "-", "/"};
        String[] actions = new String[]{"\\*", "\\+", "-", "/"};
        int b = 0;
        for (int i = 0; i < act.length; i++){
            if (str.contains(act[i])){
                b = i;
            }
        }
        String a = str.split(actions[b])[0];
        String c = str.split(actions[b])[1];
        if(str.split(actions[b]).length>2){
            throw new IOException();
        }
        boolean aIsNumber = false;
        boolean cIsNumber = false;
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        a = a.trim();
        c = c.trim();
        for (char r: a.toCharArray())
        {
            if(Character.isDigit(r))
                aIsNumber = true;
            else
                aIsNumber = false;
        }
        for (char r: c.toCharArray())
        {
            if(Character.isDigit(r))
                cIsNumber = true;
            else
                cIsNumber = false;
        }
        if (!aIsNumber && !cIsNumber)
        {
           num1 = Roman.romanToInteger(a);
           num2 = Roman.romanToInteger(c);
        }
        else if(aIsNumber && cIsNumber)
        {
            num1 = Integer.parseInt(a);
            num2 = Integer.parseInt(c);
        }
        else
        {
            throw new IOException();
        }

        switch (act[b].toCharArray()[0]){
            case '+':

                result = num1 + num2;
                break;

            case '-':

                result = num1 - num2;
                break;

            case '/':

                result = num1 / num2;
                break;

            case '*':

                result = num1 * num2;
                break;

        }
        if (!aIsNumber && !cIsNumber)
            System.out.println("Calculation result:\n" + Roman.integerToRoman(result));
        else
        System.out.println("Calculation result:\n" + result);
    }
}
