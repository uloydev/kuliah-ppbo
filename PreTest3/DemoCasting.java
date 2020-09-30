public class DemoCasting {
    public static void main(String[] args) {
        // Narrowing
        double nilaiDouble = 3000.56d;
        long m = (long)nilaiDouble;
        int j = (int)m;
        byte x = (byte)j;

        // Widening
        byte nilaiByte = -72;
        int i = (int)nilaiByte;
        long p = (long)i;
        double z = (double)p;

        System.out.println("\nPROGRAM CASTING TIPE DATA");
        System.out.println("-------------------------\n");

        System.out.println("NARROWING");
        System.out.println("Nilai Asli Double\t" + nilaiDouble);
        System.out.println("Proses Narowwing long\t" + m);
        System.out.println("Proses Narowwing int\t" + j);
        System.out.println("Proses Narowwing byte\t" + x);

        System.out.println("\nWIDENING");
        System.out.println("Nilai Asli byte\t" + nilaiByte);
        System.out.println("Proses Narowwing int\t" + i);
        System.out.println("Proses Narowwing long\t" + p);
        System.out.println("Proses Narowwing double\t" + z);
    }
}