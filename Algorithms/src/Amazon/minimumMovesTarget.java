package Amazon;

public class minimumMovesTarget {
    
    public int minimalMovesToReachValue(int target, int maxDoubles){
        int count = 0;
        while(target!=1){
            if(target % 2 ==0){
                count ++;
                target = target - 1;
            } else {
                //target is even number
                if(maxDoubles>0){
                    target = target / 2;
                    maxDoubles--;
                    count ++;
                } else {
                    count ++;
                    target = 1;
                }
            }
        }
        return count;
    }
}
