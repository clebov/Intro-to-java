package AnimalTEST;

public class Cat extends Animal{
    
    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Fun "+ favToy);
    }

    public void walkAround(){
        System.out.println(this.getName() + " prances around and then sleeps");
    }

    public String getToy(){
        return this.favToy;
    }

    public Cat(){
    }

    public Cat(String name, String favFood, String favToy){
        super(name, favFood);
        this.favToy = favToy;
    }
}
