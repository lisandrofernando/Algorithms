import java.util.Arrays;

public class Anagram {
    
    public static void main(String[] args) {
        
        String str1 = "heart";
        String str2 = "earth";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
