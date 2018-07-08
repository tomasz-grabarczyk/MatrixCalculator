package matrixCalculator.grabarczyk.tomasz;

import java.util.Scanner;

class Variables {

    private int numberOfRows;
    private int secondNumberOfRows;
    private int numberOfColumns;
    private int secondNumberOfColumns;
    private Scanner userInput = new Scanner(System.in);

    int getNumberOfRows() {
        return numberOfRows;
    }

    void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    int getNumberOfColumns() {
        return numberOfColumns;
    }

    void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    int getSecondNumberOfRows() {
        return secondNumberOfRows;
    }

    void setSecondNumberOfRows(int secondNumberOfRows) {
        this.secondNumberOfRows = secondNumberOfRows;
    }

    int getSecondNumberOfColumns() {
        return secondNumberOfColumns;
    }

    void setSecondNumberOfColumns(int secondNumberOfColumns) {
        this.secondNumberOfColumns = secondNumberOfColumns;
    }

    Scanner getUserInput() {
        return userInput;
    }

}
