/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12.cau1;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class PTGT {
    private String hang, mau;
    private int namSx;
    private double giaBan;
    public String getHang() {
        return hang;
    }
    public void setHang(String hang) {
        this.hang = hang;
    }
    public String getMau() {
        return mau;
    }
    public void setMau(String mau) {
        this.mau = mau;
    }
    public int getNamSx() {
        return namSx;
    }
    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hang sx: ");
        hang = sc.nextLine();
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
        System.out.print("Nhap nam sx: ");
        namSx = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia ban:");
        giaBan = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Hang sx: " + hang);
        System.out.println("Mau: " + mau);
        System.out.println("Nam sx: " + namSx);
        System.out.println("Gia ban: " + giaBan);
    }
}
