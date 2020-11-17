class Material extends Produk{
    private boolean tahanLama;

    Material(int harga, int berat, int stok, boolean bisaCat, boolean tahanLama) {
        super(harga, berat, stok, bisaCat);
        this.tahanLama = tahanLama;
    }

    public boolean getTahanLama() {
        return tahanLama;
    }

    public void setTahanLama(boolean tahanLama) {
        this.tahanLama = tahanLama;
    }
}
