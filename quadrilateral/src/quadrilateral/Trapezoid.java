package quadrilateral;

public class Trapezoid extends Qadrilateral {
    private double height;
    private double sides;
    //default constructor that refers to the parent attributes
    public Trapezoid(double x1, double y1, double x2, double y2,
                     double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getHeight() {
        height = 0; //zero out height
        // find the height of the Trapezoid use Math.absolute to make sure there is
        // always a positive length/height even if given negative coordinates
        // if the y coordinate from point 1 == point 2
        // subtract point 2 from point 3
        // else subtract point 1 from point 2
        if( getPoint1().getY() == getPoint2().getY() )
            height = Math.abs(getPoint2().getY() - getPoint3().getY());
        else
            height = Math.abs(getPoint1().getY() - getPoint2().getY());

        return height;
    }

    public double getSides() {

        sides = 0; //zero out sides

        // find the sum of the Trapezoid use Math.absolute to make sure there is
        // always a positive length/height even if given negative coordinates
        // if the y coordinate from point 1 == point 2
        // use the x coordinates to calculate (point 1 - point 2) + (point3 - point 4)
        // else subtract (point 2 - point 3) + (point 4 - point 1)
        if(getPoint1().getY() == getPoint2().getY())
            sides = Math.abs( getPoint1().getX() - getPoint2().getX() ) +
                    Math.abs( getPoint3().getX() - getPoint4().getX() );
        else
            sides = Math.abs((getPoint2().getX() - getPoint3().getX())+
                    Math.abs(getPoint4().getX()-getPoint1().getX()));
        return sides;
    }

    public double getArea(){
        //calculate the area using the sides and height
        return getSides() * getHeight() / 2.0;
    }
    //Override toString() to print the the coordinates, height, and area
    public String toString() {
        return String.format( "\n%s:\n%s%s: %s\n%s: %s\n",
                 "Coordinates of Trapezoid are", getCoordinates(),
                 "Height is", getHeight(), "Area is", getArea() );
         }
 }

