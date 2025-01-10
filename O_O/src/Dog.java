public class Dog implements DomesticAnimalSound{
    @Override
    public void makeHappySound() {
        System.out.println("Wag tail");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}
