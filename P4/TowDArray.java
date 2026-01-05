import java.util.Scanner;
class TowDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int[][] array = new int[rows][cols];
        // Input elements into the 2D array
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // Display the elements of the 2D array
        System.out.println("The elements in the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }
        scanner.close();
        
    }
}
