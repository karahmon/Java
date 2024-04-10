// Print prime nos till n
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int j=2; j <= N; j++) {
            boolean isPrime = true;
            for (int i = 2; i <= j-1; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
        }
    }
}
//Power of Two
class Solution {
    public boolean isPowerOfTwo(int n) {

           for(int i=0;;i++){
            if(n==0){return false;}
          while(n%2==0){
                n/=2;
            }
            if(n==1){
             return true;
            }
           else   {      
           return false;
        }
}

    }
    }