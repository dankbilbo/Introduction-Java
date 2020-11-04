package com.IntroductionJava;
import java.util.Scanner;

public class Person {
    String name;
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = sc.nextLine();
    }
    public void greeting(){
        System.out.println("Hello : " + name);
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.getInfo();
        p.greeting();
    }
}
