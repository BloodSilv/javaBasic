package Udemy.Section5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 1.1;
            var c = a - b; //double не всегда подходит для точных вычислений (0.8999999999999999)
            System.out.println(c);

        }
        {
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.3312");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
            System.out.println(new BigDecimal("22.").setScale(20).divide(new BigDecimal("7."), RoundingMode.HALF_UP));
        }
        {
            System.out.println(22. / 7.);


        }
    }
}

