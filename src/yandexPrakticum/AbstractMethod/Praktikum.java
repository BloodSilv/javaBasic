package yandexPrakticum.AbstractMethod;

public class Praktikum {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName();
        cat.sleepAllDay();

        Dog dog = new Dog();
        dog.getSound();
        dog.callToPlay();

    }
}

class Dog extends DomesticAnimal {
    public Dog() {
        super("Гав", "Шарик", 5);
    }

    public void callToPlay() {
        System.out.println("Хозяин, поиграй со мной");
    }
}

class Cat extends DomesticAnimal {
    public Cat() {
        super("Мяу", "Мурка", 3);
    }

    public void sleepAllDay() {
        System.out.println("Хр-р-р");
    }
}

abstract class DomesticAnimal {
    private String sound;
    private String name;
    private int age;

    protected DomesticAnimal(String sound, String name, int age) {
        this.sound = sound;
        this.name = name;
        this.age = age;

    }

    public void getSound() {
        System.out.println(sound);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getAge() {
        System.out.println(age);
    }
}