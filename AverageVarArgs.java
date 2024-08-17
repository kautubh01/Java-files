public class Average {
    static int AvArgs(int ...arr){
        int count=0;
        int sum=0;
        for(int a:arr){
            count++;

        }
        for(int a:arr){
            sum+=a;

        }
        return sum/count;


    }
    public static void main(String[] args) {
       System.out.println( AvArgs(100,200));
    }
}
