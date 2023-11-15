package Amazon;

import java.util.ArrayList;
import java.util.List;

public class allDivisionsWithHighestScore {
    
    public List<Integer> maxScoreIndices(int nums[]){
        
        int noOfOnes = 0;
        for(int el: nums){
            noOfOnes++;
        }

        List<Integer> ans =  new ArrayList<>();
         ans.add(0);
         int rightScore = noOfOnes;
         int leftScore = 0;
         int maxScore = rightScore + leftScore;
         for(int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                leftScore++;
            }else if(nums[i] == 1){
                rightScore--;
            }

            int currentScore = rightScore + leftScore;
            if(currentScore > maxScore){
                ans =  new ArrayList<>();
                maxScore = currentScore;
                ans.add(i+1);
            } else if (currentScore == maxScore){
                ans.add(i+1);
            }
         }
         return ans;
    }

    
}
