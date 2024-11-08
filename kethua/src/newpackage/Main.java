
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CanBo> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can bo can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        // nhap ttin moi cho can bo
        for(int i = 1; i <= n; i++){
            System.out.println("nhap thong tin nguoi thu " + i);
            System.out.printf("Can bo can them lam chuc vu j:\n1. Cong nhan\n2. Ky su\n3. Nhan vien\n");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    CongNhan cn = new CongNhan();
                    cn.nhap();
                    arr.add(cn);
                    break;
                case 2:
                    KySu ks = new KySu();
                    ks.nhap();
                    arr.add(ks);
                case 3:
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    arr.add(nv);
            }
        }

        //tim kiem
        do {
            System.out.print("nhap ten can bo can tim: ");
            String tim = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getHoten().equals(tim)) {
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
        System.out.printf("Thong tin tat ca can bo:\n\n");
        for (CanBo cb : arr){
            cb.xuat();
            System.out.printf("\n\n\n");
        }

    }

}
