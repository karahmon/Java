class Solution{
    static int sumOfDigits(int N) {
        int sum=0;
        for (;N>0;N/=10){
            sum=sum+N%10;
        }
        return sum;
    }
}
       