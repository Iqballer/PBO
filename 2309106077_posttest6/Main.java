import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LaptopCrud laptopCrud = new LaptopCrud();
        while (true) {
            try {
                System.out.println("\n===== Menu Laptop =====");
                System.out.println("1. Tambah Laptop");
                System.out.println("2. Tampilkan Laptop");
                System.out.println("3. Edit Laptop");
                System.out.println("4. Hapus Laptop");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = input.nextInt();
                input.nextLine(); 
    
                switch (pilihan) {
                    case 1:
                        laptopCrud.tambahLaptop();
                        break;
                    case 2:
                        laptopCrud.tampilkanLaptop();
                        break;
                    case 3:
                        laptopCrud.editLaptop();
                        break;
                    case 4:
                        laptopCrud.hapusLaptop();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan angka saja.");
                input.nextLine(); // membersihkan buffer
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine();
            }
        }
    }
}
