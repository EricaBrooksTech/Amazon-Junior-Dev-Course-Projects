# Vehicle Information Project

The project demonstrates how to define a class, create objects, and use methods to access object data.

## 📚 Project Overview

---

The project contains:

- A `Vehicle` class that stores information about a car, such as make, model, color, and year.
- A `Main` class that creates an instance of `Vehicle`, assigns values, and prints the vehicle's details using a method.

## 🧱 Class Structure

---

### `Vehicle.java`

Defines a class with the following properties:

- `make` (String)
- `model` (String)
- `color` (String)
- `year` (int)

Includes a method:
<pre>
public String getVehicleDetails() 

Returns a formatted string with all vehicle information.

SimulatorMain.java
Creates and configures a Vehicle object:
Vehicle myFirstVehicle = new Vehicle();
myFirstVehicle.make = "Chevrolet";
myFirstVehicle.model = "Blazer";
myFirstVehicle.color = "Bronze";
myFirstVehicle.year = 2019;

Prints the vehicle details:
System.out.println(myFirstVehicle.getVehicleDetails());
</pre>


## 🚀 How to Run

---
Open the project in IntelliJ IDEA.

Ensure both Vehicle.java and Main.java are in the same package or directory.

Right-click the Main class and select Run 'Main.main()'.

## ✅ Example Output

---

Make: Chevrolet
Model: Blazer
Color: Bronze
Year: 2019

## 🛠 Requirements

---
-JDK 24 or higher

-IntelliJ IDEA (or any Java IDE)

## ‍💻 Author

---
Developed by Erica Brooks as part of practice for the Amazon Junior Software Developer Certificate on Coursera.

## 📬 Feedback & Contributions

---
This repository is a work-in-progress learning portfolio. Suggestions, corrections, and ideas are always welcome — feel free to open an issue or pull request.
