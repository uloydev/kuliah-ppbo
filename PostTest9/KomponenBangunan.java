class KomponenBangunan extends Produk {
    private boolean bisaTukar;

    KomponenBangunan(int harga, int berat, int stok, boolean bisaCat, boolean bisaTukar) {
        super(harga, berat, stok, bisaCat);
        this.bisaTukar = bisaTukar;
    }

    public boolean getBisaTukar() {
        return bisaTukar;
    }

    public void setBisaTukar(boolean bisaTukar) {
        this.bisaTukar = bisaTukar;
    }
}
