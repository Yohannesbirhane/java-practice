public class Cat {
   
    String name;
    int age;

   
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

   
    public void  nameandage() {
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's age: " + age);
    }

    public static void main(String[] args) {
       
        Cat myCat = new Cat();

       
        myCat.nameandage();
    }
}
