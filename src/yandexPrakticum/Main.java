package yandexPrakticum;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.setAmountOfBanana(-1); // если передать отрицательный аргумент,
        // количество бананов не изменится
        System.out.println("На складе бананов: " + storage.getAmountOfBanana());
    }
}
