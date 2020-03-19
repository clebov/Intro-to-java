/*
Create the below Vehicle superclass.  Create a Truck subclass that extends Vehicle.
Truck will have one private variable instance called tonnage and a constructor
that includes the super Vehicle constructor. The Truck subclass will print all the
private data members of the superclass along with tonnage. Create a test program
that tests the Truck subclass. Reference Figure 9.11 in Chapter 9 slides.
 */
package VehicalTest;

public class Truck extends Vehicle{
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(){
    }

    // default constructor that uses super to inherit attributes from the parent class
    public Truck(String make, String model, int year, int tonnage){
        super(make, model, year);
        this.tonnage = tonnage;
    }
    // method to print out the attributes that are passed to it when creating a new object
    public void printTruck(){
        System.out.printf("The Truck's Stats are: Make:%s, Model:%s, Year:%d, Tonnage:%d", getMake(),getModel(),
                getYear(),tonnage);
    }


}
