package lecture4;

public class Task5 {
    public static void main(String[] args) {
        // მატრიცის შექმნა
        int [][] matrix =
                {
                        {0, 1, 1, 1, 1, 1, 1},
                        {0, 0, 1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0}
                };
        System.out.println("თავდაპირველი მატრიცა:");
        // თავდაპირველი მატრიცის დაბეჭდვა
        System.out.println("🔹 საწყისი მატრიცა:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // შებრუნებული მატრიცის შექმნა
        int[][] flippedMatrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                flippedMatrix[i][j] = matrix[i][6 - j];
            }
        }

        // შებრუნებული მატრიცის დაბეჭდვა
        System.out.println("გარდაქმნილი მატრიცა:");
        for (int i = 0; i < flippedMatrix.length; i++) {
            for (int j = 0; j < flippedMatrix[i].length; j++) {
                System.out.print(flippedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
