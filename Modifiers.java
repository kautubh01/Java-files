class employee{
    private int id;
    private String name;
    private int salary;
    private int age;
    public void setName(String n){
         name=n;
    }
        public  String getName(){
            return name;
        }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int s){
              salary=s;
    }
    public int getSalary(){
        return salary;
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
}
public class Class2 {
    public static void main(String[] args) {
        employee kabeer= new employee();
        kabeer.setName("kabeer singh");
        kabeer.setId(2333);
        kabeer.setSalary(200000);
        kabeer.setAge(23);
        System.out.println("The name of new employee:"+kabeer.getName());
        System.out.println("The id of new employee:"+kabeer.getId());
        System.out.println("The salary of new employee:"+kabeer.getSalary());
        System.out.println("The age of new employee:"+kabeer.getAge());

    }

    
}

