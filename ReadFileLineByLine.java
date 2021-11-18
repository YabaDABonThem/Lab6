// Allen Bao
// 11/17/2021
// A program that reads through every line of a file and prints out every 7th line. 


import java.util.Scanner; // Import the Scanner class
import java.io.*;         // Import Java I/O classes

// Define a new class
public class ReadFileLineByLine { 

    // the main method
    public static void main (String[] args) throws IOException{ 
	
   	// Variable that holds the name of the file we are reading
      String myFileName = "ReadFileLineByLine.txt";
      
   	// Create a File object called myFile with the name of the file we are reading
      File myFile = new File(myFileName);
   
   	// Create a scanner and pass the File object to read. 
      Scanner inputFile = new Scanner(myFile);
   
   	// Declare varible to keep count of how many times we've looped
      int loopNumber = 0;
   
   	// Declare varible to hold the text in the line of the file bring read
      String fileLine;
      
   	while (inputFile.hasNext()) {
         // Increment loop count
         ++loopNumber;
         
         // Read next line of the file
         fileLine = inputFile.nextLine();
         
         // Prints out the line of the file if the line we're reading is a multiple of 7
         if (loopNumber % 7 == 0) {
            System.out.println(fileLine);
         }

      }
      
   	// Close the file
      inputFile.close();
	
    }
}
	
	