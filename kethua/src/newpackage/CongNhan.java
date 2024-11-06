/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author nhatb
 */
public class CongNhan extends CanBo{
    private String Bac;

    public CongNhan(String hoten, int namsinh, String gioitinh, String diachi, String bac) {
        super(hoten, namsinh, gioitinh, diachi);
        Bac = bac;
    }

    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan - Bac" + getBac() + ", Ho va ten: " + getHoten() + ", Nam sinh: " + getNamsinh()
                + ", gioi tinh: " + getGioitinh() + ", dia chi: " + getDiachi();
    }
    
}
