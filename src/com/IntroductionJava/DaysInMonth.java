package com.IntroductionJava;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int days;
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                days = 31;
                System.out.println("Ngay trong thang " + month + " la " + days);
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                days = 30;
                System.out.println("Ngay trong thang " + month + " la " + days);
                break;
            case 2 :
                System.out.println("Ngay trong thang " + month + " la 29 hoac 30");
                break;
            default:
                System.out.println(month + " khong phai la thang");
        }
    }
}
