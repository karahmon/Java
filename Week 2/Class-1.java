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

// Sum Of Digit who equals to sum of k until n no
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int target_count = input.nextInt();
    int target_sum = input.nextInt();
    int current_no=1,count=0;
    while (count<target_count){
        int current_sum=0;
        for(int num=current_no;num>0;num/=10){
            current_sum+=(num%10);
        }
        if (current_sum==target_sum){
            System.out.println(current_no);
            count++;
        }
        current_no++;
    }

     input.close();  
    }

    }
// Prime No - Approach 1
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int check_no = input.nextInt();
    int count=2,sum=0;
    while(count<check_no){
        if(check_no%count==0){
            sum+=count;
        }
        
        count++;
    }
 if(sum !=0 || check_no==1){
            System.out.println("Not a Prime No");
        }
        else {
          System.out.println("Prime No");
        }

     input.close();  
    }

    }
//Prime No - Approach 3
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      // you code goes here
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      boolean isPrime = true;

      for(int i = 2; i <= N - 1; ++i) {
        if(N%i == 0) {
            isPrime = false;
            break;
        }
      }
      
      System.out.println(isPrime);
    }
}