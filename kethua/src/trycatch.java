import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trycatch {
    static int readInt() {
            try {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                String str = buf.readLine();
                return Integer.valueOf(str).intValue();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(readInt());
    }
}
