import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Binary_search {
    
    private static final Scanner sc = new Scanner(System.in);
     
    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                } 
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input a positive number!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    private static int[] createRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {   
            arr[i] = rand.nextInt(10);                
        }
        return arr;
    }
    
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    }

 private static int binarySearch(int[] arr, int key) {
    int left = 0;
    int right = arr.length - 1;
    
     while (left<=right) {         
         int mid = left + (right - left) / 2;
         
         if (arr[mid] == key) {
             return mid;  
         }
         
         if (arr[mid] < key) {
             left = mid + 1;
         } else {
             right = mid - 1;
         }
     }
     return -1;
}
    
    private static void printArray(int[] arr) {
        System.out.print("The array: ");
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
        System.out.println("Enter number of array: ");
        int n = checkInputInt();
        int[] arr = createRandomArray(n);
        insertionSort(arr);
        System.out.println("Enter search value: ");
        int key = checkInputInt();
        printArray(arr);
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Found " + key + " at index: " + index);
        } else {
            System.out.println("Value " + key + " not found in the array.");
        }
        
        sc.close();
    }
}

