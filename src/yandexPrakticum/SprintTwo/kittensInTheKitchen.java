package yandexPrakticum.SprintTwo;
import java.util.ArrayList;

public class kittensInTheKitchen {
    public static void main(String[] args) {
        // создай список kittensInTheKitchen
        ArrayList<String> kittensInTheKitchen = new ArrayList<>();
        //kittensInTheKitchen.add("Пушок");
        //kittensInTheKitchen.add("Снежок");
        //kittensInTheKitchen.add("Черныш");
        //kittensInTheKitchen.add(1, "Ушастик ");
        //kittensInTheKitchen.add(1, "Рыжик");
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // добавь в список каждого котёнка
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // удали Пушка из списка по индексу
        kittensInTheKitchen.remove(0);
        // удали Снежка из списка по имени
        kittensInTheKitchen.remove("Снежок");
        // проверь, пропал ли Снежок из списка
        if (kittensInTheKitchen.contains("Снежок")) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }
        // удали Черныша из списка по имени
        kittensInTheKitchen.remove("Черныш");
        // проверь, пропал ли Черныш из списка
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }
        // удали оставшихся котят из списка
        kittensInTheKitchen.clear();
        // проверь, сколько теперь котят на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне остались котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
    }
}

