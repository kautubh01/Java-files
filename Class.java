
class employee{
    String name;
    int age;
    int salary;
    public void printdetails(){
        System.out.println("the name of employee:"+ name);
        System.out.println("the age of employee:"+age);
        System.out.println("the salary of employee:"+salary);
    }
}
public class Class {
    public static void main(String[] args) {
        employee john = new employee();
        john.name="John Micheil";
        john.age=23;
        john.salary=23000;
        john.printdetails();
    }
    
}
