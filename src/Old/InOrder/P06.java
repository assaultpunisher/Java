package Old.InOrder;
/*
Write an abstract class program in java.
*/

abstract class shape
{
    public abstract void calculatearea();
}
class circle extends shape
{
    private int x,y;
    private int radius;
    public circle()
    {
        x=15;
        y=15;
        radius=10;
    }
    public void calculatearea ()
    {
        double area=3.14*(radius*radius);
        System.out.println("area="+area);
    }
}
class test1
{
    public static void main(String arr[])
    {
        shape s =null;
        s=new circle();
        s.calculatearea();
    }
}
