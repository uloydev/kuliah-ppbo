import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        print("menggambar donat nxn \n\n");
        print("Masukkan nilai n = ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n -1 || i == 0 || i == n -1) {
                    print("*");
                } else {
                    print(" ");
                }
            }
            print("\n");
        }
    }

    private static void print(Object any){
        System.out.print(any);
    }
}   