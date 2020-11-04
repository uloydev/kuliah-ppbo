class Rekening {
    private String noRekening;
    private int saldo;

    public void setNoRekening(String no) {
        this.noRekening = no;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNoRekening() {
        return this.noRekening;
    }

    public int getSaldo() {
        return this.saldo;
    }
}

class Nasabah extends Rekening{
    private String noKTP, nama;

    public void setNama(String n) {
        this.nama = n;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNoKTP(String ktp) {
        this.noKTP = ktp;
    }

    public String getNoKTP() {
        return this.noKTP;
    }

    public void buatRekening(Rekening r, int setoran) {
        r.setNoRekening(noKTP);
        r.setSaldo(setoran);
    }

    public void ambilUang(Rekening r, int ambil) {
        r.setSaldo(r.getSaldo() - ambil);
    }


    public void nabungUang(Rekening r, int nabung) {
        r.setSaldo(r.getSaldo() + nabung);
    }

    public void transfer(Rekening r1, Rekening r2, int jumlah) {
        r1.setSaldo(r1.getSaldo() - jumlah);
        r2.setSaldo(r2.getSaldo() + jumlah);
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah();
        Nasabah nasabah2 = new Nasabah();
        Rekening rekening1 = new Rekening();
        Rekening rekening2 = new Rekening();

        nasabah1.setNama("MEMED");
        nasabah1.setNoKTP("28329ddd3728384");
        nasabah2.setNama("MAMAD");
        nasabah2.setNoKTP("897493474386");

        nasabah1.buatRekening(rekening1, 50000);
        nasabah2.buatRekening(rekening2, 10000);

        print("Status awal rekening nsabah: ");
        print("\nSaldo awal rekening " + nasabah1.getNoKTP() + " milik " + nasabah1.getNama() + " adalah Rp " + rekening1.getSaldo());
        print("\nSaldo awal rekening " + nasabah2.getNoKTP() + " milik " + nasabah2.getNama() + " adalah Rp " + rekening2.getSaldo());

        nasabah1.ambilUang(rekening1, 20000);
        print("\n\nSisa saldo " + nasabah1.getNama() + " setelah diambil Rp 20000 adalah Rp " + rekening1.getSaldo());

        nasabah1.nabungUang(rekening1, 40000);
        print("\njumlah saldo " + nasabah2.getNama() + " setelah menabung Rp 40000 adalah Rp " + rekening2.getSaldo());

        nasabah1.transfer(rekening1, rekening2, 50000);
        print("\nSisa saldo " + nasabah1.getNama() + " setelah melakukan transfer Rp 50000 kepada " + nasabah2.getNama() + " adalah Rp " + rekening1.getSaldo());

        print("\n\nStatus akhir rekening nsabah: ");
        print("\nSaldo akhir rekening " + nasabah1.getNoKTP() + " milik " + nasabah1.getNama() + " adalah Rp " + rekening1.getSaldo());
        print("\nSaldo akhir rekening " + nasabah2.getNoKTP() + " milik " + nasabah2.getNama() + " adalah Rp " + rekening2.getSaldo());

        print("\n\n THANK YOU \n\n");
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}