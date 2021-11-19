// Allen Bao
// 11/17/2021
// A program that takes an a number from the user and the power to bring it to, then prints the result

// import statements
import java.util.Scanner;

public class MyProgramWithOneMethod {
    
    // a method that prints what the program does
    public static void printInstructions() {
        System.out.println("This program calculates the nth power of a base integer input by the user.");
    }

    // the main routine
    public static void main(String[] args) {

        // print instructions and get user's input
        printInstructions();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please input your base; an integer less than 10 : ");       
        int myInteger = keyboard.nextInt();
        
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        int myExponent = keyboard.nextInt();
        int myIntegerPower = myInteger;
        
        // perform calculation
        for (int i = 2; i <= myExponent; ++i) {
            myIntegerPower *= myInteger;
        }

        // output result
        System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + myIntegerPower);
    }
}