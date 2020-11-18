import java.util.Scanner;
import java.util.List;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char lagi;
        Toko tokoMakmurJayaBangunan = buatToko();
        do{
            clearScreen();
            switch(pilihMenu()) {
                case 1 :
                    print("\n\n============== TAMBAH PRODUK ===============\n");
                    tokoMakmurJayaBangunan = tambahProduk(tokoMakmurJayaBangunan);
                    break;
                case 2 :
                    print("\n\n============== HAPUS PRODUK ===============\n");
                    tokoMakmurJayaBangunan = hapusProduk(tokoMakmurJayaBangunan);
                    break;
                case 3 :
                    print("\n\n============== NILAI BARANG ===============\n");
                    tokoMakmurJayaBangunan.getNilaiBarang().forEach((key, value) -> {
                        print(key + " = Rp." + value + "\n");
                    });
                    break;
                case 4 :
                    print("\n\n============== STOK BARANG ===============\n");
                    tokoMakmurJayaBangunan.getStokBarang().forEach((key, value) -> {
                        print(key + " = " + value + "\n");
                    });
                    break;
                case 0 :
                    System.exit(0);
                    break;               
                default :
                    print("\n\n input yang anda masukkan salah\n");
            }
            print("\nkembali ke menu ? y/n = ");
            lagi = input.next().charAt(0);
        } while(lagi == 'y');

    }

    private static void print(Object any) {
        System.out.print(any);
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static int pilihMenu() {
        print("======================================\n");
        print("||              MENU                ||\n");
        print("======================================\n");
        print("1. tambah produk\n");
        print("2. hapus produk\n");
        print("3. tampilkan nilai barang\n");
        print("4. tampilkan stok barang\n");
        print("0. exit\n");
        print("pilih menu : ");
        return input.nextInt();
    }

    private static Toko buatToko() {
        Toko toko = new Toko();
        Produk produk;
        // tambah kayu
        produk = new Kayu(200000, 10, 5, true, true, 20, 20, 200, "jati");
        toko.addProduk("material", "kayu", "kayu jati", produk);
        produk = new Kayu(150000, 10, 10, true, true, 20, 20, 200, "pinus");
        toko.addProduk("material", "kayu", "kayu pinus", produk);
        // tambah pasir
        produk = new Pasir(225000, 15, 25, false, true, "cileungsi", "hitam");
        toko.addProduk("material", "pasir", "pasir cileungsi", produk);
        produk = new Pasir(300000, 15, 20, false, true, "rangkas", "putih");
        toko.addProduk("material", "pasir", "pasir rangkas", produk);
        // tambah semen
        produk = new Semen(60000, 40, 50, false, true, "tiga roda");
        toko.addProduk("material", "semen", "semen tiga roda", produk);
        produk = new Semen(55000, 40, 40, false, true, "holcim");
        toko.addProduk("material", "semen", "semen holcim", produk);
        // tambah keramik
        produk = new Keramik(100000, 1, 250, false, true, 33, 33, Keramik.Jenis.KW1);
        toko.addProduk("komponen bangunan", "keramik", "keramik roman", produk);
        // tambah pintu
        produk = new Pintu(2500000, 30, 12, true, false, 100, 5, 230, "kayu");
        toko.addProduk("komponen bangunan", "pintu", "pintu kayu jati", produk);
        return toko;
    }

    private static Toko hapusProduk(Toko toko){
        String cat, subCat, prodName;
        List<String> categories = toko.getKategori();
        List<String> subcategories, products;

        for (int i=0; i<categories.size(); i++) {
            print((i+1) + ". " + categories.get(i) + "\n");
        }
        print("pilih kategori : ");
        cat = categories.get(input.nextInt()-1);
        subcategories = toko.getSubKategori(cat);
        for (int i=0; i<subcategories.size(); i++) {
            print((i+1) + ". " + subcategories.get(i) + "\n");
        }
        print("pilih sub kategori : ");
        subCat = subcategories.get(input.nextInt()-1);
        products = toko.getProdukList(cat, subCat);
        for (int i=0; i<products.size(); i++) {
            print((i+1) + ". " + products.get(i) + "\n");
        }
        print("pilih produk : ");
        prodName = products.get(input.nextInt()-1);
        toko.deleteProduk(cat, subCat, prodName);
        print("produk " + prodName + " berhasil dihapus\n");
        return toko;
    }

    private static Toko tambahProduk(Toko toko) {
        String cat, subCat, prodName;
        List<String> categories = toko.getKategori();
        List<String> subcategories;

        Produk produk;
        int harga, berat, stok;
        boolean bisaCat;

        for (int i=0; i<categories.size(); i++) {
            print((i+1) + ". " + categories.get(i) + "\n");
        }
        print("pilih kategori : ");
        cat = categories.get(input.nextInt()-1);
        subcategories = toko.getSubKategori(cat);
        for (int i=0; i<subcategories.size(); i++) {
            print((i+1) + ". " + subcategories.get(i) + "\n");
        }
        print("pilih sub kategori : ");
        subCat = subcategories.get(input.nextInt()-1);
        input.nextLine();
        print("\nNama : ");
        prodName = input.nextLine();
        print("\nHarga : ");
        harga = input.nextInt();
        print("\nBerat : ");
        berat = input.nextInt();
        print("\nStok : ");
        stok = input.nextInt();
        input.nextLine();
        print("\nBisa di cat (y/n) : ");
        bisaCat = input.nextLine().charAt(0) == 'y' ? true : false;
        
        if(cat == "material") {
            print("\nTahan Lama (y/n) : ");
            boolean tahanLama = input.nextLine().charAt(0) == 'y' ? true : false;
            if(subCat == "pasir"){
                print("\nJenis : ");
                String jenis = input.nextLine();
                print("\nWarna : ");
                String warna = input.nextLine();
                produk = new Pasir(harga, berat, stok, bisaCat, tahanLama, jenis, warna);
                toko.addProduk(cat, subCat, prodName, produk);
            }else if(subCat == "kayu") {
                print("\nPanjang : ");
                int panjang = input.nextInt();
                print("\nLebar : ");
                int lebar = input.nextInt();
                print("\nTinggi : ");
                int tinggi = input.nextInt();
                input.nextLine();
                print("\nJenis : ");
                String jenis = input.nextLine();
                produk =  new Kayu(harga, berat, stok, bisaCat, tahanLama, panjang, lebar, tinggi, jenis);
                toko.addProduk(cat, subCat, prodName, produk);
            }else if(subCat == "semen"){
                print("\nMerk : ");
                String merk = input.nextLine();
                produk =  new Semen(harga, berat, stok, bisaCat, tahanLama, merk);
                toko.addProduk(cat, subCat, prodName, produk);
            }
        }else if(cat == "komponen bangunan"){
            print("\nBisa Tukar (y/n) : ");
            boolean bisaTukar = input.nextLine().charAt(0) == 'y' ? true : false;
            if(subCat == "keramik"){
                print("\nPanjang : ");
                int panjang = input.nextInt();
                print("\nLebar : ");
                int lebar = input.nextInt();
                print("\nJenis keramik\n");
                for(int i=0; i<Keramik.Jenis.values().length; i++){
                    print((i+1) + ". " + Keramik.Jenis.values()[i] + "\n");
                }
                print("\nJenis : ");
                Keramik.Jenis jenis = Keramik.Jenis.values()[input.nextInt()];
                produk =  new Keramik(harga, berat, stok, bisaCat, bisaTukar, panjang, lebar, jenis);
                toko.addProduk(cat, subCat, prodName, produk);
            }else if(subCat == "pintu") {
                print("\nPanjang : ");
                int panjang = input.nextInt();
                print("\nLebar : ");
                int lebar = input.nextInt();
                print("\nTinggi : ");
                int tinggi = input.nextInt();
                input.nextLine();
                print("\nBahan : ");
                String bahan = input.nextLine();
                produk =  new Pintu(harga, berat, stok, bisaCat, bisaTukar, panjang, lebar, tinggi, bahan);
                toko.addProduk(cat, subCat, prodName, produk);
            }
        }
        print("produk " + prodName + " berhasil ditambahkan\n");
        return toko;
    }
}