package Udemy.Section5;

import java.util.Scanner;

public class practiceSimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Введи число a:");
        var a = new Scanner(System.in).nextDouble();
        System.out.println("Введи число b:");
        var b = new Scanner(System.in).nextDouble();

        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);
    }
}
