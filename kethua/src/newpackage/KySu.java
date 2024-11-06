/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author nhatb
 */
public class KySu extends CanBo {
    private String nganh;

    public KySu(String hoten, int namsinh, String gioitinh, String diachi, String nganh) {
        super(hoten, namsinh, gioitinh, diachi);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu - Ho va ten:" + getHoten() + ", nam sinh: " + getNamsinh() + ", gioi tinh: " + getGioitinh()
                + ", dia chi: " + getDiachi();
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

}
