class Matematika {
    // Mendeklarasikan variabel kelas
    private double hasil;

    // Method penjumlahan
    public double jumlah(double a, double b) {
        hasil = a + b;
        return hasil;
    }

    // Method pengurangan
    public double kurang(double a, double b) {
        hasil = a - b;
        return hasil;
    }

    // Method perkalian
    public double kali(double a, double b) {
        hasil = a * b;
        return hasil;
    }

    // Method pembagian
    public double bagi(double a, double b) {
        hasil = a / b;
        return hasil;
    }
}

public class MatematikaTest {

    public static void main(String[] args) {
        double a = 100.0;
        double b = 3.0;

        Matematika hitung = new Matematika();

        System.out.println("\nPROGRAM DEMO OPERASI MATEMATIKA");
        System.out.println("-------------------------------\n");
        System.out.println("Penjumlahan " + a + " + " + b + " = " + hitung.jumlah(a, b));
        System.out.println("\nPengurangan " + a + " - " + b + " = " + hitung.kurang(a, b));
        System.out.println("\nPerkalian " + a + " x " + b + " = " + hitung.kali(a, b));
        System.out.println("\nPembagian " + a + " / " + b + " = " + hitung.bagi(a, b));
    }
}