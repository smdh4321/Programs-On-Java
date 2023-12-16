import java.sql.SQLOutput;
import java.util.*;
public class KadensProblem {
    public static int kadens(int[] a)
    {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int curr_value=0;
        for(int i=0;i<a.length;i++)
        {
            curr_sum+=a[i];
            if(curr_sum < 0)
                curr_sum=0;
            max_sum=Math.max(curr_sum,max_sum);
        }
        for(int i=0;i<a.length;i++)
        {
            curr_value+=a[i];
            if(curr_value > 0)
                curr_value=0;
            min_sum=Math.min(curr_value,min_sum);
        }
        return max_sum+min_sum;
    }
    public static void main(String[] args) {
        int []a={1,-2,6,-1,3};
        System.out.println(kadens(a));
    }
}
