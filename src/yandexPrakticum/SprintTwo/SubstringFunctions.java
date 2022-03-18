package yandexPrakticum.SprintTwo;

public class SubstringFunctions {
    public boolean search(String name, String subName) {
        int i = name.indexOf(subName);
        if (i != -1) {
            System.out.println(name);
        } else {
            return false;
        }
        return true;
    }
}
