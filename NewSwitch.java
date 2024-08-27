import java.util.Scanner;
class Newswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  name of day");
        String  day = sc.next();
        String result="";

       result= switch(day)
        {
            case "saturday","sunday" -> "6 am";
            case "monday " -> "8 am";
            default -> "7 am";


        };
        System.out.println("result");
    }

    
}
