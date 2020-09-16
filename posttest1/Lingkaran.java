public class Lingkaran {
    public static void main(String[] args) {
        double radius = 14;
        double luas = Math.PI * Math.pow(radius, 2);
        double keliling = 2 * Math.PI * radius;
        System.out.print("radius lingkaran : ");
        System.out.println(radius);
        System.out.print("luas lingkaran     : ");
        System.out.println(luas);
        System.out.print("keliling lingkaran : ");
        System.out.println(keliling);
    }
}