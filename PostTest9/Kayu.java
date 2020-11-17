class Kayu extends Material{
    private int panjang, lebar, tinggi;
    private String jenis;
    
    Kayu(int harga, int berat, int stok, boolean bisaCat, boolean tahanLama, int panjang, int lebar, int tinggi, String jenis) {
        super(harga, berat, stok, bisaCat, tahanLama);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.jenis = jenis;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
