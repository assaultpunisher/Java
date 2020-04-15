package InOrder;
/*
Write a program to explain the concept of super keyword in java.
*/

class Bike
{
    int speed=50;
}
class Super extends Bike
{
    int speed=100;
    private void display()
    {
        System.out.println(super.speed);
    }
    public static void main(String[] args)
    {
        Super b=new Super();
        b.display();
    }
}