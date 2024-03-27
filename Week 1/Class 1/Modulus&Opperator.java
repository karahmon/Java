class Main {
    public static void main(String[] args) {
		//operatora
		int a=5,b=10,c=7;
		int d=a*b+c;
		System.out.println(d);

		//division
		//divide int by int
		int div=19/10;// will give only int no decimal so wrong ans
		System.out.println(div);
		//divide double by double
		System.out.println(19.0/10.0); //correct ans given
		//divide int by double
		System.out.println(19/10.0);//correct ans given
		//divide double by int
		System.out.println(19.0/10);//correct ans is given

		//Modulo(%)- Gives remainder of operator
		//Positive Modulo
		System.out.println(19%10);//correct ans is given
		System.out.println(-19%10);//modulo cant be negative but in case of negative it gives negative no
		System.out.println(-19%-10);//modulo cant be negative but in case of negative it gives negative no
		System.out.println(19%-10);//correct ans is given as remainder cant be negative
    
		//Assignment Operator Example
		//Addition Example
		int x=10;
		x+=10;// equivalent to writing x=x+10; x= 10+10=20
		System.out.println(x);

		//Subtraction Example
		int y=10;
		y-=10;// equivalent to writing x=x-10; x= 10-10=0
		System.out.println(y);

		//Relational Operators (==,!=,>,<,>=,<=,)
		int m=10,n=10,q=17

	}
}