package yandexPrakticum.incapsulation;

public class Main {
    public static void main(String[] args) {
        MelonStorage melonStorage = new MelonStorage(300);
        // Выведи на экран количество дынь на складе
        System.out.println(melonStorage.getMelonAmount());
        // Вызовы reduceMelonAmout с аргументом 100
        melonStorage.reduceMelonAmount(100);
        // Выведи на экран новое количество дынь
        System.out.println(melonStorage.getMelonAmount());
    }
}

class MelonStorage {
    private int melonAmount;

    // Добавь здесь конструктор
    public MelonStorage(int newMelonAmount) {
       melonAmount = newMelonAmount;
    }

    public void reduceMelonAmount(int amountToTake) {
        if (amountToTake > melonAmount) {
            // В переменной difference посчитай разницу между количеством дынь на складе и тем, сколько дынь нужно заказчику
            int difference = melonAmount - amountToTake;
            // Выведи на экран сообщение о том, сколько дынь не удалось вывезти
            System.out.println("Не удалось вывезти: " + difference);
            // Обнови количество дынь (melonAmount). Теперь оно должно быть равно 0, т.к. заказчик заберет все доступные дыни
            melonAmount = 0;
        } else {
            // Обнови количество дынь (melonAmount), вычтя то количество дынь, которое заказчик заберет.
            melonAmount = melonAmount - amountToTake;
        }
    }

    // Добавь здесь геттер
    public int getMelonAmount() {
        return melonAmount;
    }

}