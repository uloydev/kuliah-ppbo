import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("MENCETAK BILANGAN GANJIL\n\n");
        print("Masukkan nilai n = ");
        int n = input.nextInt();
        int i = 1;
        do {
            print(i + "\n");
            i += 2;
        } while (i < n);
    }

    private static void print(Object any){
        System.out.print(any);
    }
}
