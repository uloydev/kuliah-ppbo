import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        int angka, jumlah = 0;
        Scanner input = new Scanner(System.in);
        print("menghitung jumlah dari beberapa bilangan bulat\n\n");
        print("Masukkan nilai integer yang akan dijumlahkan\n");
        String[] line = input.nextLine().split(" ");
        for (int i=0; i < line.length; i++) {
            angka = Integer.parseInt(line[i]);
            jumlah = i + 1 != line.length ? jumlah + angka : jumlah;
        }
        print("jumlah integer kecuali bilangan negatif adalah = " + jumlah);
    }

    private static void print(Object any){
        System.out.print(any);
    }
}   