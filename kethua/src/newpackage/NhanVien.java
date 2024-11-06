/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author nhatb
 */
public class NhanVien extends CanBo {
    private String congviec;

    public NhanVien(String hoten, int namsinh, String gioitinh, String diachi, String congviec) {
        super(hoten, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien - Ho va ten: " + getHoten() + ", Cong viec: " + getCongviec() + ", Nam sinh: "
                + getNamsinh() + ", gioi tinh: " + getGioitinh() + ", dia chi: " + getDiachi();
    }

}
