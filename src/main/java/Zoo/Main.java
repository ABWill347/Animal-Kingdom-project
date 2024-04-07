package Zoo;

public class Main {
    public static void main(String[] args) {
        Animal animal;//cannot be
        Dog dog= new Dog ("Bones",Size.LARGE);
        //System.out.println(dog.id);
        //dog.food="Cookies";//protected fields due to inheritance
       // dog.makeSound();
        Dog dog1= new Dog ("Bones and more",Size.MEDIUM);
        //System.out.println(dog1.id);
        System.out.println("===========");

        Cat cat =new Cat("Milk",Size.SMALL);
        //cat.food="Cheese";
        //cat.makeSound();
        Animal.animalSize(dog);
        Animal.animalSize(dog1);
        Animal.animalSize(cat);



//        //Polymorphism
//        Animal dogToCat= new Dog("bones");
//        //System.out.println(dogToCat instanceof Animal);
//        //((Dog)dogToCat).fetch();
//        //dogToCat= new Cat("Worms");
//        //((Cat)dogToCat).scratch();
//        System.out.println("=============");
//        //System.out.println(dogToCat instanceof Animal);
//        Animal.printUniqueAnimalMethod(dog);
//        System.out.println("=====interface=====");
//        RoboDog roboDog = new RoboDog();
//        //Pet[] pets = new Pet[3];
//       Pet[] anArrayOfPets={cat,dog,roboDog};//Array literal another way to do it like above
//        Pet.printPetGreeting(anArrayOfPets);

    }
}
