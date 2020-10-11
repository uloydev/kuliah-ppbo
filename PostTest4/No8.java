import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        HypotenuseCalculation sisiMiring = new HypotenuseCalculation();
        Scanner input = new Scanner(System.in);
        double a, b;
        print("Hypotenuse Calculation \n\n");
        print("masukkan alas segitiga = ");
        a = input.nextDouble();
        print("masukkan tinggi segitiga = ");
        b = input.nextDouble();
        print("sisi miring segitiga adalah = " + sisiMiring.hitung(a, b));
    }

    private static void print(Object any){
        System.out.print(any);
    }
}




class HypotenuseCalculation {
    public double hitung(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
