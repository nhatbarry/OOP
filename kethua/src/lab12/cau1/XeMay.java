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
public class XeMay extends PTGT{
    private double congSuat;

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap cong suat: ");
        congSuat = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        super.xuat();
        System.out.println("cong suat: " + congSuat);
    }
}
