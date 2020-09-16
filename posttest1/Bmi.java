public class Bmi {
    public static void main(String[] args) {
        double tinggi = 1.7; // meter
        int berat = 65; // kilogram
        double bmi = berat / Math.pow(tinggi, 2);
        System.out.print("tinggi badan (m)  : ");
        System.out.println(tinggi);
        System.out.print("berat badan (kg)  : ");
        System.out.println(berat);
        System.out.print("index massa tubuh : ");
        System.out.println(bmi);
    }
}