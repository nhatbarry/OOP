/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;
import java.util.*;
/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho kp = new KhuPho();
        System.out.print("Nhap so ho dan trong khu pho: ");
        int n = sc.nextInt();
        sc.nextLine();
        kp.nhap(n);
        kp.xuat();
    }
}
