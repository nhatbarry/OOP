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
public class KySu extends CanBo {
    private String nganh;



    @Override
    public String toString() {
        return "KySu - Ho va ten:" + getHoten() + ", nam sinh: " + getNamsinh() + ", gioi tinh: " + getGioitinh()
                + ", dia chi: " + getDiachi();
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nganh:");
        nganh = sc.nextLine();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Bac:" + nganh);
    }

}
