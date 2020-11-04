package com.IntroductionJava;
import java.util.Scanner;

public class Number {
    public String oneToTen(int num){
        switch (num){
            case 1 :
                return "one";
            case 2 :
                return "two";
            case 3 :
                return "three";
            case 4 :
                return "four";
            case 5 :
                return "five";
            case 6 :
                return "six";
            case 7 :
                return "seven";
            case 8 :
                return "eight";
            case 9 :
                return "nine";
        }
        return "-1";
    }
    public String tenToTwenty(int num){
        switch (num){
            case 10 :
                return "ten";
            case 11 :
                return "eleven";
            case 12 :
                return "twelve";
            case 13 :
                return "thirteen";
            case 14 :
                return "fourteen";
            case 15 :
                return "fifteen";
            case 16 :
                return "sixteen";
            case 17 :
                return "seventeen";
            case 18 :
                return "eighteen";
            case 19 :
                return "nineteen";
            case 20 :
                return "twenty";

        }
        return "-1";
    }
    public String thirtyToOnehunred(int num) {
        if (num % 10 == 0) {
            return (tenToTwenty(10 + num / 10).substring(0, tenToTwenty(10 + num / 10).length() - 3)
                    + "y ");
        }else{
            return (tenToTwenty(10 + num / 10).substring(0, tenToTwenty(10 + num / 10).length() - 3)
                    + "y ") +oneToTen(num % 10);
        }
    }
    public String overOneHunred(int num){
        return oneToTen(num / 100) + "hundred";
    }
    public String display(int num){
        if(0 < num && num < 10){
            return oneToTen(num);
        }else if(num < 21){
            return tenToTwenty(num);
        }else if(num < 30) {
            return tenToTwenty(20) + oneToTen(num % 10);
        }
        else if(num < 100){
            return thirtyToOnehunred(num);
        }else if(num > 100){
            return overOneHunred(num) + " " +display(num % 100);
        }
        return "-1";
    }
    public static void main(String[] args) {
        Number number = new Number();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(number.display(num));
    }
}
