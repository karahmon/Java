import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuzz");
            }
            else if(i%3==0){
                  System.out.println("Fizz");
            }
              else if(i%5==0){
                  System.out.println("Buzz");
            }
            else{
                 if(sum>3*n){
                    break;
                 }
                 else{
                System.out.println(i);
                 sum = sum + i;}
                 }
            }
        }

    }
