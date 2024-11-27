/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kma.NgoaiLeBai1;

/**
 *
 * @author nhatb
 */
import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("a = 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            throw new ArithmeticException("vo nghiem");
        }
    }
}
