package kma.btvn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = "demo\\src\\main\\java\\kma\\btvn\\nhanvien.dat";
        ArrayList<NhanVien> list = null;
        int c;
        do {
            System.out.printf("1. Doc\n2. Ghi\n0. Thoat\n");
            c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    list = Utils.doc(path);
                    System.out.println();
                    System.out.println("DS nhan vien");
                    for (NhanVien nhanVien : list) {
                        nhanVien.xuat();
                    }
                    break;

                case 2:
                    System.out.printf("1. Ghi de\n2.Ghi tiep vao file\n");
                    int d = Integer.parseInt(sc.nextLine());
                    Utils.ghi(path, d);
                    break;
                default:
                    break;
            }
        } while (c != 0);
    }
}
