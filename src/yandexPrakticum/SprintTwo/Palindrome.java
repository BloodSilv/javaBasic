package yandexPrakticum.SprintTwo;

public class Palindrome {

    public boolean isPalindromeText(String str) {
        String preparedStr = str.toUpperCase().replace(" ", "");
        StringBuilder sb = new StringBuilder(preparedStr);
        return sb.reverse().toString().equals(preparedStr);

    }
}
