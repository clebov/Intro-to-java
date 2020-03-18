package JavaExample;

public class Main extends ParentClass {
    Main (){
        System.out.println("constructor of parent class");

    }
    void disp(){
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
	// write your code here
        Main ex = new Main();
        ex.disp();
    }
}
