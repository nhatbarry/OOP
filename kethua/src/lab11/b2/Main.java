/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11.b2;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc(2, 1);
        SoPhuc b = new SoPhuc();
        b.nhap();
        SoPhuc c = a.nhan(b);
        c.xuat();
    }
}
