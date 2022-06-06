package BattleShipDAO.BattleShipModules;

public class BattleShipBoard {
    // This map will need to be 10 by 10.
    private int columns = 10;
    private int rows = 10;
    String[][] letters = new String[rows][columns];

    String[][] numbers = new String[rows][columns];

    public BattleShipBoard(int columns, int rows, String[][] letters, String[][] numbers) {
        this.columns = columns;
        this.rows = rows;
        this.letters = letters;
        this.numbers = numbers;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String[][] getLetters() {
        return letters;
    }

    public void setLetters(String[][] letters) {
        this.letters = letters;
    }

    public String[][] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[][] numbers) {
        this.numbers = numbers;
    }
}
