//FizzBuzz Problem:-
// Write a short program that prints each number from 1 to 100 on a new line. 

// For each multiple of 3, print "Fizz" instead of the number. 

// For each multiple of 5, print "Buzz" instead of the number. 

// For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     for (int i=1;i<=100;i++){
         if (i%3==0 && i%5==0){
            System.out.println("FizzBuzz"); 
         }
        else if(i%3==0){
             System.out.println("Fizz");
         }
         else if (i%5==0){
             System.out.println("Buzz");
         }
         else{
             System.out.println(i);
         }
     }
    }}
     
    // No of Prime Factors
    class Solution {
        public int commonFactors(int a, int b) {
            int ans = 0;
           for (int i=1; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                ans++;
            }
            
           }
           return ans;
        }
    }

    //GCD Problem:-
    class Solution {
        public static int gcd(int a, int b) {
            int ans=0;
        for (int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)
              ans=i;
        }
        return ans;
        }
    }

    // Power of Two
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
        