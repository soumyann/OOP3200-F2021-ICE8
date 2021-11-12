/*
*Author : Soumya N.Narayananunni
* Date: Nov 12,2021
* File: ICE8*
 */

package ca.durhamcollege;

import com.sun.jdi.request.ExceptionRequest;

import java.util.InputMismatchException;
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
        boolean isValidInput = false; //SENTINEL Variable
        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) ||  (age >=120.0))
                {
                    //Output

                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120 years old.");
                    keyboard.nextLine();
                    isValidInput = false;

                    /// System.out.printf("You entered: %s \n", name);
                    //System.out.printf("You entered: %.2f \n", age);
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }

        }
        while(!isValidInput);

    }
}

