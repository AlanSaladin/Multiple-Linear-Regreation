import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Test_MLR {

    public static void main(String[] args){

        double profit = 0;
        double [][] destination;
        double [][] rTranspuesta;
        double [][] inverse;
        double [][] yield;
        double [][] beta;

        matriztranspuesta transposedMatrix = new matriztranspuesta();
        Matrices originalMatrix = new Matrices();
        multiplicarMatriz multiplyMatrix = new multiplicarMatriz();
        InvertirMatriz minverse = new InvertirMatriz();

        String origin = "50_Startups";
        destination = transposedMatrix.transposedMatrix(originalMatrix.originalMatrix,50,4);
        transposedMatrix.print(destination, 50,4, origin);
        rTranspuesta = multiplyMatrix.multiplyMatrix(destination, originalMatrix.originalMatrix, 4,50,4);
        inverse = minverse.crame(rTranspuesta, 4,4, origin);
        yield = multiplyMatrix.multiplyYield(originalMatrix.yield,destination, 50, 4, 4);
        beta = multiplyMatrix.multiplyYield(yield,inverse, 4, 4, 4);
        multiplyMatrix.multiplyBeta(beta,originalMatrix.fixValues, 5, 3,origin);


        origin = "Chemical";
        destination = transposedMatrix.transposedMatrix(originalMatrix.chemical,17,3);
        transposedMatrix.print(destination,17,3, origin);
        rTranspuesta = multiplyMatrix.multiplyMatrix(destination, originalMatrix.chemical, 3,17,3);
        inverse = minverse.crame(rTranspuesta,3,3, origin);
        yield = multiplyMatrix.multiplyYield(originalMatrix.yieldChemical,destination, 17, 3, 3);
        beta = multiplyMatrix.multiplyYield(yield,inverse, 3,3,3);
        multiplyMatrix.multiplyBeta(beta,originalMatrix.fixValuesChemical, 5, 2,origin);



    }

}
