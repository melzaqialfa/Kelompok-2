import java.util.ArrayList;

public class Parkir {
    private ArrayList<Kendaraan> dataKendaraan = new ArrayList<>();

    // Tambah kendaraan
    public void tambahKendaraan(Kendaraan k) {
        dataKendaraan.add(k);
    }

    // Hapus kendaraan berdasarkan plat nomor
    public void hapusKendaraan(String platNomor) {
        for (int i = 0; i < dataKendaraan.size(); i++) {
            if (dataKendaraan.get(i).getPlatNomor().equalsIgnoreCase(platNomor)) {
                dataKendaraan.remove(i);
                System.out.println("Kendaraan dengan plat " + platNomor + " telah dihapus.");
                return;
            }
        }
        System.out.println("Kendaraan tidak ditemukan!");
    }

    // Tampilkan laporan
    public void tampilkanLaporan() {
        int totalPendapatan = 0;

        System.out.println("\n===== LAPORAN PARKIR =====");
        if (dataKendaraan.isEmpty()) {
            System.out.println("Belum ada kendaraan yang terdaftar.");
        } else {
            for (Kendaraan k : dataKendaraan) {
                System.out.println("---------------------------");
                System.out.println("Plat Nomor : " + k.getPlatNomor());
                System.out.println("Jenis      : " + k.getJenis());
                System.out.println("Jam Masuk  : " + k.getJamMasuk());
                System.out.println("Jam Keluar : " + k.getJamKeluar());
                System.out.println("Durasi     : " + k.hitungDurasi() + " jam");
                System.out.println("Biaya      : Rp " + k.hitungBiaya());
                totalPendapatan += k.hitungBiaya();
            }
            System.out.println("---------------------------");
            System.out.println("Total Pendapatan: Rp " + totalPendapatan);
        }
    }
}