/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        boolean test = true;
        int[] arrTest = {5,1,12,-5,16};
        int[] arr = {}; 
        if(test == false){
            //Step 1: Display a Screen to prompt users to input a positive decimal number
            DisplayPrompt();
            //Step 2: function input a possitve decimal number 
            int size = InputDecimal();
            //Step 3: generate random integer in number randge for each array element 
            arr = GenerateDecimal(size);
        }else{
            arr = arrTest;
        }
        //Step 4: Display array before sorting
        DisplayArrBef(arr);
        //Step 5: bubble sort
        int[] arrAft = BubbleSort(arr,test);
        //Step 6: Display array after sorting
        DisplayArrAft(arrAft);
        
    }
    
    static void DisplayPrompt(){
        System.out.println("Enter number of array: ");
    }
    //function check valid input
    static int InputDecimal(){
        int size=0;
        //var to check each loop valid check is true or false
        boolean check = true;
        // obj scan value from keyboard
        Scanner sc = new Scanner(System.in);
        //this String use to check format of data
        String temp = null;
        //while loop check if input is not positive decimal number
        while(check){
            try{
                temp = sc.nextLine().trim();
                size = Integer.parseInt(temp);
                //check if input is negative number
                if(size <= 0){
                    System.err.println("Please input positive decimal number!");
                    throw new Exception();
                }
                //if input valid check=false to out loop check input
                check = false;
            //catch error if input is not positive decimal number
            }catch(Exception e){
                System.err.println("Your input is invalid...Please try again: ");
            }
        }
        return size;
    }
    
    static int[] GenerateDecimal(int size){
        int[] arr = new int[size];// make arr
        Random r = new Random();// make obj to access method in Random class;
        
            //for loop generate random int elements
            for(int i=0; i<size; i++){
                arr[i]= r.nextInt(10)+1;
            }
        
        return arr;
    }
    
    //
    static void DisplayArrBef(int[] arr){
        //display unsorted array
        System.out.print("Unsorted array: ");
        //use toString(arr) method in Arrays class to print right format
        System.out.println(Arrays.toString(arr));
    }
    //
    static void DisplayArrAft(int[] arrAft){
        //display sorted array
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arrAft));
    }
    //
    static int[] BubbleSort(int[] arr,boolean test){
        int swap=0;
        if(test == true){
            System.out.println("\n"); 
            System.out.println(Arrays.toString(arr) + "  unsorted" + "\n");
        }
        //loop Bubble sort 
        // Run a nested for loop to traverse the input array using two variables i and j, 
        // such that 0 ≤ i < n-1 and 0 ≤ j < n-i-
        //for loop traverse each element in array, count times repeat traverse unsorted part from first element to last element in array
        for (int i=0; i<arr.length; i++){
            //condition of test algorithm
            if(test == true){
                System.out.println("");
            }
            //for loop traverse each element in array unsorted part and compare 
            for(int j=0; j<(arr.length-i-1); j++){
                //condition if element in front larger element behind then swap position
                if(arr[j]>arr[j+1]){
                    if(test==true){
                        System.out.print(Arrays.toString(arr) + "  ");
                        System.out.println(arr[j] + " > " + arr[j+1] + "  ,swap");
                    }
                    //swap function
                    swap = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = swap;
                }
                //if element in front smaller element behind then print out to check
                else{
                    if(test==true){
                        System.out.print(Arrays.toString(arr) + "  ");
                        System.out.println(arr[j] + " < " + arr[j+1] + "  ok");
                    }
                }
            }
        }
        return arr;
    }
}
