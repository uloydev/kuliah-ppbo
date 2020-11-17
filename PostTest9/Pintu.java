class Pintu extends KomponenBangunan{
    private int panjang, lebar, tinggi;
    private String bahan;
    
    Pintu(int harga, int berat, int stok, boolean bisaCat, boolean bisaTukar, int panjang, int lebar, int tinggi, String bahan) {
        super(harga, berat, stok, bisaCat, bisaTukar);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.bahan = bahan;
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

    public String getBahan() {
        return bahan;
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

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
}
