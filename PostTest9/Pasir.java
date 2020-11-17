class Pasir extends Material {
    private String jenis, warna;

    Pasir(int harga, int berat, int stok, boolean bisaCat, boolean tahanLama, String jenis, String warna) {
        super(harga, berat, stok, bisaCat, tahanLama);
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
