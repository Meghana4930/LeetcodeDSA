class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                min=Math.min(min,letters[i]);
            }
        }
        if(min==Integer.MAX_VALUE){
            return letters[0];
        }
        return (char)min;
    }
}