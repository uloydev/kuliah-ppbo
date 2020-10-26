public class RectangleTest {
    public static void main(String[] args) {
        Rectangle kotak1, kotak2, kotak3, kotak4;

        kotak1 = new Rectangle();
        kotak2 = new Rectangle(10);
        kotak3 = new Rectangle("15");
        kotak4 = new Rectangle(10, 15);

        print("Rectangle Test Dengan 4 Constructor");
        print("\n\nObject kotak1 tanpa parameter\n");
        printHasil(kotak1);
        print("\n\nObject kotak2 dengan 1 parameter double\n");
        printHasil(kotak2);
        print("\n\nObject kotak3 dengan 1 parameter String\n");
        printHasil(kotak3);
        print("\n\nObject kotak4 dengan 2 parameter double\n");
        printHasil(kotak4);

        kotak1.length = 4;
        kotak1.width = 5;
        print("\n\nObject kotak1 setelah properti length dan width diubah\n");
        printHasil(kotak1);
    }

    private static void print(Object any) {
        System.out.print(any);
    }

    private static void printHasil(Rectangle kotak) {
        print("Panjang     : " + kotak.length);
        print("\nLebar       : " + kotak.width);
        print("\nKeliling    : " + kotak.keliling());
        print("\nLuas        : " + kotak.luas());
    }
}


class Rectangle {
    public double length, width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double val) {
        this.length = val;
        this.width = val;
    }

    public Rectangle(String val) {
        this.length = Double.parseDouble(val);
        this.width = this.length;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double  keliling() {
        return (2 * this.length) + (2 * this.width);
    }

    public double luas() {
        return this.length * this.width;
    }
}