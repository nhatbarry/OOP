package kma.btvn;

import java.util.Scanner;

public class NhanVien extends Person{
    private String phongban;
    private double hesoluong;
    private int thamnien;
    private int luongcoban;

    public NhanVien(String hoten, String ngaysinh, String diachi, String gioitinh, String phongban, double hesoluong,
            int thamnien, int luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
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
