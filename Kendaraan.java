public class Kendaraan {
    private String platNomor;
    private String jenis; // Mobil / Motor
    private int jamMasuk;
    private int jamKeluar;

    // Constructor
    public Kendaraan(String platNomor, String jenis, int jamMasuk, int jamKeluar) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    // Getter dan Setter
    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public int getJamMasuk() { return jamMasuk; }
    public void setJamMasuk(int jamMasuk) { this.jamMasuk = jamMasuk; }

    public int getJamKeluar() { return jamKeluar; }
    public void setJamKeluar(int jamKeluar) { this.jamKeluar = jamKeluar; }

    // Method hitung durasi
    public int hitungDurasi() {
        return jamKeluar - jamMasuk;
    }

    // Method hitung biaya
    public int hitungBiaya() {
        int durasi = hitungDurasi();
        int biaya = 0;

        if (jenis.equalsIgnoreCase("mobil")) {
            biaya = durasi * 7000;
        } else if (jenis.equalsIgnoreCase("motor")) {
            biaya = durasi * 4000;
        } else {
            System.out.println("Jenis kendaraan tidak dikenal!");
        }

        return biaya;
    }
}