package kma.btvn;

import java.util.Scanner;

public class Person {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String gioitinh;
    
    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ten: ");
        hoten = sc.nextLine();
        System.out.print("ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("diachi: ");
        diachi = sc.nextLine();
        System.out.print("gioitinh: ");
        gioitinh = sc.nextLine();
    }

    public void xuat(){
        System.out.println("ten: " + hoten);
        System.out.println("ngay sinh: " + ngaysinh);
        System.out.println("dia chi: " + diachi);
        System.out.println("gioi tinh: " + gioitinh);
    }
}
