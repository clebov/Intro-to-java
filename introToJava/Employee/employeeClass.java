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


public class employee {
    
    private String fName;
    private String lName;
    private double salary;
    private double rate = .10;
    private double payIncrease;
    
    // constructor to set all the variables to what is being passed by main
    public employee(String fName,String lName, double salary)
    {
        this.fName = fName;
        this.lName = lName;
        if(salary > 0)
        {
        this.salary = salary;
        }
        else
        {
           salary = 0;
        }
    }
    
    // getter and setter for salary
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    //getter and setter for First name
    public String getFname()
    {
        return fName;
    }
    public void setFname(String fName)
    {
        this.fName= fName;
    }
    // getter and setter for Last name
    public String getLname()
    {
        return lName;
    }
    public void setLname(String lName)
    {
        this.lName = lName;
    }
    
    // function to calcualte the Raise an employee gets and print the new total
    public double calculateRaise()
    {
       payIncrease = salary * rate;
        
        return salary + payIncrease;
        
    }
}
