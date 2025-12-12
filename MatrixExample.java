import java.util.Scanner;
public class MatrixExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int column = sc.nextInt();
    int row = sc.nextInt();

        int[][] matrix = new int[column][row];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i+1) * (j+1);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
