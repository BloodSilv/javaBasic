package Udemy.Section6;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Введи день недели");;
        var day = new Scanner(System.in).nextInt();


        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Thuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day " + day;
        }
        System.out.println(result);

    }
}