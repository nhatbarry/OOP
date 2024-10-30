package kma.lab1;

import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
        //giai pt bac 2 ax^2 + bx + c = 0
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double d ;
        System.out.println("Nhap a, b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = b * b - (4 * a * c);
        if (a == 0) 
            System.out.println("nghiem pt la: " + (float) (c - b) / a);
        else if(a != 0)
            if (d < 0)
                System.out.println("pt vo nghiem");
            else if (d == 0)
                System.out.println("pt nghiem kep: " + (float) -b / (2 * a));
            else{
                d =  Math.sqrt(d);
                double x1 = (float) (-b + d) / (2 * a);
                double x2 = (float) (-b - d) / (2 * a);
                System.out.println("pt 2 nghiem: x1 = " + x1 + "   x2 = " + x2);
            }
                
    }
}
