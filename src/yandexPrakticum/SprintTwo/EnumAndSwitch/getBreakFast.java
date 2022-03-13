package yandexPrakticum.SprintTwo.EnumAndSwitch;


public class getBreakFast {
    public static void main(String[] args) {
        int dayNumber = 7;
        getBreakFast(dayNumber);
    }
    public static void getBreakFast(int dayNumber) {
        switch (dayNumber
        ) {
            case 1:
                System.out.println("Каша");
                break;
            case 2:
                System.out.println("Салат");
                break;
            case 3:
                System.out.println("Бутерброды");
                break;
            case 4:
                System.out.println("Яичница");
                break;
            case 5:
                System.out.println("Омлет");
                break;
            case 6:
                System.out.println("Сок и яблоко");
                break;
            case 7:
                System.out.println("Овсяные хлопья");
                break;
        }
    }
}






