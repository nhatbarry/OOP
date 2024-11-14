/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class HoSoHocSinh {
    private String lop;
    private int khoa, kyhoc;
    private Nguoi nguoi;

    

    public HoSoHocSinh() {
        nguoi = new Nguoi();
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        nguoi.nhap();
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoa = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ky hoc: ");
        kyhoc = Integer.parseInt(sc.nextLine());
    }

    void xuat(){
        nguoi.xuat();
        System.out.println("Lop: " + lop);
        System.out.println("Khoa: " + khoa);
        System.out.println("Ky hoc: " + kyhoc);
    }
}
