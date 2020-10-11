import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("MECETAK BILANGAN BULAT\n\n");
        print("Masukkan nilai n = ");
        int n = input.nextInt();
        for (int i = n; i > 0; i--) {
            print(i + "\n");
        }
    }

    private static void print(Object any){
        System.out.print(any);
    }
}
