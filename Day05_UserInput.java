import java.util.Scanner;

public class Day05_UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        input.close();
    }
}
