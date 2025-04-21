public abstract class Laptop {
    private final String nama;
    private String warna;
    private String spek;
    private double harga;

    // Constructor
    public Laptop(String nama, String warna, String spek, double harga) {
        this.nama = nama;
        this.warna = warna;
        this.spek = spek;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    // Nama tidak bisa diubah karena final, maka tidak ada setter untuk nama

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public String getSpek() { return spek; }
    public void setSpek(String spek) { this.spek = spek; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    // Abstract Method
    public abstract void deskripsi();

    // Method tampilkanData()
    public final void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Spesifikasi: " + spek);
        System.out.println("Harga: " + harga);
    }

    public void tampilkanData(boolean singkat) {
        if (singkat) {
            System.out.println("Nama: " + nama + ", Harga: " + harga);
        } else {
            tampilkanData(); // Panggil versi lengkap
        }
    }
}