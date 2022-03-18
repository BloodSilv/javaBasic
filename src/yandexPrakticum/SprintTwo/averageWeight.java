package yandexPrakticum.SprintTwo;
import java.util.ArrayList;

public class averageWeight {
    public static void main(String[] args) {
        ArrayList<Double> kittenWeights = new ArrayList<>();
        kittenWeights.add(1.62);
        kittenWeights.add(1.91);
        kittenWeights.add(1.76);
        kittenWeights.add(2.02);
        kittenWeights.add(1.88);

        // рассчитай сумму весов всех котят
        double sum = 0;
        for (Double weight : kittenWeights) {
            // сложи значения в списке
            sum = sum + weight;
        }
        // рассчитай средний вес котёнка
        double averageWeight = sum / kittenWeights.size();
        // выведи результат на экран
        System.out.println("Средний вес котёнка: " + averageWeight + " кг");

    }
}
