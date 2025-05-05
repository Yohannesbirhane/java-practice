public class Dog {
    String name;
    String color;
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void printValues() {
        System.out.println("Dog's name: " + name);
        System.out.println("Dog's color: " + color);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Brown");
        myDog.printValues();
    }
}
