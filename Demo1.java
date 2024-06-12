import java.util.*;
import java .util.LinkedList;
class Demo1
   {
       public static void main(String[] args)
       {
   
           LinkedList<Integer> ll = new LinkedList<Integer>();
           ll.add(1);
           ll.add(2);
           ll.add(3);
           ll.add(4);
           ll.add(5);
           System.out.println("The elements of the linked list before reversing: " + ll);
           Collections.reverse(ll);
           System.out.println("The elements of the linked list after reversing: " + ll);
 }
}
