
import PerformFunctions.PerformFunctions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
public class Main {

    /*
    Package: 
        - default package: 
            - Main.java  // TODO code application logic
        - PerformFunctions(package):
            - PerformFunctions.java  // To implement input, output, bubble sort, check bubble sort
        - UserInput (package):
            - UserInput.java    // Check input data is valid or not.
     */
    public static void main(String[] args) {

        PerformFunctions arraycontrol = new PerformFunctions();
        //Step1: Display a screen to prompt users to input a positive decimal number
        int sizeOfArray = arraycontrol.inputPositiveNumber();
        //Step 2: random element in array
        int array[] = arraycontrol.randomElementInArray(sizeOfArray);
        //array test bubble sort
        //int array[] = {5, 1, 12, -5, 16};
        //Step 3: Display array before
        arraycontrol.displayArrayBefore("Unsorted array: ", array);
        //Step 4: Sort array by bubble sort
        arraycontrol.sortArraybyBubbleSort(array, 1);
        //Step 5: Display array after
        arraycontrol.displayArrayAfter("Sorted array: ", array);

    }
}
