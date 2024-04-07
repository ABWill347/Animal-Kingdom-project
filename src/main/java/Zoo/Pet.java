package Zoo;

public interface Pet {
    //final
    //public abstract methods in them
    void greetOwner();
    //default method
    //static methods
//default void printPetCallName(Pet pet){
//    System.out.println(pet.getClass().getSimpleName());
//}
    //looping enhanced for loop for each loop
    static void printPetGreeting(Pet[] pets){//don't repeat yourself
        //dogs greeting
        //cats greeting
        //robodogs greeting
        //Array of pets
        for (Pet p:pets){
        p.greetOwner();
        }
        //for each class the implements pet
    }
}
