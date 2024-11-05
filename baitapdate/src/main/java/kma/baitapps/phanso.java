
package kma.baitapps;

public class phanso {
    private double tuso, mauso;

    public phanso(double tuso, double mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public phanso() {
    }

    public double getTuso() {
        return tuso;
    }

    public void setTuso(double tuso) {
        this.tuso = tuso;
    }

    public double getMauso() {
        return mauso;
    }

    public void setMauso(double mauso) {
        this.mauso = mauso;
    }

  
    
    public static double cong(phanso ps1, phanso ps2){
        return (ps1.getTuso() / ps1.getMauso()) + (ps2.getTuso() / ps2.getMauso());
    }
    public static double tru(phanso ps1, phanso ps2){
        return (ps1.getTuso() / ps1.getMauso()) - (ps2.getTuso() / ps2.getMauso());
    }
    public static double nhan(phanso ps1, phanso ps2){
        return (ps1.getTuso() / ps1.getMauso()) * (ps2.getTuso() / ps2.getMauso());
    }
    public static double chia(phanso ps1, phanso ps2){
        return (ps1.getTuso() / ps1.getMauso()) / (ps2.getTuso() / ps2.getMauso());
    }
}
