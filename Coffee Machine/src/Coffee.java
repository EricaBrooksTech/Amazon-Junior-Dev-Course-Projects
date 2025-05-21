public class Coffee {
    String name;
    String roast;
    int caffeineLevelInMg;
    double price;

    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;
        this.setCaffeineLevel();
    }

    public void setCaffeineLevel() {
        switch (this.roast) {
            case "light" -> this.caffeineLevelInMg = 50;
            case "medium" -> this.caffeineLevelInMg = 100;
            case "dark" -> this.caffeineLevelInMg = 150;
            default -> this.caffeineLevelInMg = 0;
        }

    }

    public void grindBeans() {
        System.out.println("\nGrinding beans for " + this.name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + this.name + "...");
    }

    public void printInfo() {
        System.out.println("\nYou ordered a " + this.name + " with a " + this.roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + this.caffeineLevelInMg + " mg.");
    }
}
