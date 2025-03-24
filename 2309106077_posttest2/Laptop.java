public class Laptop {
    private String nama;
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

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk spek
    public String getSpek() {
        return spek;
    }

    public void setSpek(String spek) {
        this.spek = spek;
    }

    // Getter dan Setter untuk harga
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan data laptop
    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Spek  : " + spek);
        System.out.println("Harga : Rp " + harga);
        System.out.println("---------------------------");
    }
}
