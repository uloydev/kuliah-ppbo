import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first_name, full_name;
        String[] name_array;

        print("Enter your full name: ");
        full_name = input.nextLine();
        name_array = full_name.split(" ");
        first_name = name_array[0];
        print("\n\nYour first name is " + first_name);
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}