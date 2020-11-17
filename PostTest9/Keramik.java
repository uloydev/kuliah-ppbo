class Keramik extends KomponenBangunan{
    private int panjang, lebar;
    private String jenis;
    
    Keramik(int harga, int berat, int stok, boolean bisaCat, boolean bisaTukar, int panjang, int lebar, String jenis) {
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

    public String getJenis() {
        return jenis;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
