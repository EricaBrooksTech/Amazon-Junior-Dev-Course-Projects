// Inherit from Coffee using the extends keyword
public class Espresso extends Coffee {

    // Declare an attribute to store the number of shots (int)
    int numberOfShots;

    // Constructor to initialize all attributes
    // TODO 6: declare that the constructor throws a ArithmeticException
    public Espresso(String name, String roast, double price, int numberOfShots) throws ArithmeticException {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // TODO 5: check whether at least 1 serving has been selected, if not, throw an exception with a message
        if (numberOfShots <= 0) {
            throw new ArithmeticException("please select at least 1 serving!");
        }

        // Initialize numberOfShots using this
        this.numberOfShots = numberOfShots;
    }

    // TODO 1: Override the grindBeans() method to simulate grinding the espresso beans finely

    @Override
    public void grindBeans() {
        System.out.println("\nGrinding the espresso beans finely...");
    }

    // TODO 2: Override the brewCoffee() method to simulate brewing under high pressure

    @Override
    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure...");
    }

    // TODO 5: Cut the print statements from the printEspressoDetails() method and paste them here
    public void printEspressoDetails() {
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + "$" + this.price + ". Your total bill is " + "$" + this.price * (double)this.numberOfShots + ".");

    }
}

