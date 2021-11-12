/*
*Author : Soumya N.Narayananunni
* Date: Nov 12,2021
* File: ICE8*
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Define your scanner
        Scanner keyboard = new Scanner(System.in);

        //Input
        //Name
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        //Age
        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
