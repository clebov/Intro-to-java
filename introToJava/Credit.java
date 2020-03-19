//CSS 346
//Professor Fulton
//Assignment 3
//Programmer: Christopher Lebovitz

/*
|---------------------------------------------------------------------------------------------------|
|(Credit Limit Calculator)                                                                          |
|Develop a Java application that determines whether any of several department-store                 |
|customers has exceeded the credit limit on a charge account.                                       |
|                                                                                                   |
|For each customer, the following facts are available:                                              |
|account number,                                                                                    |
|balance at the beginning of the month,                                                             |
|total of all items charged by the customer this month,                                             |
|total of all credits applied to the customer’s account this month,                                 |
|allowed credit limit.                                                                              |
|                                                                                                   |
|The program should input all these facts as integers,                                              |
|calculate the new balance (= beginning balance + charges – credits),                               |
|display the new balance and determine whether the new balance exceeds the customer’s credit limit. |
|For those customers whose credit limit is exceeded,                                                |        
|the program should display the message “Credit limit exceeded”                                     |
|---------------------------------------------------------------------------------------------------|
*/

/*
|---------------------------------------------------------------------------------------------------------|
|NOTES:                                                                                                   |     
|The program will request Account Number, Balance, Charges, Credits, and Credit Limit                     |
|Prompt the user to input Account Number or enter -1 to quit.                                             |
|Make sure you prompt the user for Account Number or -1 before the while loop and inside the while loop.  |
|---------------------------------------------------------------------------------------------------------|
*/
package credit;

import java.util.Scanner;

public class Credit {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        
        
        int accNum = 0;
        int balance, charges, credits, limit,newBalance = 0;
        
        System.out.println("Plese enter the Account number for the Customer. \nEnter -1 to exit.");
        accNum = input.nextInt();
        
        while( accNum != -1)
        {
             
            System.out.println("Please enter the balance of the customer's accoutn for this month.");
            balance = input.nextInt();
            
            System.out.println("Please enter the Charges that are applied to the customer's accout for the month.");
            charges = input.nextInt();
       
            System.out.println("Please enter the Credit applied to the account for this month ");
            credits = input.nextInt();
            
            System.out.println("Please enter the credit limit that the customer has");
            limit = input.nextInt();
     
            newBalance = balance + charges - credits; 
            System.out.printf("The new balance for the account is :%d%n",newBalance);
            
            if (newBalance > limit)
            {
                System.out.println("Credit limit exceeded");
               
            }
            
           System.out.println("\nPlese enter the Account number for the Customer. \nEnter -1 to exit.");
           accNum = input.nextInt(); 
        }
    }
    
}
