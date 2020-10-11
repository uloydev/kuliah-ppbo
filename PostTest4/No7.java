import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        print("menggambar matrix nxn ZIG-ZAG \n\n");
        print("Masukkan nilai n = ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                print(" ");
            }
            for (int j = 0; j < n; j++) {
                print("*");
            }
            print("\n");
        }
    }

    private static void print(Object any){
        System.out.print(any);
    }
}   