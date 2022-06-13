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
    public void getPlayerTwoMap(){
        for (int j = 0; j < 11; j ++){
            System.out.print(" |");
        }
    }
    public void getPlayerOneMap() {

        for(int i = 0; i < 25; i++){
            if(i <= 10){
                System.out.print(" |");

                }
                if(i == 11) {
                    System.out.print("                   ");
                }
              
                if(i > 13){
                    System.out.print(" |");
                }



        }
//        System.out.print("                   ");
//        for (int j = 0; j < 11; j ++){
//            System.out.print(" |");
//        }

    }
    public void getUpAndDown() {
        for(int i = 0; i < 11; i++){
            System.out.print("   _");
        }
    }
    public void getNumbers(){

//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }

//        for(int j = 0; j < 10; j++){
//            System.out.println("                                                  " + j);
//        }

    }
    public void setUpTheBoard(){

        getFirstRow();
        for (int i = 0; i < 10; i++){
          //  getUpAndDown();

            System.out.print(i);
            getPlayerOneMap();
            System.out.print("                   ");
            System.out.println();


       }

    }

}
