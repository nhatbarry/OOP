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
public class XeTai extends PTGT{
    private double trongTai;

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap trong tai: ");
        trongTai = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        super.xuat();
        System.out.println("Trong tai: " + trongTai);
    }
}
