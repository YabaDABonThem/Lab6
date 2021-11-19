// Allen Bao
// 11/17/2021
// A program that takes an a number from the user and the power to bring it to, then prints the result

// import statements
import java.util.Scanner;

public class MyProgramWithTwoMethods {
    
    // a method that prints what the program does
    public static void printInstructions() {
        System.out.println("This program calculates the nth power of a base integer input by the user.");
    }
    
    // a method that gets the users input and returns it as an integer
    // this method would cause an error if the the user does not enter an integer
    public static int getIntegerFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        int keyboardInput = keyboard.nextInt();
        return keyboardInput;
    }

    // the main routine
    public static void main(String[] args) {

        // print instructions and get user's input
        printInstructions();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please input your base; an integer less than 10 : ");
        int myInteger = getIntegerFromKeyboard();
        
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        int myExponent = getIntegerFromKeyboard();
        int myIntegerPower = myInteger;

        // perform calculation
        for (int i = 2; i <= myExponent; ++i) {
            myIntegerPower *= myInteger;
        }

        // output result
        System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + myIntegerPower);
    }
}