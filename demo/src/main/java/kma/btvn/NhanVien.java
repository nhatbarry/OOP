package kma.btvn;

import java.util.Scanner;

public class NhanVien extends Person{
    private String phongban;
    private double hesoluong;
    private int thamnien;
    private int luongcoban;

    

    public NhanVien() {
    }

    public NhanVien(String hoten, String ngaysinh, String diachi, String gioitinh, String phongban, double hesoluong,
            int thamnien, int luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public int getThamnien() {
        return thamnien;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("phong ban: ");
        phongban = sc.nextLine();
        System.out.print("he so luong: ");
        hesoluong = Double.parseDouble(sc.nextLine());
        System.out.print("tham nien: ");
        thamnien = Integer.parseInt(sc.nextLine());
        System.out.print("luong co ban: ");
        luongcoban = Integer.parseInt(sc.nextLine());
    }

    double luongthuclinh(){
        return luongcoban * (hesoluong * (1 + thamnien / 100));
    }

    public void xuat(){
        super.xuat();
        System.out.println("phong ban: " + phongban);
        System.out.println("luong thuc linh: " + luongthuclinh());
    }
}
