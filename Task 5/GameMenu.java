import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }

    public String getAction() {
        System.out.println("Type a number to choose an action:");
        displayMenu();

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        scanner.close();

        return choice;
    }
}