//  Utility class CoffeeMaker
public class CoffeeMaker {

    // Create a void method that takes a Coffee object as an argument
    public void prepareCoffee(Coffee myFavoriteCoffee) {

        // Call the grindBeans() method on the Coffee object
        myFavoriteCoffee.grindBeans();

        // Call the brewCoffee() method on the Coffee object
        myFavoriteCoffee.brewCoffee();
    }
}
