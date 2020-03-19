/*
Create the below Vehicle superclass.  Create a Truck subclass that extends Vehicle.
Truck will have one private variable instance called tonnage and a constructor
that includes the super Vehicle constructor. The Truck subclass will print all the
private data members of the superclass along with tonnage. Create a test program
that tests the Truck subclass. Reference Figure 9.11 in Chapter 9 slides.
 */

//code provided by Ms.Fulton
package VehicalTest;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(){
    }

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getMake()
    {
        return make;
    }

    String getModel()
    {
        return model;
    }

    int getYear()
    {
        return year;
    }

    // method to print out the super variables
    {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " +
                year);
    }

}
