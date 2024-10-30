package kma.lab1;
import java.util.*;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chk = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                chk = 1;
                break;
            }
        }
        if (chk == 1 || n == 1 || n == 0) {
            System.out.println("khong phai snt");
        }
        else 
            System.out.println("la snt");
    }
}
