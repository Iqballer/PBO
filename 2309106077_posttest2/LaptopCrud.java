import java.util.ArrayList;
import java.util.Scanner;

public class LaptopCrud {
    static ArrayList<Laptop> daftarLaptop = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void tambahLaptop() {
        System.out.print("Masukkan Nama Laptop: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Warna Laptop: ");
        String warna = input.nextLine();
        System.out.print("Masukkan Spek Laptop: ");
        String spek = input.nextLine();
        System.out.print("Masukkan Harga Laptop: ");
        double harga = input.nextDouble();
        input.nextLine(); 

        daftarLaptop.add(new Laptop(nama, warna, spek, harga));
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

        System.out.print("Nama Baru (" + laptop.getNama() + "): ");
        laptop.setNama(input.nextLine());
        System.out.print("Warna Baru (" + laptop.getWarna() + "): ");
        laptop.setWarna(input.nextLine());
        System.out.print("Spek Baru (" + laptop.getSpek() + "): ");
        laptop.setSpek(input.nextLine());
        System.out.print("Harga Baru (" + laptop.getHarga() + "): ");
        laptop.setHarga(input.nextDouble());
        input.nextLine();

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
