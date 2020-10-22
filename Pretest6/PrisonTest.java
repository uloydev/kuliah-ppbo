public class PrisonTest {
    public static void main(String[] args) {
        Cell c01 = new Cell("Cell 01", "123");
        Cell c02 = new Cell("Cell 02", "321");

        Prisoner p01 = new Prisoner("Bubba", 170, c01);
        Prisoner p02 = new Prisoner("Boba", 160, c02);

        p01.display();
        c01.openDoor("123");
        p01.display();
    }
}
