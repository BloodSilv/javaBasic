package Udemy.Section5;

public class SwapVariables {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        var temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
