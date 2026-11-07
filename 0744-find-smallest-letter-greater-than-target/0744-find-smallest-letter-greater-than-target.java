class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int min=Integer.MAX_VALUE;
        // int index=0;
        // for(int i=0;i<letters.length;i++){
        //     if(letters[i]>target){
        //         min=Math.min(min,letters[i]);
        //     }
        // }
        // if(min==Integer.MAX_VALUE){
        //     return letters[0];
        // }
        // return (char)min;

        //optimal
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
             if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(start==letters.length){
            return letters[0];
        }
        return letters[start];
    }
}