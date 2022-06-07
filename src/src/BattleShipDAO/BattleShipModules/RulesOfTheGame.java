package BattleShipDAO.BattleShipModules;

public class RulesOfTheGame {

    public void Rules(){
        System.out.println("The object of Battleship is to try and sink all of the other player's before they sink all of your ships." +
                "\nAll of the other player's ships are somewhere on his/her board. You try and hit them by calling out the coordinates of one of the " +
                "\nsquares on the board.  The other player also tries to hit your ships by calling out coordinates. Neither you nor the other player " +
                "\ncan see the other's board so you must try to guess where they are. Each board in the physical game has two grids:  the lower (horizontal) " +
                "\nsection for the player's ships and the upper part (vertical during play) for recording the player's guesses.");
        System.out.println("\nEach player places the 5 ships somewhere on their board." +
                "\nThe ships can only be placed vertically or horizontally. Diagonal placement is not allowed. No part of a ship may hang off the edge of the board.  Ships may not overlap each other. " +
                "\nNo ships may be placed on another ship." +
                "\nOnce the guessing begins, the players may not move the ships." +
                "\nThe 5 ships are:  Carrier (occupies 5 spaces), Battleship (4), Cruiser (3), Submarine (3), and Destroyer (2). ");
        System.out.println("\nPlayer's take turns guessing by calling out the coordinates. The opponent responds with \"hit\" or \"miss\" " +
                "\nas appropriate. Both players should mark their board with pegs:  red for hit, white for miss. For example, if you call out F6 and " +
                "\nyour opponent does not have any ship located at F6, your opponent would respond with \"miss\". You record the miss F6 by placing a white" +
                "\npeg on the lower part of your board at F6.  Your opponent records the miss by placing." +
                "\nWhen all of the squares that one your ships occupies have been hit, the ship will be sunk.   You should announce \"hit and sunk\".  " +
                "\nIn the physical game, a red peg is placed on the top edge of the vertical board to indicate a sunk ship. " +
                "\nAs soon as all of one player's ships have been sunk, the game ends");
    }
}
