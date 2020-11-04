package com.IntroductionJava;
import java.util.Scanner;

public class linearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0){
            if(b != 0){
                System.out.println("PT vo nghiem");
            }else{
                System.out.println("PT vo so nghiem");
            }
        }else{
            System.out.println("PT co nghiem x = " + -b / a);
        }
    }
}
