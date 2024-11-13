
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ThiSinh> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thi sinh can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        // nhap ttin moi cho can bo
        for(int i = 1; i <= n; i++){
            System.out.println("nhap thong tin thi sinh thu " + i);
            System.out.printf("Thi sinh can them thi khoi nao:\n1. A\n2. B\n3. C\n");
            int c = sc.nextInt();
            sc.nextLine();
            ThiSinh ts;
            switch (c) {
                case 1:
                    ts = new KhoiA();
                    ts.nhap();
                    arr.add(ts);
                    break;
                case 2:
                    ts = new KhoiB();
                    ts.nhap();
                    arr.add(ts);
                case 3:
                    ts = new KhoiC();
                    ts.nhap();
                    arr.add(ts);
            }
        }

        //tim kiem
        do {
            System.out.print("nhap sbd thi sinh can tim: ");
            String tim = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getSoBaoDanh().equals(tim)) {
                    arr.get(i).xuat();
                }
            }
            System.out.println("nhan 0 de ket thuc tim kiem");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
        } while (true);

        //xuat ttin
        System.out.printf("Thong tin tat ca thi sinh:\n\n");
        for (ThiSinh ts : arr){
            ts.xuat();
            System.out.printf("\n\n\n");
        }

    }

}
