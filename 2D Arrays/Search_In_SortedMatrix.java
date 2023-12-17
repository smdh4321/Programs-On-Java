public class Search_In_SortedMatrix {
    public static void searchInSortedMatrix(int[][]a,int key)
    {
        int row=0;
        int col=a[0].length-1;
        while(col >=0 && row <= a.length-1)
        {
           if(key == a[row][col]){
               System.out.println("Key found at ("+row+" "+col+")");
               return;
           }
           else if(key < a[row][col])
               col--;
           else
               row++;
        }
    }
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int key=15;
        searchInSortedMatrix(a,key);
    }
}
