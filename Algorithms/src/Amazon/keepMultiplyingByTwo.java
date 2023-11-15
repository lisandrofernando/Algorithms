package Amazon;

import java.util.HashSet;
import java.util.Set;

public class keepMultiplyingByTwo {
    

    

    public int findFinalValue(int nums[], int original){
        Set<Integer> set = new HashSet<Integer>();

        for(int el: nums){
            set.add(el);
        }

        while(set.contains(original)){
            original = 2*original;
        }
        return original;
    }
}
