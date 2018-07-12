package matrixCalculator.grabarczyk.tomasz;

class MatrixCalculator extends Variables {

    private int[][] matrixArray;
    private int[][] matrixSecondArray;

    void askForFirstArray() {

        System.out.print("Enter number of columns for 1st matrix: ");
        setNumberOfColumns(getUserInput().nextInt());
        System.out.print("Enter number of rows for 1st matrix: ");
        setNumberOfRows(getUserInput().nextInt());

        System.out.print("Enter number of columns for 2nd matrix: ");
        setSecondNumberOfColumns(getUserInput().nextInt());
        System.out.print("Enter number of rows for 2nd matrix: ");
        setSecondNumberOfRows(getUserInput().nextInt());

        getDataForArray();
        printArrays();
    }

    private void getDataForArray() {

        matrixArray = new int[getNumberOfRows()][getNumberOfColumns()];
        matrixSecondArray = new int[getSecondNumberOfRows()][getSecondNumberOfColumns()];

        for (int getRows = 0; getRows < getNumberOfRows(); getRows++) {
            for (int getColumns = 0; getColumns < getNumberOfColumns(); getColumns++) {
                System.out.print("Enter a number: ");
                matrixArray[getRows][getColumns] = getUserInput().nextInt();
            }
        }

        for (int getSecondRows = 0; getSecondRows < getSecondNumberOfRows(); getSecondRows++) {
            for (int getSecondColumns = 0; getSecondColumns < getSecondNumberOfColumns(); getSecondColumns++) {
                System.out.print("Enter a number: ");
                matrixSecondArray[getSecondRows][getSecondColumns] = getUserInput().nextInt();
            }
        }
    }

    private void printArrays() {

        System.out.println();

        for (int getRows = 0; getRows < getNumberOfRows(); getRows++) {
            for (int getColumns = 0; getColumns < getNumberOfColumns(); getColumns++) {
                System.out.print(matrixArray[getRows][getColumns] + " ");
            }
            System.out.println();
        }

        for (int numberOfDashes = 0; numberOfDashes < getNumberOfColumns(); numberOfDashes++) {
            System.out.print("___");
        }

        System.out.println("\n");

        for (int getSecondRows = 0; getSecondRows < getSecondNumberOfRows(); getSecondRows++) {
            for (int getSecondColumns = 0; getSecondColumns < getSecondNumberOfColumns(); getSecondColumns++) {
                System.out.print(matrixSecondArray[getSecondRows][getSecondColumns] + " ");
            }
            System.out.println();
        }

        System.out.print("\n");
        System.out.print("Add result: \n\n");

        addMatrix();

        System.out.print("\n");
        System.out.print("Multiply result: \n\n");

        multiplyMatrix();
    }

    private void addMatrix() {

        for (int getRows = 0; getRows < getNumberOfRows(); getRows++) {
            for (int getColumns = 0; getColumns < getNumberOfColumns(); getColumns++) {
                System.out.print(matrixArray[getRows][getColumns] + matrixSecondArray[getRows][getColumns] + " ");
            }
            System.out.println();
        }
    }

    private void multiplyMatrix() {

        for (int getRows = 0; getRows < getNumberOfRows(); getRows++) {
            for (int getColumns = 0; getColumns < getNumberOfColumns(); getColumns++) {
                int sumOfNumbers = 0;
                for (int columnIndex = 0; columnIndex < getNumberOfColumns(); columnIndex++) {
                    sumOfNumbers += matrixArray[getRows][columnIndex] * matrixSecondArray[columnIndex][getColumns];
                }
                System.out.print(sumOfNumbers + " ");
            }
            System.out.println();
        }
    }
}
