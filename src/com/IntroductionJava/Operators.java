package com.IntroductionJava;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("width : " + width);
        System.out.println("height : " + height);
        System.out.println("Area : " + width * height);
    }
}
