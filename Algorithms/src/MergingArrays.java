import java.util.Arrays;

public class MergingArrays {
    
public static void main(String[] args) {
    
    int [] a = {45, 99, 89};

    int [] b = {189, 4, 7, 59};

    int ci = 0;

    int [] c = new int[a.length + b.length];

    for(int i =0; i<a.length; i++){
        c[ci] = a[i];
        ci++;
    }

    for(int i =0; i<b.length; i++){
        c[ci] = b[i];
        ci++;
    }

    System.out.println(Arrays.toString(c));

}


    
}
