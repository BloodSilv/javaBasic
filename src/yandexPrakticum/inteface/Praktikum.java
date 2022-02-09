package yandexPrakticum.inteface;

public class Praktikum {
    public static void main(String[] args) {
        Sportcar sportcar = new Sportcar();
        System.out.println("Мощность двигателя: " + sportcar.getEnginePower() + " л.с.");
    }
}

interface Car {
    public int getEnginePower();
}

class Sportcar implements Car {
    @Override
    public int getEnginePower() {
        return 1200;
    }
}
