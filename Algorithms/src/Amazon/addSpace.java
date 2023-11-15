package Amazon;

public class addSpace {



    public static void main(String[] args){
       //System.out.println(addSPaces("LeetCode:",[3]));
    }

    public static String addSPaces(String s, int spaces[]){
        char csTr[] = new char[s.length() + spaces.length];

        int i = 0; //Iterator for spaces
        int j = 0; //Iterator for s
        int k = 0; //Iterator for building answer

        while(i<spaces.length && j<s.length()){
            int insertIndex = spaces[i];
            // copy all the characters till you do not reach space insertion index
            while(j<insertIndex && j<s.length()){
                csTr[k] = s.charAt(j);
                k++;
                j++;
            }
            //insert space
            csTr[k]= ' ';
            k++;
            i++;
        }

        while(j<s.length()){
            csTr[k] =  s.charAt(j);
            k++;
            j++;
        }
        return new String(csTr);
    }
    
}
