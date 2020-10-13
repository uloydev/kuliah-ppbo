import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga;
        String jualTunai;

        print("Harga Motor : ");
        harga = input.nextInt();
        input.nextLine();
        print("Jual tunai (y/n) : ");
        jualTunai = input.nextLine();
        if (jualTunai.equals("y")) {
            harga -= harga * 0.2;
            print("\nHarga jual = " + harga);
        } else {
            harga = harga / 10;
            print("\nCicilan Perbulan = " + harga);
        }
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}
