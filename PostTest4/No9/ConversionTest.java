import java.util.Scanner;

public class ConversionTest {
    public static void main(String[] args) {
        Conversion celciusConversion = new Conversion();        
        Scanner input = new Scanner(System.in);
        double celcius;
        print("CELCIUS CONVERTION \n\n");
        print("masukkan suhu celcius = ");
        celcius = input.nextDouble();
        print("Hasil Method Dengan Parameter");
        print("\nsuhu fahrenheit = " + celciusConversion.cToF(celcius));
        print("\nsuhu kelvin = " + celciusConversion.cToK(celcius));
        print("\nsuhu reamur = " + celciusConversion.cToR(celcius));

        celciusConversion = new Conversion(celcius);
        print("\n\nHasil Method Tanpa Parameter");
        print("\nsuhu fahrenheit = " + celciusConversion.cToF());
        print("\nsuhu kelvin = " + celciusConversion.cToK());
        print("\nsuhu reamur = " + celciusConversion.cToR());
    }

    private static void print(Object any){
        System.out.print(any);
    }
}
