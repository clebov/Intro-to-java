/*
Create the below Vehicle superclass.  Create a Truck subclass that extends Vehicle.
Truck will have one private variable instance called tonnage and a constructor
that includes the super Vehicle constructor. The Truck subclass will print all the
private data members of the superclass along with tonnage. Create a test program
that tests the Truck subclass. Reference Figure 9.11 in Chapter 9 slides.
 */
package VehicalTest;

public class Main {

    public static void main(String[] args) {
        //create an instance of the subclass Truck that has attributes that are inhered from the parent class Vehicle
        Truck T1 = new Truck("GMC","Serria",1999, 2000);
        //call the method to print the attributes given to T1
        T1.printTruck();
    }
}
