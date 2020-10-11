import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, a, b, c;
        boolean exit = false;
        String[] line;
        print("Selamat datang di program fungsi matematis.\n\n");
        while (!exit) {
            showMenu();
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 0:
                    exit = true;
                    print("Terima kasih telah menggunakan program ini..");
                    break;
                case 1:
                    print("\n\nMasukkan 2 buah bilangan : ");
                    line = input.nextLine().split(" ");
                    a = Integer.parseInt(line[0]);
                    b = Integer.parseInt(line[1]);
                    print("Jumlahnya adalah : " + tambah(a, b));
                    break;
                case 2:
                    print("\n\nMasukkan 3 buah bilangan : ");
                    line = input.nextLine().split(" ");
                    a = Integer.parseInt(line[0]);
                    b = Integer.parseInt(line[1]);
                    c = Integer.parseInt(line[2]);
                    print("Rata-ratanya adalah : " + rataRata(a, b, c));
                    break;
                case 3:
                    print("\n\nMasukkan 2 buah bilangan : ");
                    line = input.nextLine().split(" ");
                    a = Integer.parseInt(line[0]);
                    b = Integer.parseInt(line[1]);
                    print("hasil pangkat adalah : " + pangkat(a, b));
                    break;
                default:
                    print("\nMaaf, angka yang anda masukkan tidak terdapat dalam pilihan\n");
            }
        }
    }

    private static int tambah(int a, int b) {
        return a + b;
    }

    private static double rataRata(int a, int b, int c) {
        return (double)(a + b + c) / 3;
    }

    private static int pangkat(int a, int b) {
        int hasil = a;
        for (int i = 1; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    private static void print(Object any){
        System.out.print(any);
    }

    private static void showMenu() {
        print("\n\nFungsi yang dapat Anda lakukan antara lain:\n");
        print("1. Pertambahan\n");
        print("2. Rata-Rata\n");
        print("3. Pangkat\n");
        print("0. Untuk Keluar\n");
        print("Silahkan Masukkan Pilihan Anda: ");
    }
}