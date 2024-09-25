
import java.util.Scanner;

public class Tugas2 {
    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
    public static double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar: ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan Pilihan Anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi: " + luasPersegi(sisi));
                System.out.println("Keliling Persegi: " + kelilingPersegi(sisi));
                break;
            case 2:
                System.out.println("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.println("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                System.out.println("Luas persegi panjang: " + kelilingPersegiPanjang(panjang, lebar));
                break;
            case 3:
                System.out.println("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran: " + kelilingLingkaran(jariJari));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}
