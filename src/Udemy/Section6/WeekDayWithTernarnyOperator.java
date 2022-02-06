package Udemy.Section6;

import java.util.Random;

public class WeekDayWithTernarnyOperator {
    public static void main(String[] args) {
        System.out.println("Введи день недели числом от 1 до 7: ");
        var day = new Random().nextInt(7);
        System.out.println(
                day == 1 ? "Monday - " + day :
                        day == 2 ? "Tuesday - " + day :
                                day == 3 ? "Wednesday - " + day :
                                        day == 4 ? "Thursday - " + day :
                                                day == 5 ? "Friday - " + day :
                                                        day == 6 ? "Saturday - " + day :
                                                                day == 7 ? "Sunday - " + day :
                                                                        "Invalid day " + day);
    }
}
