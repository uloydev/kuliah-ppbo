public class Bmi {
    public static void main(String[] args) {
        double tinggi = 1.7; // meter
        int berat = 65; // kilogram
        double bmi = berat / Math.pow(tinggi, 2);
        System.out.println("tinggi badan (m)  : " + tinggi);
        System.out.println("berat badan (kg)  : " + berat);
        System.out.println("index massa tubuh : " + bmi);
    }
}