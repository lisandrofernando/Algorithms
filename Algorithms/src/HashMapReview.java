import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
    System.out.println(map.get(3));

    Set st = map.entrySet();

    Iterator it = st.iterator();

    while(it.hasNext()){
      Map.Entry mp = (Map.Entry) it.next();
      System.out.println(mp.getKey());
      System.out.println(mp.getValue());
    }
  // Date d = new Date();

  // SimpleDateFormat sd = new SimpleDateFormat("M/d/yyy");
   
  }
}