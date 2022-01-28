package yandexPracticum;

import java.util.Random;

public class Practicum_6_1 {
    public static void main(String[] args) {
    String[] appliances = {"Стиральная машина", "Сушильная машина", "Холодильник", "Утюг", "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер"}; // объяви массив наименований бытовой техники};

    int[] amount = new int[10]; // Объяви пустой массив количества бытовой техники

    Random random = new Random(); // генерирует случайное число

    for (int i = 0; i < appliances.length; i++) { // Допиши условие цикла for, чтобы заполнить массив случайными значениями
        amount[i] = random.nextInt(3);
    }
    for (int i = 0; i < appliances.length; i++) { // Допиши условие цикла for, чтобы вывести на экран наименование и количество техники
        System.out.println("Наименование: " + appliances[i] + ". Количество: " + amount[i]);
    }
}
}