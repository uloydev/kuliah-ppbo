public class HitungGaji {
	/* Mendeklarasikan variabel-variabel internal kelas HitungGaji.
	   Variabel potongan menyatakan dana untuk Asuransi Kesehatan
	   (Askes), iuran koperasi, cicilan kendaraan dan sebagainya.
	   Hanya variabel gajiKotor dan gajiBersih yang dapat diakses
	   oleh "lingkungan luar". 
	 */
	private double gajiKotor, gajiSetelahPajak, potongan = 75000.00;
	public double gajiBersih;
	
	// Method untuk mengeset variabel internal gajiKotor
	public void setGaji(double gaji) {
		gajiKotor = gaji;
	}
	
	//Method untuk menghitung gajiBersih
	public void hitungGaji() {
		gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
		gajiBersih = gajiSetelahPajak - potongan;
	}
	
	// Method yang mengembalikan gaji kotor
	public double getGajiKotor() {
		return gajiKotor;
	}
	
	// Method yang mengembalikan besar gaji bersih
	public double getGajiBersih() {
		return gajiBersih;
	}
	
}