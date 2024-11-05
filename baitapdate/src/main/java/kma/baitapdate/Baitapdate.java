
package kma.baitapdate;
import java.util.*;
public class Baitapdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDate md1 = new MyDate();
        int d, m, y;
        System.out.print("Nhap ngay, thang, nam: ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        md1.setDate(d);
        md1.setMonth(m);
        md1.setYear(y);
        System.out.printf("ngay %d thang %d nam %d", md1.getDate(), md1.getMonth(), md1.getYear());
    }
}
