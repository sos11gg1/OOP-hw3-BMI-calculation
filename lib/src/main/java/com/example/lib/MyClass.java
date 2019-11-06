package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("請輸入身高體重:");
        float H = scanner.nextFloat();
        float W = scanner.nextFloat();
        System.out.println("BMI:"+(W/(H/100)/(H/100)));
    }
}
