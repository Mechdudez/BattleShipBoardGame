package BattleShipActivity.BattleShipActivityHelpers;

import java.util.Scanner;

public class UserInputHelper {

    public static String getStringUserInput() {
        String userInput;

        while (true) {
            try {
               userInput = grabStringInput();
                break;
            } catch (Exception e) {
                System.out.println("Sorry, but the input you have selected is incorrect.");
            }
        }

        return userInput;
    }
    private static String grabStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
