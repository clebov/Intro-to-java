/*
***Christopher Lebovitz***
******Intro to Java*******
********09/26/2019********

Assignment 2:
Employee Class:  Create a class called Employee that includes three instance 
variables—a first name (type String), a last name (type String) and a monthly 
salary (double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value. 
Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again.

 */
package employeetest;

public class EmployeeTest {

 
    public static void main(String[] args) {
        
        // create new employees to test the employee class
        employee EMP1234 = new employee("John","Doe",50000);
        employee EMP4321 = new employee("Jane","Doe",60000);
        employee EMP3214 = new employee("James","Doe",-1111);
        
        
        //Test case for standard employee
        System.out.printf("Employee name: %s %s%n", EMP1234.getFname(),
                EMP1234.getLname());
        System.out.printf("%s %s's salary is %.2f%n", EMP1234.getFname(),
                EMP1234.getLname(), EMP1234.getSalary());
        System.out.println();
                
        //Test care for standard employee
        System.out.printf("Employee name: %s %s%n", EMP4321.getFname(),
                EMP4321.getLname());
        System.out.printf("%s %s's salary is %.2f%n", EMP4321.getFname(),
                EMP4321.getLname(), EMP4321.getSalary());
        System.out.printf("%s %s's pay with Raise is %.2f%n", EMP4321.getFname(),
                EMP4321.getLname(), EMP4321.calculateRaise());
        System.out.println();
        
        //Test case for an employee having a negative salary
        System.out.printf("Employee name: %s %s%n", EMP3214.getFname(),
                EMP3214.getLname());
        System.out.printf("%s %s's salary is %.2f%n", EMP3214.getFname(),
                EMP3214.getLname(), EMP3214.getSalary());
        System.out.printf("%s %s's pay with Raise is %.2f%n", EMP3214.getFname(),
                EMP3214.getLname(), EMP3214.calculateRaise());
        System.out.println();
    }
    
}
