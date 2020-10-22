public class Prisoner extends Helper6
{
    private String nama;
    private int tinggi;
    private Cell cell;

    Prisoner (String nama, int tinggi, Cell cell) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.cell = cell;
    }

    Prisoner (int tinggi, String nama) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    Prisoner (String nama) {
        this.nama = nama;
        this.tinggi = 0;
    }

    Prisoner (int tinggi) {
        this.nama = "";
        this.tinggi = tinggi;
    }

    Prisoner () {
        this.nama = "nama";
        this.tinggi = 0;
    }

    public String getNama() {
        return nama;
    }

    public String setNama(String nama) {
        this.nama = nama;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void display() {
        println("Nama : " + this.nama);
        println("Tinggi : " + this.tinggi);
        println("No. cell : " + this.cell.getNamaCell());
        println("Status cell : " + this.cell.isOpen());
    }
}
