/*
(RECTANGLE CLASS) 
Create a class Rectangle with attributes length and width, each of which defaults to 1. 
Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods for both length and width. 
The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. 
Write a program to test class Rectangle.
*/
package rectangle;
import java.util.Scanner;

public class rectangleClass {
    
    Scanner input = new Scanner(System.in);
    public float length;
    public float width;
    
    //method to calculate the perimeter
    public float calPerimeter(){
        float perimeter;
        perimeter = (length+width)*2;
        return perimeter;
    }
    
    //method to calculate the area
    public float calArea(){
        float area;
        area = length*width;
        return area;
    }
    
    //default constructor when length and width is given to the instance. the method
    //calls setLength and setWidth methods
    public rectangleClass(float length, float width){
        setLength(length);
        setWidth(width);
    }
    
    // this method is used when no length or width is pass to the instance
    public rectangleClass(){
        this.length = 1;
        this.width = 1;
    }
    
    // a recursive method that checks the length to see if between 0.0 and 20.0
    //and sets the value given to the attribute for the other methods to use
    public void setLength(float length){
        if (length >= 0.0 && length <= 20.0) {
           this.length = length; 
        } 
        else
        {
            System.err.println("Then number you entered for the length is out of range"
                    + " please enter a number between 0.0 and 20.0");
            setLength(length = input.nextFloat());
        }
    }
    
     // a recursive method that checks the width to see if between 0.0 and 20.0
    //and sets the value given to the attribute for the other methods to use
    public void setWidth(float width){
        if (width>=0.0 && width <= 20.0) {
           this.width = width; 
        }
        else
        {
            System.err.println("Then number you entered for the width is out of range n"
                    + " please enter a number between 0.0 and 20.0");
            setWidth(width = input.nextFloat());
        }
    }
    
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    
    
    
    
}
