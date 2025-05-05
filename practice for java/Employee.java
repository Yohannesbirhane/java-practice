class Employ{
    int id;
    String name;
    String department;
    float age;
    String sex;
    void showinfo(){
        System.out .println("Employee's information ....");
System.out.println("name: "+name);
System.out.println("id: "+id);
System.out.println("department: "+department);
System.out.println("age: "+age);
System.out.println("sex: "+sex);
    }

}
public class Employee{
    public static void main(String[] args) {
        Employ emp1=new Employ();
       emp1.name="yohannes Birhane ";
       emp1.id=222;
       emp1.department="soetware engineering ";
       emp1.age=22;
       emp1.sex="male";
       emp1.showinfo();
    }
}