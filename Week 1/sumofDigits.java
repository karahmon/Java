import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int digit =0;
        int sum=0;
        for (int i=n;i>0;i=i/10){
            digit++;
            sum=sum+i/10;
           
        }
            input.close();
        
     System.out.println("Digits :"+digit);
       System.out.println("Sum :"+sum);
    }
}