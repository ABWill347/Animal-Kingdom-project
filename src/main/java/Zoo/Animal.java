package Zoo;

public abstract class Animal  {
    //ivar, property, field, attributes
    protected String food;//change the access modifier
    public static int  id;//0 static belongs here
    public static int uniqueID=0;

    private final Size size;

    public Size getSize() {
        return size;
    }

    public Animal(String food, Size size){
        this.food=food;
        this.size=size;
//        uniqueID++;//0+1=1
//        id = uniqueID;
    }
    public static void animalSize(Animal animal){
        System.out.println("The size of the animal is "+animal.getSize());
    }
    public static void printUniqueAnimalMethod(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        }
        if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }public void makeSound() {
            System.out.println("unknown animal sound");
        }
public abstract void printAnimalFood();//signature


}
