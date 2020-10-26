public class GameOopTest {
    public static void main(String[] args) {
        GameOop wiro = new GameOop("wiro sableng", 20, 10);
        GameOop gundalgandul = new GameOop("gundala", 25, 5);
        
        print("Pertarungan antara Wiro Sableng dan Gundala\n\n");
        print("wiro sableng menendang gundala\n");
        wiro.tendang(gundalgandul);
        print("gundala membalas menendang wiro sableng\n");
        gundalgandul.tendang(wiro);
        print("gundala memukul wiro sableng 3x beturut-turut\n");
        for (int i = 0; i < 3; i++) {
            gundalgandul.pukul(wiro);
        }
        print("wiro sableng memukul gundala 4x beturut-turut\n");
        for (int i = 0; i < 4; i++) {
            wiro.pukul(gundalgandul);
        }
        print("pertarungan berakhir\n");
        print("\nlife point wiro sableng = " + wiro.getLifePoint());
        print("\nlife point gundala = " + gundalgandul.getLifePoint());

        if (gundalgandul.getLifePoint() > wiro.getLifePoint()) {
            print("\n\n PERTARUNGAN DIMENANGKAN OLEH GUNDALA !!!");
        } else {
            print("\n\n PERTARUNGAN DIMENANGKAN OLEH WIRO SABLENG !!!");
        }
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}

class GameOop {
    private String name;
    private int lifePoint, powerTendangan, powerPukulan;

    public GameOop(String name, int powerTendangan, int powerPukulan) {
        this.name = name;
        this.powerTendangan = powerTendangan;
        this.powerPukulan = powerPukulan;
        this.lifePoint = 100;
    }

    public void tendang(GameOop karB) {
        karB.reduceLifePoint(this.powerTendangan);
    }

    public void pukul(GameOop karB) {
        karB.reduceLifePoint(this.powerPukulan);
    }

    public String getName() { 
        return this.name;
    }

    public int getLifePoint() { 
        return this.lifePoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reduceLifePoint(int power) {
        this.lifePoint -= power;
    }
}