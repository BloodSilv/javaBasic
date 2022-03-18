package yandexPrakticum.SprintTwo;

public class printHarvest {
    public static void main(String[] args) {

        String[] items = {"Картошка, мешки, 8", "Яблоки, ящики, 11.5", "Клубника, кг, 5.75"};

        String[] potato = items[0].split(",");
        String[] apple = items[1].split(",");
        String[] strawberry = items[2].split(",");

        System.out.printf("%-10s%-7s%-4s", potato[0].trim(), potato[1].trim(), potato[2].trim());
        System.out.println();
        System.out.printf("%-10s%-7s%-4s", apple[0].trim(), apple[1].trim(), apple[2].trim());
        System.out.println();
        System.out.printf("%-10s%-7s%-4s",strawberry[0].trim(), strawberry[1].trim(), strawberry[2].trim());
        System.out.println();
    }
}

