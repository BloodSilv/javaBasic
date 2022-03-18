package yandexPrakticum.SprintTwo;

public class cardFieldEditor {
    public static void main(String[] args) {
        String name = "Vasiliy Ivanov";
        String fixedName = cardFieldEditor(name);
        System.out.println(fixedName);
    }

    public static String cardFieldEditor(String name) {
        return name.toUpperCase();
    }
}
