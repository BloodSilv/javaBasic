package yandexPrakticum.SprintTwo;

public class arrayOfDishes {
    public static void main(String[] args) {
        String[] arrayOfDishes = new String[]{
                "борщ",
                "котлета",
                "компот"
        };

        // Вместо StringBuilder и цикла можно использовать один вызов String.join(", ", arrayOfDishes);
        String sb = String.join(", ", arrayOfDishes);
        // StringBuilder sb = new StringBuilder();
        //for (int i = 0; i < arrayOfDishes.length; i++) {
        //  sb.append(arrayOfDishes[i]);
        //  if (i != arrayOfDishes.length - 1) {
        //      sb.append(", ");
        //  }
        //}
        System.out.println(sb.toString());
    }
}
