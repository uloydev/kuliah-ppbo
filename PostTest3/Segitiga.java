import java.util.Scanner;

public class Segitiga{
    public static void main(String[] args) {
        // membuat variabel alas dan tinggi
        int a, t;
        double luas;

        // membuat instance input dari class Scanner
        Scanner input = new Scanner(System.in);

        println("PROGRAM MENGHITUNG LUAS SEGITIGA");
        println("--------------------------------");
        
        // meminta input variabel a
        print("masukkan alas segitiga = ");
        a = input.nextInt();

        // meminta input variabel t
        print("masukkan tinggi segitiga = ");
        t = input.nextInt();

        // menghitung luas segitiga
        luas = hitungLuas(a, t);
        println("Luas segitiga adalah = " + luas);
    }

    private static void println(Object any){
        System.out.println(any);
    }

    private static void print(Object any){
        System.out.print(any);
    }

    private static double hitungLuas(int a, int t){
        return (double)a * (double)t / 2;
    }
}