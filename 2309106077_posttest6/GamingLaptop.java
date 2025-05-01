public class GamingLaptop extends Laptop implements WarrantyInfo {
    private int refreshRate;
    private String gpu;
    private static int masaGaransi = 2; 

    public GamingLaptop(String nama, String warna, String spek, double harga, int refreshRate, String gpu) {
        super(nama, warna, spek, harga);
        this.refreshRate = refreshRate;
        this.gpu = gpu;
    }

    // Getter dan Setter
    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void tampilkanGaransi() {
        System.out.println("Garansi berlaku selama " + masaGaransi + " tahun.");
    }

    @Override
    public void klaimGaransi() {
        System.out.println("Silakan bawa bukti pembelian untuk klaim garansi.");
    }

    public static void setMasaGaransi(int tahun) {
        masaGaransi = tahun;
    }

    @Override
    public void deskripsi() {
        System.out.println("Tipe: Gaming Laptop | GPU: " + gpu + ", Refresh Rate: " + refreshRate + "Hz");
    }
}
