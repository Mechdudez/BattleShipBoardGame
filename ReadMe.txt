Step 1 set up the map using the Ocean class and have it generate before the game starts this will be a 10 x 10 map
The Ocean class will need a 2d array with columns and rows... one will be for numbers and the other will be letters
for example, A1 - through A10. Be sure it have it cap out at 10 both ways.

Step 2 Ships Class, have the ships be put in the game on the created map randomly, there will be a ship with 5(Carrier) spots,
4(BattleShip),
Submarine(3),
Cruiser(3)
and Scout(2).
I will need another 2d array for the ships, so they are put within the Ocean array, so it doesn't go out of bound
Once ships are put into place, the game will then move into the player picking which side they want to play on

Step 3 TheBattleField class... This will be the JFrame to where the player will be able to see the map that was built
and where his/her ships were placed. This will make it to where they will be able to pick where they would like to attack.


Step 4. PlayerAndComputer class... This will have the player pick which side they wish to play on.
(Once the basic game is set, I will figure out how the player can place their ships by saying something like A1 to J1.
They will see the map as they place them like the board game)

Step 5. Targeting class... This will let the player pick where they would like to choose to hit. When chosen if it misses
it will put that part in the array as -1 so it can't be picked again, On the map it will put an X as a miss.
a checkmark will be put if the player/computer lands a hit. Will have to have something to say/show that a ship has been destroyed.

Step 6 StartGame Class... The game will introduce the player to the game they are about to play.
The game will end when either player or computer runs out of ships.
The game will give the player an option to play again once either side loses or exit if they don't.

? = Fog of war
X = miss
H = hit a part of a ship
S = the entire ship sunk