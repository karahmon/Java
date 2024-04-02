import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
            while(n%2==0){
                n/=2;
            }
            if(n==1){
             System.out.println(" It is a Power of 2");
            }
            else{
                 System.out.println(" It is not a Power of 2");
            }

            input.close();
  
       
}
}