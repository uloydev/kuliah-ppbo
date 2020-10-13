import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first_name, middle_name, last_name, full_name;

        print("Enter your first name: ");
        first_name = input.nextLine();
        print("Enter your middle name: ");
        middle_name = input.nextLine();
        print("Enter your last name: ");
        last_name = input.nextLine();

        full_name = first_name + " " + middle_name + " " + last_name;

        print("\n\nYour full name is " + full_name);
    }

    private static void print(Object any) {
        System.out.print(any);
    }
}