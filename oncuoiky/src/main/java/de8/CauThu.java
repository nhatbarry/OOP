/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8;

import java.io.Serializable;

/**
 *
 * @author nhatbarry
 */
public class CauThu implements Serializable{
    private String id;
    private String ten;
    private int namsinh;
    private String vitri;

    public CauThu(String id, String ten, int namsinh, String vitri) {
        this.id = id;
        this.ten = ten;
        this.namsinh = namsinh;
        this.vitri = vitri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    
}
