public class Laptop {
    String nama;
    String warna;
    String spek;
    double harga;

    public Laptop(String nama, String warna, String spek, double harga) {
        this.nama = nama;
        this.warna = warna;
        this.spek = spek;
        this.harga = harga;
    }

    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Spek  : " + spek);
        System.out.println("Harga : Rp " + harga);
        System.out.println("---------------------------");
    }
}
