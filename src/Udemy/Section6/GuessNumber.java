package Udemy.Section6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Введи число от 1 до 10: ");
        var userCase = new Scanner(System.in).nextInt();

        String result;
        if (number == userCase) {
            result = "Congratulation, You guessed the number!";
        } else {
            result = "Sorry, but you number is invalid! Try again later... ";
        }
        System.out.println("Было загадано число: " + number);
        System.out.println(result);
        System.out.println("Повторить? Y or N: ");
        char answer = new Scanner(System.in).nextLine().charAt(0);
        if (answer == 'Y') {
            main(args);
        } else {
            System.out.println("Спасибо за игру! Удачного дня!");
        }
    }
}
