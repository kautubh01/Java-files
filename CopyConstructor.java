class Student{
  String name;
  int age;
  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }
  public Student( Student student){
    this.name = Student.name;
    this.age= Student.age;}
  public voiddisplay(){
    System.out.println("Name =" +name+ "Age ="+ age)}
}
public class CopyConstructor{
  public static void main(String[] args){
    Student student1 = new Student(Alice, 12);
    student1.printdetails();
    Student student2 = new Student(student1);
    student2.printdetails();
  }
}
    
