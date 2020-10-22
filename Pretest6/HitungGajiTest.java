import java.text.DecimalFormat;

public class HitungGajiTest extends Helper6 {
	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		// Mengeset tampilan hasil menjadi dua digit desimal
		DecimalFormat digitPresisi = new DecimalFormat("0.00");
		
		println("\nDEMO ENKAPSULASI");
		println("----------------\n");
		
		// Membuat instans dari kelas hitungGaji untuk suatu
		// pegawai, dan memanggil method-methodnya.
		HitungGaji tony = new HitungGaji();
		tony.setGaji(2500000);
		tony.hitungGaji();
		
		println("Informasi Gaji Pegawai");
		println("\nBesar Gaji kotor : " + digitPresisi.format(tony.getGajiKotor()));
		println("\nBesar Gaji yang dibawa pulang : " + digitPresisi.format(tony.getGajiBersih()));
	}

}