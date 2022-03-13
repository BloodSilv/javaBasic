package yandexPrakticum.SprintTwo.EnumAndSwitch;

public class OnlySubstring {
    public static int numberOfSubstrings(String initialString, String substring) {
        int i = initialString.indexOf(substring);
        int count = 0;
        while (i != -1) {
            i = initialString.indexOf(substring, i + 1);
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(OnlySubstring.numberOfSubstrings("два", "раз"));
        System.out.println(OnlySubstring.numberOfSubstrings("раз два", "раз"));
        System.out.println(OnlySubstring.numberOfSubstrings("раз два, раз два", "раз"));
        System.out.println(OnlySubstring.numberOfSubstrings("раз два, раз два, раз два", "раз"));
    }
}
