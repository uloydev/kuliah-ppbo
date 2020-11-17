import java.util.HashMap;
import java.util.Set;

class Toko {
    private HashMap<String, HashMap<String, HashMap<String, Produk>>> database;

    Toko() {
        this.database = new HashMap<>();
        this.database.put("material", new HashMap<>());
        this.database.put("komponen bangunan", new HashMap<>());
        this.database.get("material").put("kayu", new HashMap<>());
        this.database.get("material").put("pasir", new HashMap<>());
        this.database.get("material").put("semen", new HashMap<>());
        this.database.get("komponen bangunan").put("keramik", new HashMap<>());
        this.database.get("komponen bangunan").put("pintu", new HashMap<>());
    }

    public Set<String> getKategori() {
        return this.database.keySet();
    }

    public Set<String> getSubKategori(String kategori) {
        return this.database.get(kategori).keySet();
    }

    public void addProduk(String kategori, String subKategori, String nama, Produk produk) {
        this.database.get(kategori).get(subKategori).put(nama, produk);
    }

    public void updateProduk(String kategori, String subKategori, String nama, Produk produk) {
        this.database.get(kategori).get(subKategori).replace(nama, produk);
    }

    public void deleteProduk(String kategori, String subKategori, String nama) {
        this.database.get(kategori).get(subKategori).remove(nama);
    }

    public Produk getProduk(String kategori, String subKategori, String nama) {
        return this.database.get(kategori).get(subKategori).
        get(nama);
    }

    public Set<String> getProdukList(String kategori, String subKategori) {
        return this.database.get(kategori).get(subKategori).keySet();
    }

    public HashMap<String, Integer> getNilaiBarang() {
        HashMap<String, Integer> nilai = new HashMap<>();
        Produk temp;
        for (String kategori : getKategori()) {
            for (String subKategori : getSubKategori(kategori)) {
                for (String nama : getProdukList(kategori, subKategori)) {
                    temp = getProduk(kategori, subKategori, nama);
                    nilai.put(nama, temp.getHarga() * temp.getStok());
                }
            }
        }
        return nilai;
    }

    public HashMap<String, Integer> getStokBarang() {
        HashMap<String, Integer> stok = new HashMap<>();
        Produk temp;
        for (String kategori : getKategori()) {
            for (String subKategori : getSubKategori(kategori)) {
                for (String nama : getProdukList(kategori, subKategori)) {
                    temp = getProduk(kategori, subKategori, nama);
                    stok.put(nama, temp.getStok());
                }
            }
        }
        return stok;
    }
}
