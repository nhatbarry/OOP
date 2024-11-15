/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab92;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CBGV> cb = new ArrayList<CBGV>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can bo can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++){
            System.out.println("Nhap giao vien thu " + (i + 1));
            CBGV cbgv = new CBGV();
            cbgv.nhap();
            cb.add(cbgv);
            System.out.println();
        }

        System.out.println("Danh sach giao vien va luong thuc linh:");
        for(int i = 0; i < n; i++){
            cb.get(i).xuat();
            System.out.println();
        }
    }
}
