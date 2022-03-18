package yandexPrakticum.SprintTwo;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // создай список kittenWeights

        ArrayList<Double> kittenWeights = new ArrayList<>();
        // добавь в список вес каждого котёнка
        kittenWeights.add(1.62);
        kittenWeights.add(1.91);
        kittenWeights.add(1.76);
        kittenWeights.add(2.02);
        kittenWeights.add(1.88);
        // определи максимальный вес в списке
        double max = 0;
        for (int i = 0; i < kittenWeights.size(); i++) {
            if (kittenWeights.get(i) > max) {
                max = kittenWeights.get(i);
            }
        }
        // вывод самого большого веса
        System.out.println("Максимальный вес: " + max + " кг");
    }
}
