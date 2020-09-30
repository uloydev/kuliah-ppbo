class DemoOperator{
    public static void main(String[] args) {
        // membuat variabel
        boolean test = false;

        // membuat instace dari class DemoOperator
        DemoOperator demo = new DemoOperator();

        // mengecek apakah demo merupakan instace daroi DemoOperator
        test = (demo instanceof DemoOperator);

        String[] namHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("\nPROGRAM DEMO OPERATOR");
        System.out.println("---------------------\n");

        System.out.println("Apakah objek demo merupakan instance dari DemoOperator ? : " + test);
        System.out.println("\nMencetak hari pertama\t" + namHari[0]);
        System.out.println("\nMencetak hari keempat\t" + namHari[3]);
    }
}