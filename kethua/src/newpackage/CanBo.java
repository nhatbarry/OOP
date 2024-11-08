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
public class CanBo {
    private String hoten;
    private int namsinh;
    private String gioitinh;
    private String diachi;



    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        hoten = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        namsinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gioitinh = sc.nextLine();
        System.out.println("Nhap dia chi:");
        diachi = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten:" + hoten);
        System.out.println("Nam sinh:" + namsinh);
        System.out.println("Gioi tinh:" + gioitinh);
        System.out.println("Dia chi:" + diachi);
    }

}
