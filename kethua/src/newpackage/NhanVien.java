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
public class NhanVien extends CanBo {
    private String congviec;



    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien - Ho va ten: " + getHoten() + ", Cong viec: " + getCongviec() + ", Nam sinh: "
                + getNamsinh() + ", gioi tinh: " + getGioitinh() + ", dia chi: " + getDiachi();
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cong viec:");
        congviec = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Bac:" + congviec);
    }

}
