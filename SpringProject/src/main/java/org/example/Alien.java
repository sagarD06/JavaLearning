package org.example;

public class Alien {
    private int age;
    private Computer com;

    public Alien () {
        System.out.println("Object Created!");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getcom() {
        return com;
    }

    public void setcom(Computer com) {
        this.com = com;
    }

    public void code (){
        System.out.println("Coding...");
        com.compile();
    }
}
