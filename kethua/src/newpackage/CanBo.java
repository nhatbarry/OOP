/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author nhatb
 */
public class CanBo {
    private String hoten;
    private int namsinh;
    private String gioitinh;
    private String diachi;

    

    public CanBo(String hoten, int namsinh, String gioitinh, String diachi) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
