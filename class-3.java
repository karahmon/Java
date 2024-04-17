// print n no of star in column and row equal to n
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    for (int column = n ;column>0;column--){
        for (int row = n ; row>0;row--){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}

// Rhombus Pattern
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
   for (int row = n ; row>0;row--){
    int z = n - row;
    while (z>0){ 
        System.out.print(" ");
        z--;
    }
    for (int column = n ;column>0;column--){
          System.out.print("*");
        }
        System.out.println("");
    }
   }   
}

// Diamond Pattern
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    for (int rows=1 ;rows<=n;rows++){
        for (int space = 1; space <= n - rows;space++) {
           System.out.print(" ");}
        for(int columns = 1;columns<=2*rows-1;columns++){
            System.out.print("*");
        }
        System.out.println("");
    }
     for (int rows=n-1 ;rows>=1;rows--){
        for (int space = n- rows; space>=1;space--) {
           System.out.print(" ");}
        for(int columns = 2*rows-1;columns>=1;columns--){
            System.out.print("*");
        }
        System.out.println("");
    }

   }
}

