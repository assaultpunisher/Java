package InOrder;
/*
Write a program and analyse its output in java.
*/

class A
{
    static
    {
        System.out.println("Initilizing a..");
    }
    public A()
    {
        System.out.println("Constructor is called");
    }

    public A(int i) {
    }

    public void display() {
    }
}
class B
{
    static int b;
    static
    {
        b=2;
        System.out.println("I am in class B");
    }
}
class C
{
    static
    {
        System.out.println("I am in class C");
    }
    public static void display()
    {
        System.out.println("Displayed method is called");
    }
}
class D
{
    static
    {
        System.out.println("I am in class D");
    }
    public static void main(String[] arr)
    {
        System.out.println("main method");
        A z=new A();
        System.out.println("Class b is called"+B.b);
        C.display();
        System.out.println("hello!!");
        A q=new A();
    }
}
