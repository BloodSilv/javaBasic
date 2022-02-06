package yandexPrakticum.DataTypes;

public class Praktikum_1 {
    public static void main(String[] args) {
        String firstNumber = "10";
        String secondNumber = "5";
        System.out.println(sumStrNumbers(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
    }

    private static int sumStrNumbers(int firstNumber, int secondNumber) {
        return Integer.parseInt(String.valueOf(firstNumber + secondNumber));
    }
}