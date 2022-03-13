package Udemy.lesson01;

// public protected default private


public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Виктор!");

        int res = sum (20, 30);
        System.out.println(res);
        int res1 = sum (50, 60);
        System.out.println(res1);

        System.out.println(sum(15, 15));
        String str = "23";
        System.out.println(convert("text"));
    }

    public static int sum(int number1, int number2) {
        int res = number1 + number2;
        return res;
    }
    public static String convert (String str) {
        String res = str + " end. ";
        return res;
    }
}

