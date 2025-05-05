public class Employ {
    String name;
    int id;
    String department;
    int age;
    String sex;

    void view() {
        System.out.println("Employee's Information...");
        System.out.println("Name        ID   Department            Age  Sex");
        System.out.println(name + "  " + id + "  " + department + "  " + age + "  " + sex);
    }

    public static void main(String[] args) {
        Employ emp1 = new Employ();
        emp1.name = "Temesgen";
        emp1.id = 123;
        emp1.department = "Software Engineering";
        emp1.age = 29;
        emp1.sex = "Male";
        emp1.view();
    }
}
