import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Parkir parkir = new Parkir();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM PARKIR OTOMATIS ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Lihat Laporan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // agar tidak error nextLine

            if (pilihan == 1) {
                System.out.print("Masukkan plat nomor : ");
                String plat = input.nextLine();
                System.out.print("Masukkan jenis (mobil/motor): ");
                String jenis = input.nextLine();
                System.out.print("Masukkan jam masuk : ");
                int masuk = input.nextInt();
                System.out.print("Masukkan jam keluar : ");
                int keluar = input.nextInt();

                if (keluar < masuk) {
                    System.out.println("Jam keluar tidak boleh lebih kecil dari jam masuk!");
                } else {
                    Kendaraan k = new Kendaraan(plat, jenis, masuk, keluar);
                    parkir.tambahKendaraan(k);
                    System.out.println("Data kendaraan berhasil ditambahkan!");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan plat nomor yang ingin dihapus: ");
                String hapusPlat = input.nextLine();
                parkir.hapusKendaraan(hapusPlat);

            } else if (pilihan == 3) {
                parkir.tampilkanLaporan();

            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
        input.close();
    }
}