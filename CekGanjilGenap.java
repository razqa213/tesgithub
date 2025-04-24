import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka batas akhir: ");
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                System.out.println("Angka " + i + " : genap");
            } else {
                System.out.println("Angka " + i + " : ganjil");
            }
        } 

        input.close();
    }
}
    
