class Keramik extends KomponenBangunan{
    public static enum Jenis {
        KW1,
        KW2,
        KW3;
    }
    private int panjang, lebar;
    private Jenis jenis;
    
    Keramik(int harga, int berat, int stok, boolean bisaCat, boolean bisaTukar, int panjang, int lebar, Jenis jenis) {
        super(harga, berat, stok, bisaCat, bisaTukar);
        this.panjang = panjang;
        this.lebar = lebar;
        this.jenis = jenis;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public Jenis getJenis() {
        return jenis;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setJenis(Jenis jenis) {
        this.jenis = jenis;
    }
}
