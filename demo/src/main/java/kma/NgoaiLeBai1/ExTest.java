package kma.NgoaiLeBai1;

import java.util.Scanner;

public class ExTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            equation.solve();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            
        }
    }
}
