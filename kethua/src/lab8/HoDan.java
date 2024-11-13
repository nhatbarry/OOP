/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;
import java.util.ArrayList;
import java.util.Scanner;

import lab8.Nguoi;
/**
 *
 * @author nhatb
 */
public class HoDan {
    private int sothanhvien, sonha;
    private ArrayList<Nguoi> thanhvien = new ArrayList<Nguoi>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nha: ");
        sonha = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so thanh vien: ");
        sothanhvien = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sothanhvien; i++) {
            System.out.println("Nhap thanh vien thu " + (i + 1));
            Nguoi n = new Nguoi();
            n.nhap();
            thanhvien.add(n);
        }
        System.out.println();
    }

    public void xuat(){
        System.out.println("So nha: " + sonha);
        System.out.println("So thanh vien: " + sothanhvien);
        System.out.println("Cac thanh vien: ");
        for (int i = 0; i < sothanhvien; i++) {
            System.out.println("Thanh vien thu " + (i + 1));
            thanhvien.get(i).xuat();
        }
        System.out.println();
    }
}
