import java.util.Scanner;
public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner Array25 = new Scanner(System.in);
        Scanner Array225 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        
        String [][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama: ");
            nama = Array25.nextLine();
            System.out.println("Masukan baris: ");
            baris = Array25.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = Array25.nextInt();
            next = Array25.nextLine();
            
            penonton[baris-1][kolom-1] = nama;

            System.out.print("input penonton lainnya? (y/t): ");
            next = Array25.nextLine();

            if (next.equalsIgnoreCase("t")) {
                break;
            }
        }
    }
}
