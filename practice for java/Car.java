// Define a simple class named Car
class Carr {
    // Instance variables (fields)
    String brand;
    String color;

    // Method to start the engine
    void startEngine() {
        System.out.println("The engine has started.");
    }
    }


public class Car {
    public static void main(String[] args) {
        // Create a new Car object
        Carr myCar = new Carr();

        // Use the dot operator to access and set instance variables
        myCar.brand = "Toyota";
        myCar.color = "Red";

        // Print the object's variables
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);

        // Call the object's method using the dot operator
        myCar.startEngine();
    }
}
