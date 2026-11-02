class Solution {
    public int maximumWealth(int[][] accounts) {
        if(accounts.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
             wealth+=accounts[i][j];
            }
            max=Math.max(wealth,max);
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
    }
}