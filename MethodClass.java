public class MethodClass{
  
    static void foo(){
      System.out.println("monday is first day of the week.");
    
  }
    static int foo(int x, int y){
      return x+y;
    }
    static int foo(int a,int b,int c){
      return (a+b)*c;
    }
    
}
public static void main(String[] args){
  foo();
  foo(3,8);
  foo(7,90,99);
}

  
