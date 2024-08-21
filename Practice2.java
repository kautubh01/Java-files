class cylinder{
    int radius;
    int height;
    public void setradius(int r){
        radius =r;
    }
    public void setheight(int h){
        height =h;
    }
    public int getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }
    public double surfacearea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }

    
}
public class Practice2 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setradius(23);
        cyl.setheight(34);
        System.out.println("the radius of cylinder:"+cyl.getradius());
        System.out.println("the height of cylinder:"+cyl.getheight());
        System.out.println("the surface area of cylinder:"+ cyl.surfacearea());
    }

    
}
