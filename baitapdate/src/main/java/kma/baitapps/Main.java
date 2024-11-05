
package kma.baitapps;

public class Main {
    public static void main(String[] args) {
        
        phanso ps1 = new phanso();
        phanso ps2 = new phanso(1, 2);
        ps1.setTuso(1);
        ps1.setMauso(3);
        System.out.println("Tong 2 ps: " + phanso.cong(ps1, ps2));
        System.out.println("Hieu 2 ps: " + phanso.tru(ps1, ps2));
        System.out.println("Tich 2 ps: " + phanso.nhan(ps1, ps2));
        System.out.println("Thuong 2 ps: " + phanso.chia(ps1, ps2));
        System.out.println(ps1.getTuso() + "/" + ps1.getMauso());
        System.out.println(ps2.getTuso() + "/" + ps2.getMauso());
    }
}
