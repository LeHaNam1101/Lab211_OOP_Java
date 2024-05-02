/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class test {

    
    public static void main(String[] args) {
        //Step 1: Display a Screen to prompt users to input a positive decimal number
        DisplayPrompt();
        //Step 2: function input a possitve decimal number 
        int size = InputDecimal();
        //Step 3: generate random integer in number randge for each array element 
        int[] arr = {5,1,12,-5,16};
        //Step 4: Display array before sorting
        DisplayArrBef(arr);
        //Step 5: Display array after sorting
        DisplayArrAft(arr);
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
        do{
            temp = sc.nextLine();
            temp=temp.trim();//prevent error user input space
            //while loop if user do not input anything
            while(temp.isEmpty()){
                System.out.println("Please enter a positive decimal number: ");
                temp = sc.nextLine();
            }
            // while loop if user input character and is not a digit 
            // regex do it ^ and $ is archor scan from begin to end of string
            // [] is collection of condition
            while(!temp.matches("^[0-9]+$")){
                System.out.println("Please enter a positive decimal number: ");
                temp = sc.nextLine();
                temp=temp.trim();//prevent error user input space
            }
            check = false;
        }while(check);
        size = Integer.parseInt(temp);
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
    static void DisplayArrAft(int[] arr){
        int swap=0;
        
        System.out.println(Arrays.toString(arr) + "\n");
    
        //loop Bubble sort 
        for (int i=0; i<arr.length; i++){
            // Run a nested for loop to traverse the input array using two variables i and j, 
            // such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
            for(int j=0; j<(arr.length-i-1); j++){
                if(arr[j]>arr[j+1]){
                    System.out.println(Arrays.toString(arr));
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }else{
                    System.out.println(Arrays.toString(arr));
                }
            }
            System.out.println("\n");
        }
        //display sorted array
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

}

