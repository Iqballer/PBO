public class Ultrabook extends Laptop {
    private double berat;
    private int bateraiTahan;

    public Ultrabook(String nama, String warna, String spek, double harga, double berat, int bateraiTahan) {
        super(nama, warna, spek, harga);
        this.berat = berat;
        this.bateraiTahan = bateraiTahan;
    }

    // Getter dan Setter
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getBateraiTahan() {
        return bateraiTahan;
    }

    public void setBateraiTahan(int bateraiTahan) {
        this.bateraiTahan = bateraiTahan;
    }

    @Override
    public void deskripsi() {
        System.out.println("Tipe: Ultrabook | Berat: " + berat + "kg, Baterai Tahan: " + bateraiTahan + " jam");
    }
}
