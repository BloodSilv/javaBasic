package yandexPrakticum.SprintTwo;

public class parsedText {
    public static void main(String[] args) {
        String[] parsedText = {
                "                                               I                                                   ",
                "           – Еh bien, mon prince. Gênes et Lucques ne sont plus que des apanages, des поместья, de ",
                "            la famille Buonaparte. Non, je vous préviens que si vous ne me dites pas que nous avons",
                "   la guerre, si vous vous permettez encore de pallier toutes les infamies, toutes les atrocités   ",
                "        de cet Antichrist (ma parole, j’y crois) — je ne vous connais plus, vous n’êtes plus mon   ",
                "          ami, vous n’êtes plus мой верный раб, comme vous dites[1]. Ну, здравствуйте,             ",
                "здравствуйте. Je vois que je vous fais peur[2], садитесь и рассказывайте.                          ",
                "",
                "Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная               ",
                "императрицы Марии Феодоровны, встречая важного и чиновного князя Василия, первого                  ",
                "приехавшего на ее вечер. Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила   ",
                "(грипп был тогда новое слово, употреблявшееся только редкими). В записочках, разосланных утром     ",
                "с красным лакеем, было написано без различия во всех:                                              ",
                "                                                                                                   "
        };
        for (String str: parsedText) {
            strCleaner(str);
        }
    }

    public static void strCleaner(String str) {
        if (!str.isEmpty() && !str.isBlank()) {
            System.out.println(str.trim());
        }
    }
}