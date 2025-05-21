public class Espresso extends Coffee {
    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetails() {
        System.out.println("You asked for " + this.numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + "$" + this.price + ". Your total bill is " + "$" + this.price * (double)this.numberOfShots + ".");
    }
}
