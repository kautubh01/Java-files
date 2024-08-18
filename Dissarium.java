 class Disspractice {
    public static void main(String[] args) {
        int orgnumber =87;
        int sum =0;
        int n = orgnumber;
        int count = 0;
        while (n!=0) {
            n/=10;
            count ++;
            
        }
         n = orgnumber;


        while (n!=0) {
            int d = n % 10;
            sum += Math.pow(d, count);
            count--;
            n /= 10;
            
        }
        if (sum ==orgnumber) {
            System.out.println("number is dissarium");
            
        }
        else{
            System.out.println("number is not dissarium");
        }

        
    }
    
}
