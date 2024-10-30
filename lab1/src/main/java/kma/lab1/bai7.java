package kma.lab1;
import java.util.Scanner;

public class bai7 {
    static int fact(int n){
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
    }
}
