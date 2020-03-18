/**
Assignment1: Squares
Christopher Lebovitz
CSC 346 G001 Intro to java MW 4:45
Write a java program that creates a Square Area and Perimeter Calculator.
Display a menu as follows:
Calculate Area of a Square
Calculate Perimeter of a Square
Enter Option (Option 1 or 2):
Assign the option value to an int variable called option.
Create an integer variable called length
Prompt the user to input a value for length 
Write two separate if statements for options 1 and 2.
-  Calculate the result based on option 1 and 2.
-  Display to Screen
Upload your .java file to this assignment.
 
*/
package assignment1;
import java.util.Scanner; // program uses class Scanner

public class Square 
{
    
    public static void main(String[] args) 
    {
        
     Scanner input = new Scanner(System.in);
     // these variables are used to store the user's choice of what calculation 
     // they want to do and the values used to do the calculations
     int option;
     int length;
     
     // prompts the user to make a choice to calculate area or Perimeter of a square
     System.out.println("Would you like to Calculate the Area: 1 or Perimeter: 2 "
             + "of a square. Please enter 1 or 2");
     option = input.nextInt();
     
     // if option 1 is selected the user want to calculate the area of a Square
     if(option  == 1)
        {
         // prompt the user to ender the length and width of the square and store it 
         // in the respective variables.
         System.out.println("Enter the Length of the square");
        // read in the length
            length = input.nextInt();
         // make a variable to store the area of a square
         int area;
         // calculate the area
         area = length*length;
         // print out the results of the calculation
         System.out.printf("The Area of the Square is: %d%n", area);
     
     // if option 2 is selected the user want to calculate the Perimeter
     // of the square
        }
     if(option == 2)
        {
         System.out.println("Enter the length of the square");
            length = input.nextInt();
     // create the varable to store the calculations for Perimeter       
        int Perimeter;
     // do the calcualtions for Perimeter   
        Perimeter = length*4;
     // out put the results of the calculations
        System.out.printf("The Perimeter of the Square is : %d%n" ,Perimeter);
        }
    }
    
}
