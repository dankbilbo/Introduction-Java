package com.IntroductionJava;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println(year + " la nam nhuan");
        }else{
            if(year % 4 == 0 & year % 100 != 0){
                System.out.println(year + " la nam nhuan");
            }else{
                System.out.println(year + " khong la nam nhuan");
            }
        }
    }
}
