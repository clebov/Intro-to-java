package quadrilateral;

public class Main {

    public static void main(String[] args) {
        // Create new instances to test each class and see how inheritance works
        Qadrilateral quadrilateral = new Qadrilateral( 1.5, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );

        Trapezoid trapezoid = new Trapezoid(  0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        System.out.printf("%s %s \n", quadrilateral, trapezoid);

        Parallelogram par = new Parallelogram( 5.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );
        System.out.printf("%s \n", par);

        Rectangle rect = new Rectangle(5,3,4,9,6,2,0,8);
        System.out.printf("%s",rect);

        Square square = new Square(-9,-6,15,20,35,11,45,85);
        System.out.printf("%s",square);
        // End test program
    }
}
