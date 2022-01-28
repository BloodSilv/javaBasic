package yandexPracticum;

import java.util.Random;

public class Praktikum {
    public static void main(String[] args) {
        // Объяви пустой массив потребления воды за неделю (7 дней)
        int[] waterConsumption = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допиши условие цикла, чтобы заполнить массив случайными значениями
        for (int i = 0; i <  waterConsumption.length; i += 200) {
            /* максимальное число, которое может вернуть nextInt(n) - n-1,
            поэтому мы передаём в метод число 2001 (2000 + 1), чтобы максимальным числом
            было 2000 (2001 - 1) */
            waterConsumption[i] = random.nextInt(2001);
        }

        System.out.println("Потребление воды за неделю:");
        // Выведи с помощью цикла все приёмы воды за неделю в виде: "День (номер дня) ... . Выпито воды: ... мл"
        for (int i = 1; i <= 7; i++) {
            System.out.println("День " + i + "." + "Выпито воды: " + waterConsumption + "мл");
        }
    }
}

