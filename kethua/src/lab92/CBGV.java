/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab92;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class CBGV {
    private double luongcung, thuong, phat, luongthuclinh;
    private Nguoi nguoi = new Nguoi();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        nguoi.nhap();

        System.out.print("Nhap luong cung: ");
        luongcung = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat = Double.parseDouble(sc.nextLine());
    }

    public void tinhluong(){
        luongthuclinh = luongcung + thuong - phat;
    }

    public void xuat(){
        nguoi.xuat();
        tinhluong();
        System.out.println("Luong cung: " + luongcung);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phat: " + phat);
        System.out.println("Luong thuc linh: " + luongthuclinh);
    }
}
