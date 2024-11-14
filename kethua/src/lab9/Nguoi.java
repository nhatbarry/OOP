/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Nguoi {
    private String hoten, quequan;
    private int tuoi, namsinh;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap que quan: ");
        quequan = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        namsinh = Integer.parseInt(sc.nextLine());
        System.out.println();
    }

    public String getQuequan() {
        return quequan;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void xuat(){
        System.out.println("Ten: " + hoten);
        System.out.println("Que quan: " + quequan);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println();
    }
}
