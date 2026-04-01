class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];

            }
            else if((prices[i]-minprice)>maxpro){
                maxpro=(prices[i]-minprice);
            }
        }
        return maxpro;
       
}
}