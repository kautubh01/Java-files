import java.util.Scanner;
public class RecursionIteration{
  static int factorial(int n){
    if(n==0||n==1){
      return 1;
    }
    else{
      int product=1;
      for(int i=n;i>=1;i--){
        product*=i;
        
        
      }
      return product;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      system.out.println(factorial(a));
    }
    
  }
}
