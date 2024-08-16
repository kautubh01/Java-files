import java.util.Scanner;
public class ArraySum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("the number of rows are:"+n);
    int m = sc.nextInt();
    System.out.println("the number of columns are:"+m);
    int [][]matrix1= new int[n][m];
    int [][]matrix2 = new int[n][m];
    int [][]sum = new int[n][m];
    System.out.println("the array1 elements are:");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        matrix1[i][j] = sc.nextInt();
        
      }
    }
    System.out.println("the array2 elements are :");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        matrix2[i][j]= sc.nextInt();
      }
    }
    
     for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
    int sum[i][j] = matrix1[i][j]+matrix2[i][j];
      }
     }
     for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
    System.out.println(sum[i][j]+"" );
      }
     }
  }
}
