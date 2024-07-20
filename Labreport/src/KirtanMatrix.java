package dupli;


public class KirtanMatrix {
    public static boolean isSameDimensions(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 7}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        if (isSameDimensions(matrix1, matrix2)) {
            System.out.println("Matrices can be added.");
        }else{
            System.out.println("Matrices cannot be added. Dimensions must be equal.");
        }

    }



}
