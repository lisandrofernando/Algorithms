import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapReview {
    
   public static void main(String[] args) {
    


    HashMap<Integer, String> map = new HashMap <Integer, String>();
    map.put(0, "Sam");
    map.put(1, "John");
    map.put(2, "Samuel");
    map.put(3, "Joy");
    map.put(4, "Dzmitry");

    System.out.println(map.get(2));
   // map.remove(3);
   //Default capacity of Hashmap is 16. To explicit provide default capacity add arguments in the method.
   // Load capacity 0.75%
   //Threashold how many times it needs to increase.->Capacity * Load Factor
   //Hasvalue, Hashfunction, Bucketsize
   //Hascode applies to every string, nothing but the index where it will be applied.
   //When more than key value pair trying to access the same index is called collision
    System.out.println(map.get(3));

    Set st = map.entrySet(); //Make all key value pairs as a set.

    Iterator it = st.iterator();

    while(it.hasNext()){
      Map.Entry mp = (Map.Entry) it.next();
      System.out.println(mp.getKey());
      System.out.println(mp.getValue());
    }
  // Date d = new Date();

  // SimpleDateFormat sd = new SimpleDateFormat("M/d/yyy");
   
  /* Collections review starts here */

    ArrayList<String> l = new ArrayList<String>();
    l.add("Lisandro");
    l.add("Emma");
    l.add("Leo");
    l.add(0,"Gaby");
    System.out.println(l);
    System.out.println(l.get(2));
    System.out.println(l.contains("lisandro"));
    l.indexOf("Leo");
    l.isEmpty();
     System.out.println(l.size());

     /* Set Interface */

     HashSet<String>set = new HashSet<String>();
     set.add("Mexico");
     set.add("UK");
     set.add("USA");
     set.add("India");
     set.add("India");
     System.out.println(set);

     Iterator<String>s = set.iterator();
     while(s.hasNext()){
        System.out.println(s.next());
     }
      
      

  }
  

}