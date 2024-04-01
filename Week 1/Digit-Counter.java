import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int digit =1;
        for (int i=1;i<=100;i++){
            if(n/10>0){
                n=n/10;
                digit+=1;
                if(n<0){
                    break;
                }
            }
           }
             System.out.println("Digits :"+digit);
            input.close();
        }

    }
