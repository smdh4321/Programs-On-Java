import java.util.*;
public class CountingSort {
    public static void countingSort(int []a)
    {
        int largestEle=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largestEle=Math.max(largestEle,a[i]);
        }
        int[] curr=new int[largestEle+1];
        for(int i=0;i<a.length;i++)
            curr[a[i]]++;
        //counting sort
        int j=0;
        for(int i=0;i<=largestEle;i++)
        {
            while(curr[i] > 0)
            {
                a[j]=i;
                j++;
                curr[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int []a={1,4,1,3,2,4,3,7};
        countingSort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
