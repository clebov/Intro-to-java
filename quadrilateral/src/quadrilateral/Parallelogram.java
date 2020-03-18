package quadrilateral;

public class Parallelogram extends Trapezoid {
    //default constructor that refers to the parent attributes
    private double width;
    public Parallelogram(double x1, double y1, double x2, double y2,
                         double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    //method to calculate the width of the triangle
    public double getWidth() {
        if(getPoint1().getY() == getPoint2().getY())
            width = Math.abs(getPoint1().getX() - getPoint2().getX());
        else
            width = Math.abs(getPoint2().getX() - getPoint3().getX());
        return width;
    }
    // override the getArea() method to calculate area for Parallelogram
    @Override
    public double getArea() {
        return getWidth()*getHeight();
    }

    //Override toString() to print the the coordinates, height, and area
    public String toString(){
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n","Coordinates of Parallelogram are", getCoordinates(),
                "Width is", getWidth(), "Height is", getHeight(),"Area is", getArea() );
    }
}
