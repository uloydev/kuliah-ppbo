import java.util.Scanner;

public class FibonachiTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonachi fibo = new Fibonachi();
        int n;

        print("inputkan n : ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) 
            print(fibo.getNumber(i) + " ");
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}
