package Udemy.Section6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithTernarnyOperator {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Введи число от 1 до 10: ");
        var userCase = new Scanner(System.in).nextInt();

        String result;
        System.out.println(number == userCase ? "Поздравляю! Ты угадал!" : "Ты не угадал... Попробуешь еще?");
        System.out.println("Было загадано число: " + number);
        System.out.println("Попробуешь еще раз? Y or N: ");
        char answer = new Scanner(System.in).nextLine().charAt(0);
        if (answer == 'Y') {
            main(args);
        } else {
            System.out.println("Спасибо за игру! Удачного дня!");
        }
    }
}
