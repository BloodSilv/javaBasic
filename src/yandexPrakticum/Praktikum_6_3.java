package yandexPrakticum;

public class Praktikum_6_3 {public static void main(String[] args) {
    // Объяви массив старых наименований бытовой техники
    String[] appliances = {"Стиральная машина", "Сушильная машина", "Холодильник",
            "Утюг", "Посудомоечная машина", "Микроволновая печь",
            "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер"};

    // Объяви массив новых наименований бытовой техники
    String[] additionalAppliances = {"Кофемашина", "Чайник", "Тостер"};

    // Объяви пустой массив с новым общим списком бытовой техники
    String[] newAppliances = new String[13];

    // Допиши условие цикла for, чтобы заполнить массив newAppliances старой техникой
    for (int i=0; i < appliances.length; i++) {
        newAppliances[i] = appliances[i];
    }
    // Допиши условие цикла for, чтобы дозаполнить массив newAppliances новой техникой
    for (int i = 0; i < additionalAppliances.length; i++) {
        newAppliances[i+10] = additionalAppliances[i];
    }
    // Допиши условие цикла for, чтобы вывести на экран новый список бытовой техники
    for (int i = 0; i < newAppliances.length; i++) {
        System.out.println("Наименование: " + newAppliances[i]);
    }
}
}
