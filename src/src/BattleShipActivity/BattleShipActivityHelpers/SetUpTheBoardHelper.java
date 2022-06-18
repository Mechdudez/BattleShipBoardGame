package BattleShipActivity.BattleShipActivityHelpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetUpTheBoardHelper {

    public void getFirstRow() {
        List<String> firstRow = Arrays.asList(" ", "  A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J ",
                "                  ", " ", "  A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J ");

        String blankSpace = "";

        String makeTheFirstRow = String.join(blankSpace, firstRow);

        System.out.println(makeTheFirstRow);
    }
    public void getNumbers(){

    }

    public void setUpTheBoard() {
        String[] numbers = {" ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String [] letters = {" ", " A", " B", " C", " D", " E", " F", " G", " H", " I", " J"};
        // First iteration has to be the number
        for (int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++){
                if(i == 0){
                    System.out.print(letters[j]);

                }else if(j == 0){
                    System.out.print(numbers[i]);
                }else {
                    System.out.print(" |");
                }

            }
            System.out.println();
        }
        // there has to be 11 iterations to make sure there is 10 spots to shoot.

        // Each spot will look like a box, how do you make sure that happens? Use | and _ together.
        // have to also be able to change what is in the box to an S/H or X
    }

}


