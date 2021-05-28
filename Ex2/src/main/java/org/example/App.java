package org.example;
import java.util.Scanner;
/**
 * Be sure the output contains the original string.
 * Use a single output statement to construct the output.
 * Use a built-in function of the programming language to determine the length of the string.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String userstr = reader.nextLine();
        System.out.println(userstr + " has " + userstr.length() + " characters.");
    }
}
