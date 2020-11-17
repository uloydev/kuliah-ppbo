class Produk {
    private int harga, berat, stok;
    private boolean bisaCat;

    Produk(int harga, int berat, int stok, boolean bisaCat) {
        this.harga = harga;
        this.berat = berat;
        this.stok = stok;
        this.bisaCat = bisaCat;
    }

    public int getHarga() {
        return harga;
    }

    public int getBerat() {
        return berat;
    }

    public int getStok() {
        return stok;
    }

    public boolean getBisaCat() {
        return bisaCat;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setBisaCat(boolean bisaCat) {
        this.bisaCat = bisaCat;
    }

}