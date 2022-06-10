package BattleShipDAO.BattleShipModules;

import java.util.Arrays;

public class BattleShipBoard {
    // This map will need to be 10 by 10.

    int[] letters;

    int[] numbers;

    public BattleShipBoard() {
        this.letters = new int[10];
        this.numbers = new int [10];
    }

    public int[] getLetters() {
        return letters;
    }

    public void setLetters(int[] letters) {
        this.letters = letters;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "BattleShipBoard{" +
                "letters=" + Arrays.toString(letters) +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
