public class VarArgs2 {
    static int sum(int x, int ...arr){
        int result =x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(90, 23,34,45,56,67));
      //System.out.println(sum());  is invalid because we have to give one argument to it for x.
    }
}
