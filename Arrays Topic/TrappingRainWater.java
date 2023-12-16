public class TrappingRainWater {
    public static int trapRainWater(int []a)
    {
        int n=a.length;
        int[] left =new int[n];
        int[] right =new int[n];
        left[0]=a[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(left[i],right[i]);
            trappedWater+=waterlevel-a[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int [] a={4,2,0,6,3,2,5};
        System.out.println(trapRainWater(a));
    }
}