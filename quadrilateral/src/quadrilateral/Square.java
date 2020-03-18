package quadrilateral;

public class Square extends Rectangle {
    //default constructor that refers to the parent attributes
    public Square(double x1, double y1, double x2, double y2,
                  double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    // override the getArea() method to calculate area for Square
    @Override
    public double getArea() {
        return getHeight()* getHeight();
    }

    //Override toString() to print the the coordinates, height, and area
    public String toString(){
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n","Coordinates of Square are", getCoordinates(),
                "Side is", getHeight(), "Area is", getArea() );
    }
}
