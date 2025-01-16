/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

import java.io.Serializable;

/**
 *
 * @author nhatbarry
 */
public class HangHoa implements Serializable{
    private String maHang;
    private String ten;
    private double giaBan;

    public HangHoa(String maHang, String ten, double giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }
    
    

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    public void xuat(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten: " + ten);
        System.out.println("Gia ban: " + giaBan);
    }
}
