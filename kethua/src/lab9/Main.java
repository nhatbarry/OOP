/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<HoSoHocSinh> hs = new ArrayList<HoSoHocSinh>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hoc sinh can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++){
            System.out.println("Nhap hoc sinh thu " + (i + 1));
            HoSoHocSinh hso = new HoSoHocSinh();
            hso.nhap();
            hs.add(hso);
            System.out.println();
        }
        // tim kiem 1985
        System.out.println("Cac hs sinh nam 1985:");
        for (int i = 0; i < n; i++) {
            if (hs.get(i).getNguoi().getNamsinh() == 1985) {
                hs.get(i).xuat();
                System.out.println();
            }
        }

        //tim kiem 1985 va thai nguyen
        int cnt = 0;
        System.out.println("Cac hs sinh nam 1985 va que quan tai thai nguyen:");
        for (int i = 0; i < n; i++) {
            if (hs.get(i).getNguoi().getNamsinh() == 1985 && hs.get(i).getNguoi().getQuequan().equals("Thai Nguyen")) {
                hs.get(i).xuat();
                System.out.println();
                cnt++;
            }
        }
        System.out.println("Co tong cong " + cnt + " hoc sinh sinh nam 1985 va que quan tai Thai Nguyen");
    }
}
