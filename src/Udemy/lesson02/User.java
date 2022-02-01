package Udemy.lesson02;

public class User {
    private int age;
    private String name;
    private String passportData;
    public User(int a, String n, String p){
        age = a;
        name = n;
        passportData = p;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    String getPassportData(){
        return passportData;
    }


    public void talkName(String text) {
        System.out.println(text);
    }
    public void talkAge(String text) {
        System.out.println(text);
    }
    public void talkPassportData(String text) {
        System.out.println(text);
    }

  }
