package de3;

/**
 *
 * @author nhatbarry
 */
public class SinhVien {
    private String hoten, masv;
    private double diemhp, diemqt;

    public SinhVien(String hoten, String masv, double diemhp, double diemqt) {
        this.hoten = hoten;
        this.masv = masv;
        this.diemhp = diemhp;
        this.diemqt = diemqt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemhp() {
        return diemhp;
    }

    public void setDiemhp(double diemhp) {
        this.diemhp = diemhp;
    }

    public double getDiemqt() {
        return diemqt;
    }

    public void setDiemqt(double diemqt) {
        this.diemqt = diemqt;
    }
    
    public double diemtb(){
        return diemqt * 0.3 + diemhp * 0.7;
    }
}
