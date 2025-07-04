import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for getting input
        Scanner keyboard = new Scanner(System.in);
        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // Animal choice menu
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter the number of Stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter decibel of roar:");
                                tigerObject.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("The characteristics of the " + tigerObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Number of stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound level of roar: " + tigerObject.getSoundLevel());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                // clear issues with reading strings after numbers
                                keyboard.nextLine();
                                System.out.println("Enter the color of the dolphin:");
                                dolphinObject.setColor(keyboard.nextLine());
                                System.out.println("Enter the speed of the dolphin:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("The characteristics of the " + dolphinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Color:" + dolphinObject.getColor());
                                System.out.println("Speed:" + dolphinObject.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the dolphin swimming (true/false):");
                                penguinObject.setSwimming(keyboard.nextBoolean());

                                System.out.println("Enter the walk speed of the penguin:");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.println("Enter the swim speed of the penguin:");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("The characteristics of the " + penguinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Walking Speed:" + penguinObject.getWalkSpeed());
                                System.out.println("Swimming Speed:" + penguinObject.getSwimSpeed());
                                break;
                            case 3:
                                if (penguinObject.isSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                    //Introduce case 4 to call the writeObjectsToFile method to save the object state of the animal into the file
                        case 4:
                    writeObjectsToFile(tigerObject, penguinObject, dolphinObject);
                    break;

                //Introduce case 5 to call the readObjectsFromFile method to fetch the object state of the animal from the file to display on screen
                 case 5:
                    readObjectsFromFile();
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Save animals to file");
        System.out.println("5. Display saved animals from file");
        System.out.println("Enter choice of animal (1-5):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }

    // Write a method named writeObjectsToFile and pass Tiger, Penguin and Dolphin to be saved onto a file.
        public static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        // Save Tiger object
        try (ObjectOutputStream oosTiger = new ObjectOutputStream(new FileOutputStream("tiger.txt"))) {
            oosTiger.writeObject(tiger);
            System.out.println("Tiger object saved to tiger.txt");
        } catch (IOException e) {
            System.out.println("Error saving Tiger object: " + e.getMessage());
        }

        // Save Penguin object
        try (ObjectOutputStream oosPenguin = new ObjectOutputStream(new FileOutputStream("penguin.txt"))) {
            oosPenguin.writeObject(penguin);
            System.out.println("Penguin object saved to penguin.txt");
        } catch (IOException e) {
            System.out.println("Error saving Penguin object: " + e.getMessage());
        }

        // Save Dolphin object
        try (ObjectOutputStream oosDolphin = new ObjectOutputStream(new FileOutputStream("dolphin.txt"))) {
            oosDolphin.writeObject(dolphin);
            System.out.println("Dolphin object saved to dolphin.txt");
        } catch (IOException e) {
            System.out.println("Error saving Dolphin object: " + e.getMessage());
        }
    }

    // Read the file tiger.txt, penguin.txt and dolphin.txt
    public static void readObjectsFromFile() {
        // Read Tiger object
        try (ObjectInputStream oisTiger = new ObjectInputStream(new FileInputStream("tiger.txt"))) {
            Tiger tiger = (Tiger) oisTiger.readObject();
            System.out.println("Tiger object read from tiger.txt:");
            System.out.println(tiger);  // calls toString()
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading Tiger object: " + e.getMessage());
        }

        // Read Penguin object
        try (ObjectInputStream oisPenguin = new ObjectInputStream(new FileInputStream("penguin.txt"))) {
            Penguin penguin = (Penguin) oisPenguin.readObject();
            System.out.println("Penguin object read from penguin.txt:");
            System.out.println(penguin);  // calls toString()
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading Penguin object: " + e.getMessage());
        }

        // Read Dolphin object
        try (ObjectInputStream oisDolphin = new ObjectInputStream(new FileInputStream("dolphin.txt"))) {
            Dolphin dolphin = (Dolphin) oisDolphin.readObject();
            System.out.println("Dolphin object read from dolphin.txt:");
            System.out.println(dolphin);  // calls toString()
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading Dolphin object: " + e.getMessage());
        }
    }
}



