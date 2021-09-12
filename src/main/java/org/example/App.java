/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("Enter a noun?");
        String noun = keyboardInput.nextLine();

        System.out.print("Enter a verb?");
        String verb = keyboardInput.nextLine();

        System.out.print("Enter an adjective?");
        String adjective = keyboardInput.nextLine();

        System.out.print("Enter an adverb?");
        String adverb = keyboardInput.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's Hilarious!" );



    }
}
