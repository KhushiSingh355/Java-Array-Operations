import java.util.Scanner;

public class NumberArrayOperation {

    public static void sortArray(int[] arr) {
        int n = arr.length;
    // Sorting the array using Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void SecondLowAndHigh(int[] arr) {
        int secondLowest = arr[1];                  
        int secondHighest = arr[arr.length - 2];    

        System.out.println("Second Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        sortArray(numbers);

        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        SecondLowAndHigh(numbers);

        input.close();
    }
}
