package matrixCalculator.grabarczyk.tomasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Choose: N(ormal)/A(utomatic)/T(est): ");
        if (userInput.hasNext("n") || userInput.hasNext("N")) {
            MatrixCalculator matrixCalculator = new MatrixCalculator();
            matrixCalculator.askForFirstArray();
        } else if (userInput.hasNext("a") || userInput.hasNext("A")) {
            MatrixCalculatorAutomatic matrixCalculatorAutomatic = new MatrixCalculatorAutomatic();
            matrixCalculatorAutomatic.askForFirstArray();
        } else if (userInput.hasNext("t") || userInput.hasNext("T")) {
            MatrixCalculatorTest matrixCalculatorTest = new MatrixCalculatorTest();
            matrixCalculatorTest.askForFirstArray();
        }
    }
}
