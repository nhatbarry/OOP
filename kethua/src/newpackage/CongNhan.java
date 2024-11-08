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
public class CongNhan extends CanBo {
    private String Bac;



    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan - Bac" + getBac() + ", Ho va ten: " + getHoten() + ", Nam sinh: " + getNamsinh()
                + ", gioi tinh: " + getGioitinh() + ", dia chi: " + getDiachi();
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bac:");
        Bac = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Bac:" + Bac);
    }

}
