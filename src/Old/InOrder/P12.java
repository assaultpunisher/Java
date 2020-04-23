package Old.InOrder;
/*
Write a program for comparing two string in java.
*/

class Inp
{
    public static void main(String arr[])
    {
        int i=4,j=5;
        System.out.println("hello :"+i);
        System.out.println(i+j);
        String S1=new String ("india");
        String S2="india";
        if(S1==S2)
            System.out.print("comparing String using++operator");
        if(S1.equals(S2))
            System.out.print("comparing String using equal method");
    }
}