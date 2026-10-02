import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // ==================== FOR ====================
        System.out.print("for      : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // ==================== WHILE ====================
        System.out.print("while    : ");

        int iWhile = 1;

        while (iWhile <= n) {
            System.out.print(iWhile + " ");
            iWhile++;
        }

        System.out.println();

        // ==================== DO-WHILE ====================
        System.out.print("do-while : ");

        int iDo = 1;

        do {
            System.out.print(iDo + " ");
            iDo++;
        } while (iDo <= n);

        System.out.println();

        /*
         * Saat n = 0:
         * for dan while tidak mencetak angka karena kondisi
         * langsung bernilai false.
         *
         * do-while tetap mencetak 1 karena kondisi diperiksa
         * setelah badan loop dijalankan.
         *
         * Kesimpulan:
         * do-while mengecek kondisinya sesudah badan loop dijalankan,
         * jadi badannya pasti jalan minimal sekali.
         */

        // ==================== OFF-BY-ONE ====================

        int kurang = 0;

        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;

        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");


        // ==================== CONTINUE DAN BREAK ====================

        int jumlahPrintln = 0;

        System.out.print("Disaring : ");

        for (int i = 1; i <= 10; i++) {

            // Lewati angka genap
            if (i % 2 == 0) {
                continue;
            }

            // Berhenti jika i lebih dari 7
            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            jumlahPrintln++;
        }

        System.out.println();

        System.out.println("Sampai println  : " + jumlahPrintln + " kali");

        /*
         * Loop tidak berhenti di i = 8 karena continue untuk angka
         * genap dijalankan lebih dahulu.
         *
         * Saat i = 8, kondisi i % 2 == 0 bernilai true,
         * sehingga continue langsung melewati bagian break.
         *
         * Akibatnya kondisi i > 7 tidak sempat diperiksa.
         */

        scanner.close();
    }
}


