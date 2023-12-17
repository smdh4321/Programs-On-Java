public class SpiralMatrix {
    public static void spiralMatrix(int[][] a)
    {
        int sr=0;
        int sc=0;
        int er=a.length-1;
        int ec=a[0].length-1;
        while(sr <= er && sc <= ec)
        {
            for(int i=sc;i<=ec;i++) {
                System.out.print(a[sr][i] + " ");
            }
            sr++;
            for(int i=sr;i<=er;i++) {
                System.out.print(a[i][ec] + " ");
            }
            ec--;
            for(int i=ec;i>=sc;i--) {
                if(sr > er)
                    break;
                System.out.print(a[er][i] + " ");
            }
            er--;
            for(int i=er;i>=sr;i--) {
                if(sc > ec)
                    break;
                System.out.print(a[i][sc] + " ");
            }
            sc++;
        }
    }
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}} ;
        spiralMatrix(a);
    }
}
