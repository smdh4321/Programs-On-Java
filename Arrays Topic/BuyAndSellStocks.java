public class BuyAndSellStocks {
    public static int profit(int []a)
    {
        int buyprice=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<a.length;i++)
        {
            if(buyprice < a[i])
            {
                int profit=a[i]-buyprice;
                max_profit=Math.max(profit,max_profit);
            }
            else
                buyprice=a[i];
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int [] a={7,1,5,3,6,4};
        System.out.println(profit(a));
    }
}
