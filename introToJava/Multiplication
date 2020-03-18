/*
(COMPUTER-ASSISTED INSTRUCTION) The use of computers in education is referred to 
as computer-assisted instruction (CAI). Write a program that will help an elementary 
student learn multiplication. Use a SecureRandom object to produce two positive one-digit integers. 
The program should then prompt the user with a question, such as

"How much is 6 times 7?"

The student then inputs the answer. Next, the program checks the student’s answer. 
If it’s correct, display the message 

"Very good!"

and ask another multiplication question. 
If the answer is wrong, display the message 

"No. Please try again."

and let the student try the same question repeatedly until the student finally gets it right. 
A separate method should be used to generate each new question. 
This method should be called once when the application begins execution and each time the user answers the question correctly.
*/
package multiplication;
import java.security.SecureRandom;
import java.util.Scanner;


public class Multiplication {
    
    public static int generateNum(){
        
        // create instance of SecureRandom class
        SecureRandom rand = new SecureRandom();
        // generate random integer s in range 0-->10
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        // take the two random number and multiply them togeather
        int answer = num1 * num2;
        // print the user with the two random number so they can answer the question
        System.out.printf("What is %d times %d?%n",num1, num2); 
        
        return answer;
    }
    
    
    public static void main(String[] args) {
        // create instance of Scanner method
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Multiplication game!\nThis game will"
                + " present the player with multiplication problems\n"
                + "it is the task of the player to correctly solve them to proceed to "
                + "the next one\nTo exit the game Enter -1\n");
        
        // call the methond generateNum() to create the two random numbers that will
        // be multiplied togeather and store the result in the variable "ans"
        int ans = generateNum();
        // Take in the user's answer
        int guess = input.nextInt();
        // while the user dose not input -1 continue to present the user with problems
        
        while(guess != -1){
            
            //compare the answer with the user's guess
            //if ans is equel to guess then tell the user "Very good!" then present a new
            //problem else output "No. Please try again." then read in the new guess
            if (ans == guess)
            {
               System.out.println("Very good!\n");
               
               // call the methond generateNum() to create the two random numbers that will
               // be multiplied togeather and store the result in the variable "ans"
               ans = generateNum(); 
            }
           else
            {
               System.out.println("No. Please try again."); 
            }
            
            guess = input.nextInt();
        }
             
    }
    
}
