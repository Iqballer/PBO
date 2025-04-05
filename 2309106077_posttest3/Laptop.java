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

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }
    
    public String getSpek() { return spek; }
    public void setSpek(String spek) { this.spek = spek; }
    
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    // Method tampilkanData()
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Spesifikasi: " + spek);
        System.out.println("Harga: " + harga);
    }
}
