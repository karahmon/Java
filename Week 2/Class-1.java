// Sum Of Digit who equals to sum of k 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int lastdigit=0;
        for (int i=1;i<=n;i++){
            int sum=0;
        for (int j=i;j>0;j=j/10){
            lastdigit=j%10;
            sum+=lastdigit;
            }
         if(sum==k){
            System.out.println(i); }

        }
            input.close();
        
    }
}