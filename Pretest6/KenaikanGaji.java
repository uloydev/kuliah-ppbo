public class KenaikanGaji
{
    private double gajiPokok;
    private double persenNaik;
    private String jabatan;
    private String noPegawai;

    // construct method for var initialisation
    public KenaikanGaji(String noPegawai, String jabatan, double gajiPokok, double persenNaik) {
        this.noPegawai = noPegawai;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.persenNaik = persenNaik;
    }

    // menghitung gaji baru
    public double getGajiBaru() {
        return gajiPokok + (persenNaik / 100) * gajiPokok;
    }

    public String getNoPegawai() {
        return noPegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

}
