package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*This program is to
*add comments
This one is a multiple lines comment*/


                Scanner scan = new Scanner(System.in);

                //Creating a new Random class

                Random random = new Random();
                long from = 1;
                long to = 100;
                int randomNumber = random.nextInt(to - from + 1) + from;

                //Intializing variable
                int guessedNumber = 0;

                //Printing the number

                System.out.printf("The number is between %d and %d.\n", from, to);

                //Starting our DO WHILE Loop
                do
                {
                    System.out.print("Guess what the number is: ");
                    guessedNumber = scan.nextInt();
                    if (guessedNumber > randomNumber)
                        System.out.println("Your guess is too high!");
                    else if (guessedNumber < randomNumber)
                        System.out.println("Your guess is too low!");
                    else
                        System.out.println("You got it!");
                } while (guessedNumber != randomNumber);
            }
        }

