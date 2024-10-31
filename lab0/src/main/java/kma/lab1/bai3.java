package kma.lab1;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        //giai pt bac 1 ax + b = c
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap a, b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("nghiem pt la: " + (float) (c - b) / a);
    }
}
