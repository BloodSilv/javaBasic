package Udemy.Section1234;

import java.util.Scanner;

public class helloUser {
    public static void main(String[] args) {
        System.out.println("What is your neme?");
        var name = new Scanner(System.in).nextLine();
        System.out.println("Hello, "+ name + " !");
    }
}
