class Semen extends Material {
    private String merk;

    Semen(int harga, int berat, int stok, boolean bisaCat, boolean tahanLama, String merk) {
        super(harga, berat, stok, bisaCat, tahanLama);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}