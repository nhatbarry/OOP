/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class KhoiA extends ThiSinh {
    private double toan, ly, hoa;

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        toan = sc.nextDouble();
        System.out.println("Nhap diem ly:");
        ly = sc.nextDouble();
        System.out.println("Nhap diem hoa:");
        hoa = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Diem toan: " + toan);
        System.out.println("Diem ly: " + ly);
        System.out.println("Diem hoa: " + hoa);
    }

}
