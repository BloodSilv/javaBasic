package Udemy.Section5;

public class typeCast {
    public static void main(String[] args) {
        // int, double, boolean, char, string
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a');
        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(2);
        System.out.println(ch2);
        //
        char ch = 2;
        int i = 4;
        double d = 8;

        d = i;
        d = ch;

        i = (int) d;
        ch = (char) d;
        ch = (char) i;

        boolean b = true; // можно привести только к типу строка



    }
}
