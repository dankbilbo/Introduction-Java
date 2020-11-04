package com.IntroductionJava;

import java.util.Scanner;

public class Money {
    double amountUSD;
    final int rate = 23000;

    public void getInfor() {
        Scanner sc = new Scanner(System.in);
        amountUSD = sc.nextDouble();
    }

    public double convert() {
        return rate * amountUSD;
    }

    public void display() {
        System.out.println(convert() + "VND");
    }

    public static void main(String[] args) {
        Money m = new Money();
        m.getInfor();
        m.convert();
        m.display();
    }
}
