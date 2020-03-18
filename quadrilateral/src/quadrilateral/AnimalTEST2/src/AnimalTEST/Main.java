package AnimalTEST;

public class Main {

    public static void main(String[] args) {
	    Animal A1 = new Animal();

        System.out.println(A1.getName());
        System.out.println(A1.favFood);

        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        Animal tabby = new Cat("Tabby","Salmon","Ball");

        acceptAnimal(tabby);

    }

    static void acceptAnimal(Animal randAnimal){
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        randAnimal.walkAround();

        Cat tempCat = (Cat) randAnimal;

        System.out.println(((Cat) randAnimal).favToy);
    }

}
