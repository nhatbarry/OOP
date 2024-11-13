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
public class ThiSinh {
    private String soBaoDanh;
    private String hoten;
    private String diaChi;
    private double uuTien;
    
    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sbd:");
        soBaoDanh = sc.nextLine();
        System.out.println("Nhap hoten:");
        hoten = sc.nextLine();
        System.out.println("Nhap uu tien:");
        uuTien = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.println("SBD:" + soBaoDanh);
        System.out.println("Ho va ten:" + hoten);
        System.out.println("Diem uu tien: :" + uuTien);
        System.out.println("Dia chi:" + diaChi);
    }

}
