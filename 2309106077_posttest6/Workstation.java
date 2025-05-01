public class Workstation extends Laptop {
    private String cpu;
    private int ram;

    public Workstation(String nama, String warna, String spek, double harga, String cpu, int ram) {
        super(nama, warna, spek, harga);
        this.cpu = cpu;
        this.ram = ram;
    }

    // Getter dan Setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void deskripsi() {
        System.out.println("Tipe: Workstation | CPU: " + cpu + ", RAM: " + ram + "GB");
    }
}
