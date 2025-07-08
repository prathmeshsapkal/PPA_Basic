import java.util.*;

class Collections
{
    public static void main(String A[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);

        lobj.addFirst(5);

        System.out.println(lobj);

        Iterator iobj = iobj.iterator();
        while(lobj.hasNext())
        {
            System.out.println(lobj.next());
        }
    }
}