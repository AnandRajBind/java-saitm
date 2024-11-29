import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); /*
                                                    * it is a Generic syntax. Generic ka matlab hai ki yadi ham kisi
                                                    * class ko pass karna chahate hai ake prameter.
                                                    */

        ArrayList<Integer> l2 = new ArrayList<>(5);// constructor an empty list with the specified initial capacity.
        /*
         * Arrylist is a class in java.util package.(in simple words we can say that
         * modified array(resize , delete element, add element etc) is called
         * ArrayList).
         */

        // arrayListMethod.
        l1.add(10);// add() method is used to add the element in the ArrayList.
        l1.add(20);
        l1.add(30);
        l1.add(0, 40); // add the element at the specified index.
        l1.add(1, 50);
        l1.add(0, 60);// output: 60 40 50 10 20 30

        l2.add(100);
        l2.add(200);
        l2.add(50);
        l1.addAll(0, l2);/*
                          * addAll() method is used to add all the elements of the specified collection
                          * to the ArrayList.bydefault it is add the element at the end of the list.
                          */
        // l1.clear(); /* clear() method is used to remove all the elements from the
        // ArrayList.*/

        l1.remove(0);/*
                      * remove() method is used to remove the element at the specified index from the
                      * ArrayList.
                      */

        System.out.println(l1.contains(l2));
        /*
         * contains() method is used to check whether the specified element is present
         * in
         * the ArrayList or not.
         */
        // indexOf() method is used to return the index of the first occurrence of the
        // specified element in the ArrayList. print -1 if this list does not contain
        // the element.iska mtlb hai ki particular element ka index kya hai.
        System.out.println(l1.indexOf(50));
        System.out.println(l1.lastIndexOf(50));// lastIndexOf() method is used to return the index of the last occurrence of the specified element in the ArrayList.
                                                
l1.set(0, 566);
        // size() method is used to returns the number of elements in the
        // ArrayList.size() method is same as the length() method.
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));   //   get() method is used to Retrieves/access the element at the
                                           //   specified/particular index.
            System.out.print(",  ");
        }
        System.out.print(l1.clone());
        // clone() method is used to return a shallow copy of an ArrayList.
    }
}
