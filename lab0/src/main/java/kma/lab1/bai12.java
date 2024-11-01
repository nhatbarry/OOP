package kma.lab1;
import java.util.*;

public class bai12 {
    static boolean checksnt(int x){
        if (x <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }
    static void inmang(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int search(int x, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //xuat ra cac ptu
        inmang(arr);
        //tim cuc tri
        int lonnhat = Integer.MIN_VALUE;
        int benhat = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < benhat) {
                benhat = arr[i];
            }
            if (arr[i] > lonnhat) {
                lonnhat = arr[i];
            }
        }
        System.out.printf("\nso lon nhat la %d\nso be nhat la %d\n", lonnhat, benhat);
        //so ngto
        System.out.println("Cac so nguyen to la");
        for (int i = 0; i < n; i++) {
            if (checksnt(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        //sap xep tang dan
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        System.out.println("sap xep tang dan");
        inmang(sortedArr);
        System.out.println();
        //tim x
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();
        if (search(x, arr) == -1) {
            inmang(arr);
            System.out.println();
            System.out.println("Khong tim thay x");
        }
        else{
            inmang(arr);
            System.out.println();
            System.out.println("x nam o index thu " + search(x, arr));
        }
    }
}
