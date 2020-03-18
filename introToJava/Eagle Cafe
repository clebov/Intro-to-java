//Exam 2 - Part B Programming Assignment:
//
//Write a program that displays the following menu:
//Eagle Cafe
//1. Tea
//2. Coffee
//3. Soda
//4. Exit Menn
//Enter option:  
//The menu should repeat until 4 is entered.   When the user selects 1-3 display the following based on selection:
//1 - Display "You owe $3.00
//2 - Display "You owe $4.00"
//3 - Display "You owe $1.00"
//Keep a running total of the amount collected for the day and print the total 
//when the program is exited.  Use a switch statement.  Make sure to comment your code adequately.
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       
       float balanceEOD = 0;
       
       int choice;
       // present to the user the welcome message as well as the menu and it choice number for the items
       System.out.println("Welcome to the Eagle Cafe! \nPlease enter which item you would like to order: \n1: Tea \n2: Coffee"
               + "\n3: Soda \n4: Exit Menu");
       // read in the choice
       choice = input.nextInt();
       
       // while choice is not equil to 4 keep the program running
        while(choice != 4)
        {
            //use a switch statement to add the cost of the item to the EOD balance
            switch(choice){
                case(1):
                    System.out.println("You owe $3.00\n");
                    balanceEOD += 3.00;
                    break;
                case(2):
                    System.out.println("You owe $4.00\n");
                    balanceEOD += 4.00;
                    break;
                case(3):
                    System.out.println("You owe $1.00\n");
                    balanceEOD += 1.00;
                    break;
            }
            
            // print the menu again to the user for evertime that 4 is not entered
            System.out.println("Welcome to the Eagle Cafe! \nPlease enter which item you would like to order: \n1: Tea \n2: Coffee"
               + "\n3: Soda \n4: Exit Menu");
            choice = input.nextInt();            
        }
        
        System.out.printf("The total for the End of Day balance is: %.2f\n", balanceEOD);
    }
    
}
