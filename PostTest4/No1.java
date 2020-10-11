import java.util.Scanner;

public class No1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        print("Masukkan nilai a : ");
        a = input.nextInt();
        print("Masukkan nilai b : ");
        b = input.nextInt();
        print("Masukkan nilai c : ");
        c = input.nextInt();
        print("\nNilai dari  b^2-4ac = ");
        print(hitung(a, b, c));
    }

    private static void print(Object any){
        System.out.print(any);
    }

    private static int hitung(int a, int b, int c){
        return (b * b) - (4 * a * c);
    }
}