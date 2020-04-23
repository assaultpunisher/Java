package Old.InOrder;
/*
Write a program to explain the concept of this keyword in java.
*/

class ThisTest
{
    int id;
    String name;
    private ThisTest(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    private void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args)
    {
        ThisTest s1 = new ThisTest(142,"Shamshad");
        ThisTest s2 = new ThisTest(452,"John");
        s1.display();
        s2.display();
    }
}
