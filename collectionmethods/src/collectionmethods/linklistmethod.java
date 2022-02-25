//void add(int index, Object element)
//list.addAll(Collection c)
//list.addAll(int index, Collection c)
//addFirst(obj)
//addLast(obj)
//void clear
//remove(int index)
//list.sort(null)

package collectionmethods;
import java.util.*;
public class linklistmethod
{

  public static void main(String[] args) {

  LinkedList llist = new LinkedList();

  llist.add("Hi");

  llist.add("I");

  llist.add("Love");

  llist.add("java");

  System.out.println("LinkedList:" + llist);

//Using Add method at specific index

  llist.add(1,"Element");
  Collection collection = new ArrayList();
  collection.add("I");

  collection.add("Love");

  collection.add("Android");

  llist.addAll(collection);
  System.out.println("Element to be removed:" + llist.remove(3));
  llist.sort(null);


  System.out.println("Linked List:" + llist);
  

 }

}
