package yandexPrakticum;

class Storage {
    private int amountOfBanana;

    public int getAmountOfBanana() {
        // геттер помогает получить значение переменной из другого класса
        return amountOfBanana;
    }

    public void setAmountOfBanana(int newAmountOfBanana) {
        // сеттер нужен, чтобы устанавливать новое количество бананов из другого класса
        if (newAmountOfBanana >= 0) { // нельзя установить отрицательное количество бананов
            amountOfBanana = newAmountOfBanana;
        }
    }

}

