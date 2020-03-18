package quadrilateral;

public class Point {
    private double x;
    private double y;
    //default constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //getters for the program to acess the private attributes
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //overriding toString() method to be able to print out the x and y coordinates
    public String toString()
    {
         return String.format( "( %.1f, %.1f )", getX(), getY() );
    }
}
