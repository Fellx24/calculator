package com.metanit;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int res = 0;
    System.out.println("Insert your expression");
    Calc.Calculator(scan.nextLine());

    }
}
