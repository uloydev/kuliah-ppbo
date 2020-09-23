public class MamaliaDarat {
    public static void main(String[] args) {
        System.out.println("\nDEMO KELAS, METHOD DAN DATA");
        System.out.println("---------------------------\n");
        // membuat instance dari class Kucing, Anjing dan Macan
        Kucing pussy = new Kucing();
        Anjing doggy = new Anjing();
        Macan siKumbang = new Macan();
        // memanggil method dari objek pussy, dog dan siKumbang
        System.out.println("Pussy : " + pussy.mengeong());
        System.out.println("Doggy : " + doggy.menggonggong());
        System.out.println("Si Kumbang : " + siKumbang.mengaum());
    }
}

class Kucing {
    public String mengeong() {
        return "Meoong...";
    }
}

class Anjing {
    public String menggonggong() {
        return "Guk..Guk...";
    }
}

class Macan {
    public String mengaum() {
        return "Auummm...";
    }
}