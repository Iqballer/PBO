import java.util.ArrayList;
import java.util.Scanner;

public class LaptopCrud {
    static ArrayList<Laptop> daftarLaptop = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void tambahLaptop() {
        System.out.println("Pilih jenis laptop:");
        System.out.println("1. Laptop Standar");
        System.out.println("2. Gaming Laptop");
        System.out.println("3. Ultrabook");
        System.out.println("4. Workstation");
        System.out.println("5. Convertible Laptop");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();
    
        System.out.print("Masukkan Nama Laptop: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Warna Laptop: ");
        String warna = input.nextLine();
        System.out.print("Masukkan Spek Laptop: ");
        String spek = input.nextLine();
        System.out.print("Masukkan Harga Laptop: ");
        double harga = input.nextDouble();
        input.nextLine();
    
        switch (jenis) {
            case 2:
                System.out.print("Masukkan Refresh Rate (Hz): ");
                int refreshRate = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan GPU: ");
                String gpu = input.nextLine();
                daftarLaptop.add(new GamingLaptop(nama, warna, spek, harga, refreshRate, gpu));
                break;
            case 3:
                System.out.print("Masukkan Berat (kg): ");
                double berat = input.nextDouble();
                System.out.print("Masukkan Ketahanan Baterai (jam): ");
                int bateraiTahan = input.nextInt();
                input.nextLine();
                daftarLaptop.add(new Ultrabook(nama, warna, spek, harga, berat, bateraiTahan));
                break;
            case 4:
                System.out.print("Masukkan CPU: ");
                String cpu = input.nextLine();
                System.out.print("Masukkan RAM (GB): ");
                int ram = input.nextInt();
                input.nextLine();
                daftarLaptop.add(new Workstation(nama, warna, spek, harga, cpu, ram));
                break;
            case 5:
                System.out.print("Apakah memiliki layar sentuh? (true/false): ");
                boolean touchscreen = input.nextBoolean();
                System.out.print("Apakah keyboard bisa dilepas? (true/false): ");
                boolean detachableKeyboard = input.nextBoolean();
                input.nextLine();
                daftarLaptop.add(new ConvertibleLaptop(nama, warna, spek, harga, touchscreen, detachableKeyboard));
                break;
            default:
                daftarLaptop.add(new Laptop(nama, warna, spek, harga));
                break;
        }
    
        System.out.println("Laptop berhasil ditambahkan!");
    }
    

    public static void tampilkanLaptop() {
        if (daftarLaptop.isEmpty()) {
            System.out.println("Belum ada laptop yang terdaftar.");
            return;
        }
        System.out.println("\n===== Daftar Laptop =====");
        for (int i = 0; i < daftarLaptop.size(); i++) {
            System.out.println("ID: " + (i + 1));
            daftarLaptop.get(i).tampilkanData();
        }
    }

    public static void editLaptop() {
        tampilkanLaptop();
        if (daftarLaptop.isEmpty()) return;
    
        System.out.print("Masukkan ID laptop yang ingin diedit: ");
        int id = input.nextInt();
        input.nextLine();
    
        if (id < 1 || id > daftarLaptop.size()) {
            System.out.println("ID tidak ditemukan!");
            return;
        }
    
        Laptop laptop = daftarLaptop.get(id - 1);
    
        // Edit data umum
        System.out.print("Nama Baru (" + laptop.getNama() + "): ");
        laptop.setNama(input.nextLine());
        System.out.print("Warna Baru (" + laptop.getWarna() + "): ");
        laptop.setWarna(input.nextLine());
        System.out.print("Spek Baru (" + laptop.getSpek() + "): ");
        laptop.setSpek(input.nextLine());
        System.out.print("Harga Baru (" + laptop.getHarga() + "): ");
        laptop.setHarga(input.nextDouble());
        input.nextLine();
    
        // Edit atribut spesifik berdasarkan tipe laptop
        if (laptop instanceof GamingLaptop) {
            GamingLaptop gLaptop = (GamingLaptop) laptop;
            System.out.print("Refresh Rate Baru (" + gLaptop.getRefreshRate() + "Hz): ");
            gLaptop.setRefreshRate(input.nextInt());
            input.nextLine();
            System.out.print("GPU Baru (" + gLaptop.getGpu() + "): ");
            gLaptop.setGpu(input.nextLine());
        } else if (laptop instanceof Ultrabook) {
            Ultrabook uLaptop = (Ultrabook) laptop;
            System.out.print("Berat Baru (" + uLaptop.getBerat() + " kg): ");
            uLaptop.setBerat(input.nextDouble());
            System.out.print("Ketahanan Baterai Baru (" + uLaptop.getBateraiTahan() + " jam): ");
            uLaptop.setBateraiTahan(input.nextInt());
            input.nextLine();
        } else if (laptop instanceof Workstation) {
            Workstation wLaptop = (Workstation) laptop;
            System.out.print("CPU Baru (" + wLaptop.getCpu() + "): ");
            wLaptop.setCpu(input.nextLine());
            System.out.print("RAM Baru (" + wLaptop.getRam() + " GB): ");
            wLaptop.setRam(input.nextInt());
            input.nextLine();
        } else if (laptop instanceof ConvertibleLaptop) {
            ConvertibleLaptop cLaptop = (ConvertibleLaptop) laptop;
            System.out.print("Layar Sentuh Baru (true/false) (" + cLaptop.isTouchscreen() + "): ");
            cLaptop.setTouchscreen(input.nextBoolean());
            System.out.print("Keyboard Lepas Baru (true/false) (" + cLaptop.isDetachableKeyboard() + "): ");
            cLaptop.setDetachableKeyboard(input.nextBoolean());
            input.nextLine();
        }
    
        System.out.println("Laptop berhasil diperbarui!");
    }
    
    

    public static void hapusLaptop() {
        tampilkanLaptop();
        if (daftarLaptop.isEmpty()) return;

        System.out.print("Masukkan ID laptop yang ingin dihapus: ");
        int id = input.nextInt();
        input.nextLine();
        if (id < 1 || id > daftarLaptop.size()) {
            System.out.println("ID tidak ditemukan!");
            return;
        }
        daftarLaptop.remove(id - 1);
        System.out.println("Laptop berhasil dihapus!");
    }
}
