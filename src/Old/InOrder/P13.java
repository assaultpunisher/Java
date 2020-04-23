package Old.InOrder;
/*
Write a program for a Constructor in java.
*/

class E
{
    int a;
    public E(int x)
    {
        a=x;
    }
    public E()
    {
        System.out.println("it is default constructor");
    }
    {
        System.out.println("it is funny");
    }
    public void display()
    {
        System.out.println("a="+a);
    }
    public static void main(String arg[])
    {
        E x=new E();
        x.display();
        E y=new E(10);
        y.display();
    }
}