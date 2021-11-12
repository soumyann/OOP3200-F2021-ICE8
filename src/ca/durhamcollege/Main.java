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
        String name = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name:");
        name = keyboard.nextLine();
        System.out.printf("You entered: %s ", name);
    }
}
