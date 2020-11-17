public class Main {
    public static void main(String[] args) {
        Toko tokoBatak = new Toko();

        for (String key : tokoBatak.getKategori()) {
            print("\nkategori " + key);
            print("\n========================\n");
            for (String subKey : tokoBatak.getSubKategori(key)) {
                print(subKey + "\n");
            }
        }
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}
