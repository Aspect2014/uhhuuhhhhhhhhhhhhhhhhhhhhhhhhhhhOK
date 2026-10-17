interface Shape{
    double getArea();

}
class rectangle implements Shape{
    private double w;
    private double h;
    public rectangle(double w,double h){
        this.w=w;
        this.h=h;
    }
    public double getArea(){
        return w*h;
    }
}
class circle implements Shape{
    private double r;
    public circle(double r){
        this.r=r;
    }
   public double getArea(){
    return 3.14*r*r;
   }
}
class area{
    public double sum(Shape[] s){
        double total=0;
        for(Shape s1:s){
            total+=s1.getArea();

        }
        return total;
    }
}
class Main{
    public static void main(String[] args) {
        Shape[] s=new Shape[2];
        s[0]=new rectangle(67, 76);
        s[1]=new circle(88);
        area c=new area();
        double total=c.sum(s);
        System.out.println("Total area="+total);
    }
}