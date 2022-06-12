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
    }
    public void getLeftSideAndRightSide() {
        System.out.print("");
        for(int i = 0; i < 10; i++){
            System.out.print("  |");
        }
        System.out.print("                   ");
        for (int j = 0; j < 10; j ++){
            System.out.print("  |");
        }
    }
    public void getUpAndDown() {
        for(int i = 0; i < 11; i++){
            System.out.print("_");
        }
    }
    public void getNumbers(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

//        for(int j = 0; j < 10; j++){
//            System.out.println("                                                  " + j);
//        }
    }
    public void setUpTheBoard(){
        getFirstRow();
        getNumbers();
        for (int i = 0; i < 10; i++){

            getLeftSideAndRightSide();
            System.out.println("");

       }

    }

}
