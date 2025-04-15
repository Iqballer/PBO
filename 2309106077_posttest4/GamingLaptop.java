public class GamingLaptop extends Laptop {
    private int refreshRate;
    private String gpu;

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
}
