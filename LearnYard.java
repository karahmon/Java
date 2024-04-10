// https://www.codechef.com/problems/WATERCONS
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
	
    		int x = sc.nextInt();
    	
    		    if(x>=2000){
    		        System.out.println("YES");
    		    }
    		    else
    		    {
    		        System.out.println("NO");
    		    }
    		}
		}
		
	
}
//https://codeforces.com/contest/1915/problem/A 

import java.util.Scanner;
public final class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        if(a==b && b!=c){
            System.out.println(c);
        }
        else if (a!=b && b==c){
            System.out.println(a);
        }
        else{
             System.out.println(b);
        }
      
        }
 
      
    }
}
//https://www.codechef.com/problems/FAVOURITENUM
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            
            if(a%2==0 && a%7==0){
                System.out.println("Alice");
            }
            else if(a%2!=0 && a%9==0){
                System.out.println("Bob");
             
            }
            else{
                 System.out.println("Charlie");
            }
        }
    }
}
//https://leetcode.com/problems/sum-multiples/description/
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
      for(int i=1;i<=n;i++){
        if(i%3==0 || i%5==0 || i%7==0){
            sum+=i;
        }
      }
      
      return sum;
    }
}

//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
class Solution {
    static String armstrongNumber(int n){
        int sum =0;
        for (int i=n;i>0;i/=10){
            int digit=0;
            digit=+i%10;
          sum+=(digit*digit*digit);
            
        }
        if(sum==n){
            return "Yes";
        }
        else {
             return "No";
        }
    }
}

//
import java.util.*;
import java.lang.*;
import java.io.*;

// GCD vs LCM Codeforces
// For a=n-3,b=1,c=1 and d=1, we can see that a+b+c+d=n and gcd(a,b)=lcm(c,d)=1

public class LearnYard {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            System.out.print(n-3+" "+1+" "+1+" "+1);
            System.out.println();
        }
    }
}
//

