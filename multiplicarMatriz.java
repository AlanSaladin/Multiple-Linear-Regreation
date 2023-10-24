public class multiplicarMatriz {

    static double [][] multiplyMatrix (double [][] transposedMatrix, double[][] originalmatrix, int cols, int rows, int transposedCols){

        double resultMatrix[][] = new double[4][4];

        for (int rowTansposed = 0; rowTansposed < transposedCols; rowTansposed++) {
            for (int colOrigin = 0; colOrigin < cols; colOrigin++) {
                for (int rowOrigin = 0; rowOrigin < rows; rowOrigin++)
                    resultMatrix[rowTansposed][colOrigin] += transposedMatrix[rowTansposed][rowOrigin] * originalmatrix[rowOrigin][colOrigin];
            }
        }

        for(int row = 0;row < row;row++){
            for (int col = 0;col < transposedCols;col++){
                System.out.print(resultMatrix[row][col]);
                System.out.print("    ");
            }
            System.out.println();
        }
        return resultMatrix;
    }

    static double[][] multiplyYield (double[][] yieldMatrix, double[][] transposed, int fields, int rows, int yieldRows){

        double result[][] = new double[yieldRows][1];
        int countYield = 0;

        for (int rowTransposed = 0; rowTransposed < rows; rowTransposed++) {
            for (int field = 0; field  < fields; field ++) {
                    result[countYield][0] += yieldMatrix[field][0] * transposed[rowTransposed][field];
            }
            countYield++;
        }

        System.out.println("    ");
        System.out.println("    ");
        for(int row = 0;row < yieldRows;row++){
                System.out.print(result[row][0]);
                System.out.print("    ");
        }
        return result;
    }


    static double[][] multiplyBeta (double[][] bMatrix, double[][] fixValues, int fixRows, int fixcolumns, String origin){

        double result[][] = new double[fixRows][1];
        int countBeta = 0;

        double prediccion = 0;

        for (int row = 0; row < fixRows; row++) {
            countBeta = 0;
            for (int col = 0; col < fixcolumns; col++) {
                if (countBeta == 0){
                    prediccion = bMatrix[countBeta][0];
                    countBeta++;
                }
                prediccion += bMatrix[countBeta][0] * fixValues[row][col];
                countBeta++;
            }
            result[row][0] = prediccion;
        }

        System.out.println("    ");
        System.out.println("    ");
        System.out.println(" Prediccion for " + origin);
        for(int row = 0;row < 4;row++){
            System.out.print(result[row][0]);
            System.out.print("    ");
        }
        return result;
    }
}
