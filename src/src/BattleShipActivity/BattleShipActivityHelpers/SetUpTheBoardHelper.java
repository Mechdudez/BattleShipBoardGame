package BattleShipActivity.BattleShipActivityHelpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetUpTheBoardHelper {

    public void getFirstRow() {
        List<String> firstRow = Arrays.asList(" ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J ",
                "                  ", " ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J ");

        String blankSpace = "";

        String makeTheFirstRow = String.join(blankSpace, firstRow);

        System.out.println(makeTheFirstRow);

        // Player one side of the board
//        firstRow.add("");
//        firstRow.add("A");
//        firstRow.add("B");
//        firstRow.add("C");
//        firstRow.add("D");
//        firstRow.add("E");
//        firstRow.add("F");
//        firstRow.add("G");
//        firstRow.add("H");
//        firstRow.add("I");
//        firstRow.add("J");

//        firstRow.add("           ");
//         Player two side of the board
//        firstRow.add("A");
//        firstRow.add("B");
//        firstRow.add("C");
//        firstRow.add("D");
//        firstRow.add("E");
//       firstRow.add("F");
//        firstRow.add("G");
//        firstRow.add("H");
//        firstRow.add("I");
//        firstRow.add("J");
//        firstRow.remove(",");


    }

    public void getLeftSideAndRightSide() {
        System.out.print("");
        for(int i = 0; i < 10; i++){
         
            System.out.print("  |");
        }
    }

    public void getUpAndDown() {
        for(int i = 0; i < 11; i++){
            System.out.print("_");
        }
    }
    public void setUpTheBoard(){
        getFirstRow();
        for (int i = 0; i < 10; i++){
            getLeftSideAndRightSide();
            System.out.println("");

       }

    }

}
