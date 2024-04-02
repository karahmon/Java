import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int digit =0;
    
        for(int i=1;i<=n;i++){
            int sum=0;
        for (int num=i;num>0;num/=10){
            // digit++;
            sum=sum+num%10;
           
    }
        System.out.println("Sum :"+sum);    
        }

            input.close();
        
     System.out.println("Digits :"+digit);
       
}
}