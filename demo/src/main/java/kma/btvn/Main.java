package kma.btvn;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        String path = "demo\\src\\main\\java\\kma\\btvn\\nhanvien.dat";
        ArrayList<NhanVien> list = Utils.doc(path);
        for(NhanVien nv : list){
            nv.xuat();
        }
    }
}
