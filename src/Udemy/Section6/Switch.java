package Udemy.Section6;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введи число от 1 до 3");
        var a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            default:{
                System.out.println("default");
                break;
            }
        }
    }
}
