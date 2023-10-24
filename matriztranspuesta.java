public class matriztranspuesta {

    public matriztranspuesta(){

    }

    double[][] transposedMatrix (double[][] origin, int colms, int rows){
        double[][] destination = new double[rows][colms];
        for(int row = 0;row < rows;row++){
            for (int col = 0;col < colms;col++){
                destination[row][col] = origin[col][row];
            }
        }
        return destination;
    }


    public void print (double [][] trasnposedMatrix, int colms, int rows,String origin){

        System.out.println("    ");
        System.out.println("    ");
        System.out.println("Transposed for " + origin);
        for(int row = 0;row < rows;row++){
            for (int col = 0;col < colms;col++){
                System.out.print(trasnposedMatrix[row][col]);
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
