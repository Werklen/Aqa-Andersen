import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task #1

        //Task #1.1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        }

        //Task #1.2
        System.out.print("Enter a name: ");
        String name = scanner.next().toLowerCase();
        if (name.equals("john")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        //Task #1.3

        ArrayList<Integer> arr = new ArrayList<>();

        String input = "";
        System.out.println("Enter the elements of the array. Enter q to exit.");

        while (true) {
            input = scanner.next();

            if (input.equals("q")) {
                break;
            }

            try {
                arr.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное число или 'q' для выхода.");
            }
        }

        System.out.println("Numbers that are multiples of 3:");
        for (int num : arr) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
