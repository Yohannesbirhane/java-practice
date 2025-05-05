public class Exam {  
    int num;
    String name;
    
    Exam() {
        System.out.println("This is a Java program");
    }


 
    public static void main(String[] args) {
        Exam x = new Exam();
        System.out.println("Name: " + x.name);
        System.out.println("Number: " + x.num);
    }
}
