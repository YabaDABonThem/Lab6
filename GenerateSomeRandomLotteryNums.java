// Allen Bao
// 11/17/2021
// A program that generates a specified amount of random numbers from zero to a specified number

// Import classes we use
import java.util.Scanner;
import java.util.Random;

public class GenerateSomeRandomLotteryNums {
   
   public static void main (String[] args) {
   
   // Ask for user's input
   System.out.println("I know you are busy, so I will guess \nyour lottery numbers for you!");
   System.out.print("How many numbers should I guess? ");
   
   // Get the user's input and store in a variable
   // Get the number of lottery numbers to guess
   Scanner keyboard = new Scanner(System.in);
   int numLotteryNumbers = keyboard.nextInt();
   
   // Get the highest possible number to guess
   System.out.print("What is the highest possible lottery number? ");
   int highestPossibleLotteryNum = keyboard.nextInt();
   
   // Create Random object to create random numbers
   Random randomNumbers = new Random();
   
   // Create variable to hold the value of the random numbers generated
   int randomNum;
   
   // Loop through the amount of lottery numbers the user wanted
   for (int i = 0; i < numLotteryNumbers; ++i) {
      
      // Generate a random number
      randomNum = randomNumbers.nextInt(highestPossibleLotteryNum);
      
      // Conditionals for correct grammar
      if (i == 0) 
         System.out.println("Your first lottery number is " + randomNum);
         
      // the for loop loops through 0 to numLotteryNumbers - 1, since after i is equal to it the for loop ends
      else if (i == numLotteryNumbers - 1) 
         System.out.println("Your last lottery number is " + randomNum);
         
      else
         System.out.println("Your next lottery number is " + randomNum);
   }
   
   }

}