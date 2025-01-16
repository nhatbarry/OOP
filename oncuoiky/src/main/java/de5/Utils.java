/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nhatbarry
 */
public class Utils {
    public static ArrayList<NhanVien> doc(String path){
        try {
            FileReader fr = new FileReader(new File(path));
            BufferedReader bw = new BufferedReader(fr);
            ArrayList<NhanVien> list = new ArrayList<>();
            String s;
            while((s = bw.readLine()) != null){
                String[] data = s.split("\\$");
                String hoten = data[0];
                String ngaysinh = data[1];
                String diachi = data[2];
                String gioitinh = data[3];
                String manv = data[4];
                double hesoluong = Double.parseDouble(data[5]);
                String donvi = data[6];
                NhanVien nv = new NhanVien(manv, hesoluong, donvi, hoten, ngaysinh, diachi, gioitinh);
                list.add(nv);
            }
            return list;
        } catch (IOException | NumberFormatException e) {
        }
        return null;
    }
}
