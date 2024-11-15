/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12.cau1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PTGT> qly = new ArrayList<PTGT>();
        System.out.print("Nhap so phuong tien: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phuong tien thu: " + (i + 1));
            System.out.printf("1. Xe may\n2.O to\n3.Xe tai");
            int c = Integer.parseInt(sc.nextLine());
            PTGT pt;
            switch (c) {
                case 1:
                    pt = new XeMay();
                    pt.nhap();
                    qly.add(pt);
                    break;
                case 2:
                    pt = new OTo();
                    pt.nhap();
                    qly.add(pt);
                    break;
                case 3:
                    pt = new XeTai();
                    pt.nhap();
                    qly.add(pt);
                    break;
                default:
                    System.out.println("Nhap sai: ");;
            }
        }

        // tim
        System.out.println();
        System.out.println();
        System.out.print("Nhap mau xe: ");
        String search = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (qly.get(i).getMau().equals(search)) {
                qly.get(i).xuat();
            }
        }
    }
}
