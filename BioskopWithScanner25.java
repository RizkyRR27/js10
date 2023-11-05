import java.util.Scanner;
public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner Array25 = new Scanner(System.in);
        Scanner Array225 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        
        String [][] penonton = new String[8][2];
            

        while (true) {
            System.out.println("menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("pilih menu 1/2/3: ");
            int menu = Array25.nextInt();
            Array25.nextLine();

            switch (menu) {
                case 1:

            System.out.print("Masukan nama: ");
            nama = Array25.nextLine();
            System.out.println("Masukan baris: ");
            baris = Array25.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = Array25.nextInt();
            Array25.nextLine();

            if (baris >= 1 && baris <= 8 && kolom >= 1 && kolom <= 2) {
                if (penonton[baris - 1][kolom -1] == null){
                    penonton[baris - 1][kolom -1] = nama;

                    System.out.println("data penonton telah diinput.");
                } else {
                    System.out.println("bangku telah terisi penonton lain ");
                }
            } else{
                System.out.println("kursi tidak tersedia");
            }
            break;

            case 2:
            System.out.println("daftar penonton: ");
            for (int r= 0; r< 8; r++){
                 for (int m=0; m<2; m++){
                    if (penonton[r][m] == null){
                        System.out.println("***");
                    } else{
                        System.out.println(penonton[r][m] + " ");
                    }
                 }
                 System.out.println();
            }
           break;


           case 3:
           System.out.println("thanks");
           default:
           System.out.println("menu tidak valid. silahkan masukan menu yang sesuai");
            }
            System.out.println("anda mau lanjut? (y/t): ");
            next = Array25.nextLine();

            if (next.equalsIgnoreCase("t")){
                break;
            }
            
            
        }
    }
}
