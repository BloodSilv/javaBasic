package Udemy.lesson02;

public class Main {
    public static void main(String[] args) {
        User user = new User(25, "Саша", "Passport");
        user.talkName("Hello! My name is " + user.getName());
        user.talkAge("My age is " + user.getAge());
        user.talkPassportData("My passport is " + user.getPassportData());
        System.out.println();
        System.out.println(user.getName() + " " + user.getAge() + " " + user.getPassportData());
        System.out.println();


        User user1 = new User(20, "Alex", "Passport2");
        user.talkName("Hello! My name is " + user1.getName());
        user.talkAge("My age is " + user1.getAge());
        user.talkPassportData("My passport is " + user1.getPassportData());
        System.out.println();
        System.out.println(user1.getName() + " " + user1.getAge() + " " + user1.getPassportData());

    }
}
