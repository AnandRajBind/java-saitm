
public class MatrixAddition {

    public static void main(String[] args) {
        int matrix1[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int matrix2[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int result[][] = {
            {0, 0, 0},
            {0, 0, 0}
        };
//  addition of two matrix 
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf("setting the value for i=%d and j=%d\n", i, j);
            }
        }
// after addition print the result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
