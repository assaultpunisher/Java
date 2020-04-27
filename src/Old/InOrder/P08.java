/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.InOrder;

/*
Write an Interface program in java.
*/

interface Speaker
{
    public void speak();
}
class Lecturer implements Speaker
{
    public void speak()
    {
        System.out.println("Lecturer view");
    }
}
class Politician implements Speaker
{
    public void speak()
    {
        System.out.println("Politician view");
    }
}
class Test
{
    public static void main(String[] arr)
    {
        Speaker sp=null;
        System.out.println("sp point to politician");
        sp=new Politician();
        sp.speak();
        System.out.println("sp point to Lecturer");
        sp=new Lecturer();
        sp.speak();
    }
}
