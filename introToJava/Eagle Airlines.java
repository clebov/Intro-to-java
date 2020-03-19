/*
(EAGLE AIRLINE RESERVATIONS SYSTEM) Eagle Airline has just purchased a computer for its new automated reservations system. 
You’ve been asked to develop the new system. You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following menu/alternatives: 

Eagle Airlines
1 First Class
2 Economy
3 Print Receipt
4 Exit

If the user types 1, your application should assign a seat in the first-class section (seats 1–5) and save the student's ID. 
If the user types 2, your application should assign a seat in the economy section (seats 6–10) and save the student's ID. 
Your application should then display a boarding pass indicating the person’s seat number, student ID and whether it’s in the first-class or economy section of the plane.  

Use a one-dimensional boolean array to represent the seating chart of the plane. Initialize all the elements of the array to false to indicate that all the seats are empty.  
As each seat is assigned, set the corresponding element of the array to true to indicate that the seat is no longer available.Use a one-dimensional parallel integer array to assign the students ID. 

Your application should never assign a seat that has already been assigned. 
When the economy section is full, your application should ask the person if it’s acceptable to be placed in the first-class section (and vice versa). 
If yes, make the appropriate seat assignment. If no, display the message "Next flight leaves in 3 hours."

When selection 3 is selected, request the student ID and search through the int array to find the appropriate seat number and display the Student ID Number and Seat Number. 

NOTE:  The Student ID is an integer value (USM ID without the w).  The seating chart can be integer array instead of a boolean.
*/
package eagleairline;
import java.util.Scanner;

public class EagleAirline {
    // method to print the menu to the user
    public static void Menu(){
    System.out.println("Eagle Airlines");
    System.out.println("1: First Class");
    System.out.println("2: Economy");
    System.out.println("3: Print Receipt");
    System.out.println("4: Exit");
    }
    
    //method to assign a seat in First class which only loops throught index
    //zero through four
    public static void assignFirstClass(boolean[] seating,int ID, int[] StudentID){
        char sw;
        int x = 0;
        Scanner input = new Scanner (System.in);
        
        // first scan the array and count how many elements in the array are set to true
        // in the first half of the array        
        for(int i = 0; i <=4; i++)
        {
            if(seating[i] == true)
            {
                x++;
            }
        }
        //if there are less than five elements in the array set to true in the first
        //half of the array find the first false element and set it to true and assign
        //the student id to the studentID array at the same index location. else 
        //tell the user that the section is full and ask if they would like to switch
        //To Economy. if yes call assignEconomy, if no, tell the user that the next flight
        //leaves in three hours
        if(x <= 4){
            for(int i = 0; i <= 4; i++)
                {
                    if(seating[i]==false)
                    {
                        seating[i] = true;
                        StudentID[i] = ID;
                        break;
                    }
                }
        }
        else
        {
            System.out.println("this section is full is it acceptable to be placed in the Economy section.y/n?");
            System.out.print("");
            sw =input.next().charAt(0);
            
            if(sw == 'y'){
                assignEconomy(seating,ID,StudentID);
            }
            else{
                System.out.println("Next flight leaves in the 3 hours.\n");
            }
        };
       
    }
    // method to assign a seat in the Economy class which only loops through index
    // five throught ten.
    public static void assignEconomy(boolean[] seating,int ID, int[] StudentID){
        char sw;
        
        Scanner input = new Scanner (System.in);
        
        int x = 0;
        // first scan the array and count how many elements in the array are set to true
        // in the second half of the array   
        for(int i = 5; i <= 9; i++)
        {
            if(seating[i] == true)
            {
                x++;
            }
            
        }
        //if there are less than five elements in the array set to true in the second
        //half of the array find the first false element and set it to true and assign
        //the student id to the studentID array at the same index location. else 
        //tell the user that the section is full and ask if they would like to switch
        //To Economy. if yes call assignFirstClass, if no, tell the user that the next flight
        //leaves in three hours
        if(x <= 4){
        for(int i = 5; i <= 9; i++)
            {
                if(seating[i]==false)
                {
                    seating[i] = true;
                    StudentID[i] = ID;
                    break;
                }
            }
        }
        else{
            
            System.out.println("this section is full is it acceptable to be placed in the first-class section.y/n?%n");
            sw =input.next().charAt(0);
            
            if(sw == 'y'){
                assignFirstClass(seating,ID,StudentID);
            }
            else{
                System.out.println("Next flight leaves in the 3 hours/n.");
            }
        }
    }
    // method to loop throught the studentID array and if the student ID matches the 
    // id in the array print the index at which the id is in with the student ID that was entered
    public static void printReceipt(boolean[] seating, int id, int[] studentID){
        String section;
        for(int i = 0; i < studentID.length; i ++)
        {
            if(i <4){section = "First Class";}
            else{section = "Economy";}
            if(studentID[i] == id)
            {
                if(i <=4){section = "First Class";}
                else{section = "Economy";}
                
                System.out.printf("Thank you: %d your section is %s seat number  "
                        + ": %d%n", id, section,  i+1);
            }
        }
    }
    //method to check to see if the entire flight is booked
    public static boolean isFull(boolean[] x){
        boolean flag = false;
        int seatCounter =0;
        for(int i= 0; i < x.length; i++){
            if(x[i]== true){
                seatCounter++;
            }
        }
        if(seatCounter == 10){
            flag=true;
        }
        
        return flag;
    }
    
    
    public static void main(String[] args) {
        // varaible used to store the choice entered by the user
        int choice;
        
        Scanner input = new Scanner (System.in);
        //variable used to store the ID that the user entered
        int ID;
        //create the arrays that will hold StudentID as well if the seat on the plane has been taken
        int studentID[];
        studentID = new int[10];
        boolean seating[];
        seating = new boolean[10];
        //fill the boolean array to false for every element in the array
        java.util.Arrays.fill(seating, Boolean.FALSE);
        
        //call the method that prints the menu
        Menu();
        //read in the choice.
        choice = input.nextInt();
        
        //while the choice is not four keep presenting the user with the menu and based off
        //the number enterd call the appropriate method. if the user enters an invalad
        //option tell the user to choose a valad option.
        while(choice != 4){

            switch(choice){
                case 1: 
                    // if the flight is full tell the user and exit the switch before it calls the 
                    // assignFirstClass method
                    if(isFull(seating)==true)
                    {
                        System.out.println("The flight is full. The next flight leaves"
                                + "in the next three hours\n");
                        break;
                    }
                    System.out.println("Please enter our Student ID");
                    ID = input.nextInt();
                    assignFirstClass(seating,ID,studentID);
                    break;
                case 2:
                    // if the flight is full tell the user and exit the switch before it calls the 
                    // assignEconomy method
                    if(isFull(seating)==true)
                    {
                        System.out.println("The flight is full. The next flight leaves"
                                + "in the next three hours\n");
                        break;
                    }
                    System.out.println("Please enter our Student ID");
                    ID = input.nextInt();
                    assignEconomy(seating,ID,studentID);
                    break;
                case 3:
                    System.out.println("Please enter our Student ID");
                    ID = input.nextInt();
                    printReceipt(seating,ID,studentID);
                    break;
                case 4:
                    break;
                default:
                    System.out.print("You have entered an invalad option. "
                            + "Please enter a valad option\n");
                    
            }
            Menu();
            choice = input.nextInt(); 
        } 
    }
    
}
