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
public class OTo extends PTGT{
    private int soChoNgoi;
    private String kieuDongCo;
    public int getSoChoNgoi() {
        return soChoNgoi;
    }
    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    public String getKieuDongCo() {
        return kieuDongCo;
    }
    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so cho ngoi: ");
        soChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap kieu dong co: ");
        kieuDongCo = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println("So cho ngoi: " + soChoNgoi);
        System.out.println("Kieu dong co: " + kieuDongCo);
    }
}
