package kma.lab1;

public class Lab1 {

    public static void main(String[] args) {
        System.out.printf("Le Anh Nhat\tCT070335\tCT7C\tnhatbarry@gmail.com");
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            if (i == 0) {
                System.out.println("No more bottles of beer on the wall.");
            }
            else
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\nTake one down, pass it around,\n", i, i);
        }
    }
}
