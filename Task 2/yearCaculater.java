import java.util.Scanner;

public class yearCaculater {

	public static void main(String[] args){

		System.out.println("Please type your name:");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hi " + name + "! Please type your age:");

		int age = scanner.nextInt();

		System.out.println("You typed: " + age);

		int yearsUntilRetirement = 67 - age;

		System.out.println("You have " + yearsUntilRetirement + " years until your retirement");

		scanner.close();

	}
}