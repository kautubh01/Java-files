class rectangle{
   private int height;
   private int breadth;
    public rectangle(){
        height =3;
        breadth =4;
    }
    public rectangle(int myheight,int mybreadth){
        height = myheight;
        breadth= mybreadth;
    }
    public int getheight()
{return height;}
public int getbreadth(){
    return breadth;
}
}
public class Practice2{
    public static void main(String[] args) {
        rectangle r= new rectangle(34,56);
        System.out.println(r.getheight());
        System.out.println(r.getbreadth());
    }
}

