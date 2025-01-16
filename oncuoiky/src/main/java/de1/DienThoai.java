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
public class DienThoai extends HangHoa implements Serializable{
    private String nsx;
    private int dungLuong;
    private String mauSac;

    public DienThoai(String nsx, int dungLuong, String mauSac, String maHang, String ten, double giaBan) {
        super(maHang, ten, giaBan);
        this.nsx = nsx;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }
    
    

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Nha san xuat: " + nsx);
        System.out.println("Dung luong: " + dungLuong);
        System.out.println("Mau sac: " + mauSac);
    }
}
