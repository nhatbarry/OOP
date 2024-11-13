/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;
import java.util.ArrayList;

import lab8.HoDan;
/**
 *
 * @author nhatb
 */
public class KhuPho {
    private ArrayList<HoDan> hodan = new ArrayList<HoDan>();

    public void nhap(int n){
        for(int i = 0; i < n; i++){
            System.out.println("Nhap vao thong tin ho dan thu: " + (i + 1));
            HoDan hd = new HoDan();
            hd.nhap();
            hodan.add(hd);
            System.out.println();
        }
    }

    public void xuat(){
        System.out.println("Khu pho co tong cong " + hodan.size() + " ho dan: ");
        for (int i = 0; i < hodan.size(); i++) {
            hodan.get(i).xuat();
            System.out.println();
        }
    }
}
