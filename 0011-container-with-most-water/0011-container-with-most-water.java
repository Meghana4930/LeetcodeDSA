class Solution {
    public int maxArea(int[] height) {
        
        //---------BRUTE FORCE-------------
        /*int n=height.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int heights=Math.min(height[i],height[j]);
                int area=heights*(j-i);
                max=Math.max(area,max);
            }
        }
        return max;*/
        //----------OPTIMAL-----------------------
        



        int maxArea=0;
        int l=0;
        int n=height.length;
        int r=n-1;
        while(l<r){
            int capacity=Math.min(height[l],height[r]);
            int width=r-l;
            int area=capacity*width;
            maxArea=Math.max(maxArea,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;

        //------------BRUTE FORCE -----------
       /*int maxArea=0;
       int n=height.length;
       int maxEle=0;
       int index=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        if(height[i]>maxEle&&i<index){
            index=i;
            maxEle=height[i];
        }
       }
       for(int i=index+1;i<n;i++){
        int capacity=Math.min(maxEle,height[i]);
        int width=i-index;
        int area=capacity*width;
        maxArea=Math.max(area,maxArea);
       }
       return maxArea;*/
    }
}