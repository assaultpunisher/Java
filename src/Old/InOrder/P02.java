package Old.InOrder;
/*
Write a program for object and class in java.
*/

class Rectangle
{
    private int l,b;
    public void setDimension(int x,int y)
    {
        l=x;
        b=y;
    }
    public int area()
    {
        return l*b;
    }
    public void display()
    {
        System.out.println("Length="+l);
        System.out.println("Breadth="+b);
    }
    public static void main(String ac[])
    {
        Rectangle r=new Rectangle();
        r.setDimension(5,10);
        r.display();
        System.out.println("Area="+r.area());
    }
}
