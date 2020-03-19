package quadrilateral;

public class Rectangle extends Parallelogram {
    //default constructor that refers to the parent attributes
    public Rectangle(double x1, double y1, double x2, double y2,
                         double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    // override the getArea() method to calculate area for Rectangle
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    //Override toString() to print the the coordinates, height, and area
    public String toString(){
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n", "Coordinates of Rectangle are", getCoordinates(),
                "Width is", getWidth(), "Height is", getHeight(), "Area is", getArea() );
    }
}
