package kma.lab1;
import java.util.Scanner;

public class bai8 {
    static int fact(int n){
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (double) 1 / fact(i);
        }
        System.out.println(sum);
    }
}
