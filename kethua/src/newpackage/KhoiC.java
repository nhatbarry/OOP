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
public class KhoiC extends ThiSinh {
    private double van, su, dia;
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem van:");
        van = sc.nextDouble();
        System.out.println("Nhap diem su:");
        su = sc.nextDouble();
        System.out.println("Nhap diem dia:");
        dia = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Diem van: " + van);
        System.out.println("Diem su: " + su);
        System.out.println("Diem dia: " + dia);
    }

}
