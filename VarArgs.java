public class VarArgs {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println("the sum of numbers are:"+sum(23,45,67,89,90,99,74,34,32,21,34));
        System.out.println("the sum of nothing is :"+sum());
    }
}
