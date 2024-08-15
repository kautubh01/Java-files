import java.util.Scanner;
public class ArrayClass {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int m = sc. nextInt();
        int n = sc.nextInt();
        System.out.println("The number of rows:"+ m);
        System.out.println("the number of columns"+n);
        int[][] matrix= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix elements are:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("the matrix all elemnts are matrix["+i+"]["+j+"] :" +matrix[i][j]);
            }
        }

    }
    
}
