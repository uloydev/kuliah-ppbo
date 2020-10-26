public class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload overload = new MethodOverload();
        print("DEMO METHOD OVERLOADING\n");
        print("-----------------------\n\n");
        print("Method 'kuadrat' pertama\n");
        overload.kuadrat(6);
        print("\n\nMethod 'kuadrat' kedua\n");
        overload.kuadrat(6.45);
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}

class MethodOverload {

    public void kuadrat(int num) {
        print("Hasil kuadrat " + num + " adalah: " + num * num);
    }

    public void kuadrat(double num) {
        print("Hasil kuadrat " + num + " adalah: " + num * num);
    }

    private void print(Object any) {
        System.out.print(any);
    }
}