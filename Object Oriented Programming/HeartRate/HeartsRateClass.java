/*
Programmer: Christopher Lebovitz
CSC317
 */
package heartrate;

import java.util.Scanner;
import java.time.*;

public class HeartsRates{
    
    private String fName;
    private String lName;
    private int age;
    private int maxRate;
    private String target;
    private int month;
    private int day;
    private int year;
    
    Scanner input = new Scanner(System.in);
    //default constructor for HeartsRates class
   public HeartsRates(String fName, String lName, int month, int day, int year){
       this.fName = fName;
       this.lName = lName;
       this.month= month;
       this.day=day;
       this.year= year;
   }

    //method that is used to calcualte the age of the individual by using LocalDate from java.time
    public int CalAge(){      
        
        LocalDate Bdate = LocalDate.of(this.year, this.day, this.month);
        System.out.println(Bdate);
        LocalDate now = LocalDate.now();
        
        Period diff = Period.between(Bdate, now);
        
        return age = diff.getYears();
    }
    // method to calculate the max heart rate of a patient by subtracting age from 220
    public int calMaxRate(){
        return maxRate = 220 - age;
    }
    // method to calculate the Target heart rate for patient
    public String calTargetHeartrate(){
        
        double minTarget = maxRate * .50;
        
        double maxTarget = maxRate * .80;
        
        target = (minTarget + "-" + maxTarget);
        
        return target;
    }
    
    //create setters and getters
    public void setfName(String name){
        this.fName = name;
    }   
    public String getfName(){
        return fName;
    }
    public void setlName(String name){
        this.lName = name;
    }   
    public String getlName(){
        return lName;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
        
    }public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    
}
