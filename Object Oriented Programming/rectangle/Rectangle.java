/*
    (RECTANGLE CLASS) 
    Create a class Rectangle with attributes length and width, each of which defaults to 1. 
    Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods for both length and width. 
    The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. 
    Write a program to test class Rectangle.
*/
package rectangle;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float length;
        float width;
        float perimeter;
        float area;
  
        System.out.println("Please enter the length of the rectangle");
        length = input.nextFloat();
        System.out.println("Please enter the width of the rectangle");
        width = input.nextFloat();
        
        rectangleClass rect1 = new rectangleClass(length,width);
        
        perimeter = rect1.calPerimeter();
        area = rect1.calArea();
        
        System.out.printf("the perimeter of the Rectangle is: %.2f%n",perimeter);
        System.out.printf("the area of the Rectangle is: %.2f%n",area);
        
        rectangleClass rect2 = new rectangleClass();
        System.out.printf("rect2 is the case where length and width are not "
                + "given to the instance when being created %nthe values are defaulted"
                + " to length:%.2f and width:%.2f%n",rect2.getLength(), rect2.getWidth());
    
    }
    
}
