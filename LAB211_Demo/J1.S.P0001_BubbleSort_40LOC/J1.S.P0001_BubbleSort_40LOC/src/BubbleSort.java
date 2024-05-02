
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class BubbleSort {
    public static void main(String[] args) {
        int inputNumber = inputPositiveNumber("Enter abc");
        int searchNumber = inputPositiveNumber("Enter search number");
        int array[] = generateRandomArray(inputNumber);
        displayArray(array);
        int result = linearSearch(array,searchNumber);
        displayResult(searchNumber,result);
    }

    private static int linearSearch(int[] array, int searchNumber) {
      for (int i=0;i<array.length;i++){
          if(searchNumber == array[i])
              return i;
      }
        return  -1;
    }

    private static void displayResult(int searchNumber,int result) {
        if(result != 1){
            System.out.println("found " + searchNumber + " at " + result);
        }
        else{
            System.out.println("Not found");
        }
    }

    private static void displayArray(int[] array) {
        System.out.println("Array : " + Arrays.toString(array));
    }

    private static int[] generateRandomArray(int inputNumber) {
        int array[] = new int[inputNumber];
        Random random = new Random();
        for (int i =0;i < inputNumber; i++){
            array[i] = random.nextInt(inputNumber);
        }
        return  array;
    }

    private static int inputPositiveNumber(java.lang.String message) {
        Scanner sc = new Scanner(System.in);
        while (true){
           try{
               System.out.println(message);
               int number = Integer.parseInt(sc.nextLine());
               if(number > 0){
                   return number;
               } else{
                   System.out.println("Please input number greater 0!!!");
               }
           } catch (NumberFormatException ex){
               System.out.println("Invalid number.");
           }
        }
    }

}


