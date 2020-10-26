public class PecahanTest {
    public static void main(String[] args) {
        Pecahan pecahan1 = new Pecahan(3, 2);
        Pecahan pecahan2 = new Pecahan(5, 6);
        print("welcome to program pecahan\n");
        print(pecahan1.toString() + " + " + pecahan2.toString() + " = ");
        pecahan1.tambah(pecahan2);
        print(pecahan1);
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}

class Pecahan {
    private int pembilang, penyebut;

    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public void setPembilang(int value) {
        this.pembilang = value;
    }

    public void setPenyebut(int value) {
        this.penyebut = value;
    }

    public int getPembilang() {
        return this.pembilang;
    }

    public int getPenyebut() {
        return this.penyebut;
    }

    public void tambah(Pecahan p) {
        int newPenyebut;
        newPenyebut = this.penyebut * p.getPenyebut();
        this.pembilang = (p.getPenyebut() * this.pembilang) + (this.penyebut * p.getPembilang());
        this.penyebut = newPenyebut;
    }

    public String toString() {
        return this.pembilang + "/" + this.penyebut;
    }
}