/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11.b2;

import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class SoPhuc {
    private double thuc, ao;

    public SoPhuc() {
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    
    public double getThuc() {
        return thuc;
    }

    public double getAo() {
        return ao;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        thuc = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phan ao: ");
        ao = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.printf("%.2f + %.2fi", thuc, ao);
    }
    public SoPhuc cong(SoPhuc n){
        return new SoPhuc(thuc + n.getThuc(), ao + n.getAo());
    }
    public SoPhuc nhan(SoPhuc n){
        Double phanThuc = thuc * n.getThuc() - ao * n.getAo();
        Double phanAo = thuc * n.getAo() + ao * n.getThuc();
        return new SoPhuc(phanThuc, phanAo);
    }
}
