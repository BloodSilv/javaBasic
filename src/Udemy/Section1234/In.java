package Udemy.Section1234;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        var i = new Scanner(System.in).nextInt();;
        System.out.println(i);

        var d = new Scanner(System.in).nextDouble();
        System.out.println(d);

        var b = new Scanner(System.in).nextBoolean();
        System.out.println(b);

        var ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(ch);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);


    }
}
