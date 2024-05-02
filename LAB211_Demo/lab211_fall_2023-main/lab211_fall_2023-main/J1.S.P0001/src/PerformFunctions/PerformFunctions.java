/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerformFunctions;

import UserInput.UserInput;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author win
 */
public class PerformFunctions {

    /**
     * @requried the user enters the size of the array size of array must be
     * integer
     * @return size of array
     */
    public static int inputPositiveNumber() {
        int sizeOfArray = UserInput.getSizeOfArray("Enter number of array: ", 1, Integer.MAX_VALUE);
        return sizeOfArray;
    }

    /**
     * @requried generate random element in array
     * @param size of array Randomly select the value of each element in the
     * array
     */
    public static int[] randomElementInArray(int sizeOfArray) {
        int array[] = new int[sizeOfArray];
        Random ran = new Random();
        //The loop runs from the first element of the array to the last element of the array
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(array.length);
        }
        return array;
    }

    /**
     * @requried show array before sorting
     * @param array
     * @return Print out the elements in the array
     */
    public static void displayArrayBefore(String msg, int array[]) {
        System.out.print(msg);
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    /**
     * @requried Sort array by bubble sort and check bubble sort algorithm
     * @param array 1--> sort, 2--> show steps
     * @return sorted array, show sorting Steps
     */
    public static void sortArraybyBubbleSort(int array[], int option) {
        //format of print array before sorting
        if (option == 2) {
            System.out.print(Arrays.toString(array));
            System.out.print("\tunsorted\n");
            System.out.println();
        }
        //tranverse i from the beginning to the before end 1 element 
        for (int i = 0; i < array.length-1; i++) {
            //tranverse j from first element to last element unsorted array
            for (int j = 0; j < array.length - i - 1; j++) {
                //check if the previous element is greater than the following element
                //if greater then swap
                if (array[j] > array[j + 1]) {
                    if (option == 2) {//format the steps
                        System.out.print(Arrays.toString(array));
                        System.out.print("\t" + array[j] + " > " + array[j + 1] + ", swap\n");
                    }
                    //swap algorithm
                    int item = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = item;
                } else {
                    if (option == 2) {
                        System.out.print(Arrays.toString(array));
                        if (array[j] < array[j + 1]) { //format the steps
                            System.out.print("\t" + array[j] + " < " + array[j + 1] + ", ok\n");
                        } else {
                            System.out.print("\t" + array[j] + " = " + array[j + 1] + ", ok\n");
                        }
                    }
                }

            }
            if (option == 2) {
                System.out.println();
            }
        }
        //format of print array after sorting
        if (option == 2) {
            System.out.print(Arrays.toString(array));
            System.out.print("\tsorted\n");
        }
    }

    /**
     * @requried show array after sorting
     * @param array
     * @return Print out the elements in the array
     */
    public static void displayArrayAfter(String msg, int array[]) {
        System.out.print(msg);
        System.out.print(Arrays.toString(array));
    }


}
