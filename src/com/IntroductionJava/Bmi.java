package com.IntroductionJava;
import java.util.Scanner;
import java.lang.Math;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        float weight = sc.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if(bmi < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("obese");
        }
    }
}
