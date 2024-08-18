package CWH;
import java.util.*;

public class Chap_15_Lec_88_89_90_91_92_CollectionFramework_ArrayList_LinkedList {
    public static void main(String[] args) {
        System.out.println("In this lecture i will be learning about Collection Framework and Collection Hierarchy");
        
        // Lectue - 88, 89 is introduction to Collection Framework, so no code 
        // Lecture - 90 is about How to use java docs 

        // Lecture - 91 (Arraylist)

        // ArrayList<Integer> li = new ArrayList<>();
        // ArrayList<Integer> l2 = new ArrayList<>(5);  // we can also set initial capacity

        // li.add(5);   // list.add(integer) is ueed to add element in the array
        // li.add(1);
        // li.add(0, -1);  // list.add(ind, value) is used to add element at a index
        // li.add(0, -9);

        // l2.add(12);
        // l2.add(1);
        // l2.add(1, 42);
        // l2.add(1, 22);

        // // for(int i = 0; i < li.size(); i++)  // list.size() is used to find the size
        // // {
        // //   System.out.println(li.get(i)); // list.get(index) is used to get the val. at ind.
        // // }

        // // for(int i = 0; i < l2.size(); i++)
        // // {
        // //   System.out.println(l2.get(i));
        // // }

        // li.addAll(l2); // list(list2) ued to add list2 in list1
        // // li.addAll(0, l2);  // list.addAll(ind,list2) used to add list2 start at ind.
        // System.out.println("--------------------");

        // // li.clear();  // list.clear() is used to clear the arrayList
        // // li.remove(4);
        // li.set(2, 100);

        // for(int e : li)
        // {
        //   System.out.println(e);
        // }

        // // System.out.println(li.contains(22)); // list.contains(value) used to search
        // System.out.println("First index of 1 = " + li.indexOf(1));
        // System.out.println("Last index of 1 = " + li.lastIndexOf(1));

        // Lecture - 92 (linkedList)

        LinkedList<Integer> li = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();  

        li.add(5);  
        li.add(1);
        li.add(0, -1);  
        li.addFirst(900);  // list.addFirst() is not in arrayList<>
        li.add(0, -9);
        li.addLast(420);   // list.addLast() is not in arrayList<>

        l2.add(12);
        l2.add(1);
        l2.add(1, 42);
        l2.add(1, 22);

        // for(int i = 0; i < li.size(); i++)  
        // {
        //   System.out.println(li.get(i)); 
        // }

        // for(int i = 0; i < l2.size(); i++)
        // {
        //   System.out.println(l2.get(i));
        // }

        li.addAll(l2); 
        // li.addAll(0, l2);
        System.out.println("--------------------");

        // li.clear(); 
        // li.remove(4);
        li.set(2, 100);

        for(int e : li)
        {
          System.out.print(e + "\t");
        }

        // System.out.println(li.contains(22));
        System.out.println("\nFirst index of 1 = " + li.indexOf(1));
        System.out.println("Last index of 1 = " + li.lastIndexOf(1));


    }
    
  }