package kma.lab1;
import java.util.Scanner;

public class bai9 {
    static int fibo(int n){
        if (n == 1 || n == 0) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibo(sc.nextInt()));
}
}
