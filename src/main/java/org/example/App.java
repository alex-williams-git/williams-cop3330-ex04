/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();

        System.out.println("Yesterday I saw a " + adjective + " " + noun + ". It began to " + verb + " " + adverb + ". It was truly a sight to see!");
    }
}
