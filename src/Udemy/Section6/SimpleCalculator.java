package Udemy.Section6;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Введи a");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введи b");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Выбери оператор: (+, -, *, /, %)");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result;
        if(operator== '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a - b = " + (a - b);
        } else if (operator == '*') {
            result = "a * b = " + (a * b);
        } else if (operator == '/') {
            result = "a / b = " + (a /b);
        } else if (operator == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "Не поддерживаемый оператор " + operator;
        }
        System.out.println(result);


    }
}
