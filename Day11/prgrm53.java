import java.util.Scanner;

public class prgrm53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Top row
        for (int j = 0; j < cols; j++) {
            System.out.print(mat[0][j] + " ");
        }

        // Right column
        for (int i = 1; i < rows; i++) {
            System.out.print(mat[i][cols - 1] + " ");
        }

        // Bottom row
        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(mat[rows - 1][j] + " ");
            }
        }

        // Left column
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}