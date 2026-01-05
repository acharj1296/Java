import java.util.Scanner;
class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        // Input elements into the array
        System.out.println("Enter " + 5 + " elements:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        // Display the elements of the array
        System.out.println("The elements in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Array[" + i + "] = "+array[i]);
        }
        scanner.close();
        
    }
}