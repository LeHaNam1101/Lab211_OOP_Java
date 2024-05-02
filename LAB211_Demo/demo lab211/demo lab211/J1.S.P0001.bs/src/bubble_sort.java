
import java.util.Scanner; 
import java.util.Random; 
import java.util.Arrays;

public class bubble_sort {
    
    private static final Scanner sc = new Scanner(System.in);

    private static int checkInputInt(){
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0){
                    throw new NumberFormatException();
                } 
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input an positive number !");
                System.out.print("Enter again: ");
            }
        }
    }
   
    private static int inputSizeOfArray() {          
        System.out.println("Enter number of array: ");
        return checkInputInt();
    }
    
    private static void random(int n, int arr[]){
         Random rand = new Random();
        for (int i = 0; i < n; i++) {   
        arr[i] = rand.nextInt(10);              
        }
    }

    private static int[] sortArrayByBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
    int n = inputSizeOfArray();
    int arr[] = new int[n];
        random(n, arr);
        System.out.print("Unsorted array: ");
        printArray(arr);
    int[] sortedArr = sortArrayByBubbleSort(arr);
        System.out.print("Sorted array: ");
        printArray(sortedArr);
        sc.close();
}
}
