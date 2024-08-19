class employee{
    private int id=0;
    private String name="john cena";
    private int age = 23;
    private int salary=200000;
    private String department;

    public employee(int myid,String myname,int myage,int mysalary,String mydepart){
        id = myid;
        name=myname;
        age= myage;
        salary= mysalary;
        department= mydepart;



    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    }


public class Constructor {
    public static void main(String[] args){
        employee john = new employee(23,"johnny",45,230000,"designing");
        
        System.out.println(john.getId());
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getSalary());
        System.out.println(john.getDepartment());
    }
    
}
