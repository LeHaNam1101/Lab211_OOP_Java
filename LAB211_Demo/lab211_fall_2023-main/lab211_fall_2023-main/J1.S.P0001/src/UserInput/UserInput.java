/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author win
 */
public class UserInput {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * The check that must be a positive integer or not
     *
     * if is a non-integer, negative integer, is a special character then report
     * an error and re-enter
     * 
     * @param (min,max)
     * @return Integer
     */
    public static int getSizeOfArray(String message, int min, int max) {
        int num;
        // enter integer until correct
        while (true) {
            try {
                System.out.println(message);
                num = Integer.parseInt(in.readLine());
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println("Number inrange [" + min + " - " + max + "]");
                }
            } catch (IOException | NumberFormatException e) { //integer format error
                System.out.println("Please input an integer number!");
                System.out.println("Enter again!");
            }
        }
    }

}
