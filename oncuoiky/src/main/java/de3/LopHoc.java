package de3;

import java.util.ArrayList;

/**
 *
 * @author nhatbarry
 */
public class LopHoc {
    private String tenlop;
    private int siso;
    private ArrayList<SinhVien> list;

    public LopHoc(String tenlop, int siso) {
        this.tenlop = tenlop;
        this.siso = siso;
        this.list = new ArrayList<>();
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getSiso() {
        return siso;
    }

    public void setSiso(int siso) {
        this.siso = siso;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }
    
    public void add(SinhVien sv){
        list.add(sv);
    }
}
