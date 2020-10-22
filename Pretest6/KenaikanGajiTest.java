public class KenaikanGajiTest extends Helper6
{
    public static void main(String[] args) {
        KenaikanGaji Santi = new KenaikanGaji("SBY0001", "Manager", 4000000, 5);
        KenaikanGaji Ronny = new KenaikanGaji("BDG0317", "Staff", 2000000, 7.5);
        KenaikanGaji Indra = new KenaikanGaji("JKT0189", "Direktur", 8000000, 3);

        double gajiSanti = Santi.getGajiBaru();
        double gajiRonny = Ronny.getGajiBaru();
        double gajiIndra = Indra.getGajiBaru();

        String idSanti = Santi.getNoPegawai();
        String idRonny = Ronny.getNoPegawai();
        String idIndra = Indra.getNoPegawai();

        String jbSanti = Santi.getJabatan();
        String jbRonny = Ronny.getJabatan();
        String jbIndra = Indra.getJabatan();

        println("Menghitung kenaikan gaji");
        println("------------------------");

        println("Santi");
        println("No pegawai : " + idSanti);
        println("Jabatan : " + jbSanti);
        println("Gaji baru : " + gajiSanti);
        println(" ");

        println("Ronny");
        println("No pegawai : " + idRonny);
        println("Jabatan : " + jbRonny);
        println("Gaji baru : " + gajiRonny);
        println(" ");

        println("Indra");
        println("No pegawai : " + idIndra);
        println("Jabatan : " + jbIndra);
        println("Gaji baru : " + gajiIndra);
        println(" ");
    }
}
