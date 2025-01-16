
package de8;

import java.util.ArrayList;

/**
 *
 * @author nhatbarry
 */
public class Utils {
    public static void sort(ArrayList<CauThu> list){
        list.sort((CauThu o1, CauThu o2) -> o1.getTen().compareTo(o2.getTen()));
    }
}
