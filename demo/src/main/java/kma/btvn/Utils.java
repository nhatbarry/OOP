package kma.btvn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Utils {
    public static ArrayList<NhanVien> doc(String path) {
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        NhanVien nv;
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream(path);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] thongtin = line.split("\\$");
                String hoten = thongtin[0];
                String ngaysinh = thongtin[1];
                String diachi = thongtin[2];
                String gioitinh = thongtin[3];
                String phongban = thongtin[4];
                double hesoluong = Double.parseDouble(thongtin[5]);
                int thamnien = Integer.parseInt(thongtin[6]);
                int luongcoban = Integer.parseInt(thongtin[7]);
                nv = new NhanVien(hoten, ngaysinh, diachi, gioitinh, phongban, hesoluong, thamnien, luongcoban);
                list.add(nv);
            }

            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi IO");
        } catch (NumberFormatException e) {
            System.out.println("Sai dinh dang");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return list;
    }

    public static void ghi(String path, NhanVien a){
        NhanVien nv = a;
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(path);
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            String data = nv.getHoten() + "$" + nv.getNgaysinh() + "$" 
                + nv.getDiachi() + "$" + nv.getGioitinh() + "$" + nv.getPhongban() 
                    + "$" + nv.getHesoluong() + "$" + nv.getThamnien() + "$" + nv.getLuongcoban();
            bw.append(data);
        } catch (Exception e) {
            System.out.println("sai roi");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
