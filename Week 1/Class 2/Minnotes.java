import java.util.Scanner;
class main{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int amount = input.nextInt();
    int totalamountleft=0;
    int cn500=0,cn100,cn50,cn20,cn10,cn5,cn2,cn1;

if (amount>=500){
    cn500=amount/500;
    totalamountleft=(amount-(cn500*500));
}
if (true){
    cn100=totalamountleft/100;
    totalamountleft=(totalamountleft-cn100*100);
}
if (true){
    cn50=totalamountleft/50;
    totalamountleft=(totalamountleft-(cn50*50));
}
if (true){
    cn20=totalamountleft/20;
    totalamountleft=(totalamountleft-(cn20*20));
}
if (true){
    cn10=totalamountleft/10;
    totalamountleft=(totalamountleft-(cn10*10));
}
if (true){
    cn5=totalamountleft/5;
    totalamountleft=(totalamountleft-(cn5*5));
}
if (true){
    cn2=totalamountleft/2;
    totalamountleft=(totalamountleft-(cn2*2));
}
if (true){
    cn1=totalamountleft/1;
}
System.out.println("Total number of Notes");
		System.out.println("500 = "+ cn500);
		System.out.println("100 = "+cn100);
		System.out.println("50 = "+ cn50);
		System.out.println("20 = "+ cn20);
		System.out.println("10 = "+ cn10);
		System.out.println("5 = "+ cn5);
		System.out.println("2 = "+ cn2);
		System.out.println("1 = "+ cn1);
}
}