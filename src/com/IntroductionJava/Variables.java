package com.IntroductionJava;

public class Variables {
    int i = 10;
    float f = 20.5f;
    double d = 20.5f;
    boolean b = true;
    char c = 'a';
    String s = "Hà Nội";
    public void display(){
       System.out.println("Biến i kiểu số nguyên, có giá trị là " + i);
       System.out.println("Biến f kiểu số nguyên, có giá trị là " + f);
       System.out.println("Biến d kiểu số nguyên, có giá trị là " + d);
       System.out.println("Biến b kiểu số nguyên, có giá trị là " + b);
       System.out.println("Biến c kiểu số nguyên, có giá trị là " + c);
       System.out.println("Biến s kiểu số nguyên, có giá trị là " + s);
    }

    public static void main(String[] args) {
        Variables v = new Variables();
        v.display();
    }
}
