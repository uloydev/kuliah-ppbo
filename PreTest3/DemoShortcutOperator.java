class DemoShortcutOperator{
    public static void main(String[] args) {
        // membuat variabel
        int a = 2, hasil;

        System.out.println("\nPROGRAM DEMO SHORTCUT OPERATOR");
        System.out.println("------------------------------\n");

        System.out.println("Nilai awal a = " + a);

        a += 3; // a = 5
        System.out.println("\nShortcut Operator a += 3 menghasilkan : " + a);

        a *= 3; // a = 15
        System.out.println("\nShortcut Operator a *= 3 menghasilkan : " + a);

        System.out.println("\nNilai variabel a sebelum PostIncremental = " + a);
        hasil = 3*(a++); // hasil = 45
        System.out.println("Hasil PostIncremental 3*(a++) = " + hasil);
        System.out.println("Nilai variabel a setelah PostIncremental = " + a);

        System.out.println("\nNilai variabel a sebelum PreIncremental = " + a);
        hasil = 3*(++a); // hasil = 51
        System.out.println("Hasil PreIncremental 3*(++a) = " + hasil);
        System.out.println("Nilai variabel a setelah PreIncremental = " + a);

        System.out.println("\nNilai variabel a sebelum PostDecremental = " + a);
        hasil = 3*(a--); // hasil = 51
        System.out.println("Hasil PostDecremental 3*(a--) = " + hasil);
        System.out.println("Nilai variabel a setelah PostDecremental = " + a);

        System.out.println("\nNilai variabel a sebelum PreDecremental = " + a);
        hasil = 3*(--a); // hasil = 45
        System.out.println("Hasil PreDecremental 3*(--a) = " + hasil);
        System.out.println("Nilai variabel a setelah PreDecremental = " + a);
    }
}