package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner cs=new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        double c;

        c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}