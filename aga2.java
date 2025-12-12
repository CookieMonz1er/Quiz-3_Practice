//A program that sums by row
import java.util.Random;
public class aga2 {
    public static void main(String[] args) {
        Random rg = new Random();
        int column = rg.nextInt(5,10);
        int row = rg.nextInt(5,10);

        int[][] matrix = new int[column][row];

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]= rg.nextInt(1,10);
            }
        }

        for(int i=0; i<matrix.length; i++){
            int counter = 0;
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ "\t");
                counter += matrix[i][j];
            }


            System.out.println("= "+counter);
        }

    }
}
