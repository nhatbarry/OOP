/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11.b1;

/**
 *
 * @author nhatb
 */
public class VanBan {
    private String st;

    public VanBan() {
    }

    public VanBan(String st) {
        this.st = st;
    }
    
    public int demSoTu(){
        return st.length();
    }

    public int demSoH(){
        int cnt = 0;
        for(int i = 0; i < st.length(); i++){
            if (st.charAt(i) == 'H' || st.charAt(i) == 'h') {
                cnt++;
            }
        }
        return cnt;
    }

    public String chuanHoa(){
        String stChuanHoa;
        stChuanHoa = st.strip();
        while (stChuanHoa.indexOf("  ", 0) != -1) {
            stChuanHoa = stChuanHoa.replace("  ", " ");
        }
        return stChuanHoa;
    }
}
