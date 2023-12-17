public class DiagnolSum {
    public static int diagnolSum(int[][]a) {
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
           sum+=a[i][i];
           if(i != n-i-1)
               sum =sum + a[i][n-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(diagnolSum(a));
    }
}
