package Zoo;
//cat is a relationship=inharatince feline - extends keyword
public class Cat extends Feline implements Pet{
    public Cat(String food, Size size) {
        super(food,size);
    }

    @Override
    public void makeSound(){
        System.out.println("mewo");

    }
    @Override
    public void printAnimalFood() {

        System.out.println(this.food);
    }
    public void scratch(){

        System.out.println("I am a cat i scratch things");
    }

    @Override
    public void greetOwner() {
        System.out.println("Rubs hands");
    }

}
