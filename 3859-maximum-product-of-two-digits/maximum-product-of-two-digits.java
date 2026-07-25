class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int secondlargest = -1;
        while(n!=0){
            int digit = n % 10;
            if(digit>max){
                secondlargest = max;
                max = digit;
            }
            else if(digit>secondlargest){
                secondlargest = digit;
            }
            n/=10;
        }
        return max*secondlargest;
    }
}