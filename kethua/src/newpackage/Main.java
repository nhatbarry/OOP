
package newpackage;

/**
 *
 * @author nhatb
 */
public class Main {
    public static void main(String[] args) {
        CongNhan cn1 = new CongNhan("congnhan", 2000, "Nam", "Ha Noi", "3/7");
        KySu ks1 = new KySu("kysu", 2001, "Nam", "HCM", "Ky thuat vat lieu");
        NhanVien nv1 = new NhanVien("nhanvien", 2002, "Nu", "Nam Dinh", "Giay to");
        System.out.println(cn1.toString());
        System.out.println(ks1.toString());
        System.out.println(nv1.toString());
    }

}
