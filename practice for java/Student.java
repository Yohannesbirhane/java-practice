public class Student{
    int id;
    String name ;
    void view()
    {
        System.out.println(id+" "+name );
    }
    public static void main(String[] args) {
        Student stud=new Student();
        stud.view();
    }
}