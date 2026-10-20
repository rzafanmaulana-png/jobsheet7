import java.util.Scanner;

public class TiketBioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlah, diskon, totalBayar;
        int totalTiket = 0, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            if (jumlah > 10) {
                diskon = 15;
            } else if (jumlah > 4) {
                diskon = 10;
            } else {
                diskon = 0;
            }

            totalBayar = jumlah * HARGA_TIKET;
            totalBayar = totalBayar - (totalBayar * diskon / 100);

            totalTiket += jumlah;
            totalPenjualan += totalBayar;
            System.out.println("Total bayar pelanggan: Rp " + totalBayar);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}