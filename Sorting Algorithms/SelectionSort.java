public class SelectionSort {
    public static void selectionSort(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[minPos] > a[j])
                {
                   minPos=j;
                }
            }
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []a={5,4,1,2,3};
        selectionSort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
