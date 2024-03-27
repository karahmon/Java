class Main {
    public static void main(String[] args) {

		// Implicit - automatically converts
		long var1=15;
		int var2=30;
		 var1=var2; // int2 is converted to long
		 System.out.println(var1);


		// Explicit - coder converts
		int var3=15;
		long var4=30;
		 var3=(int)var4; // explicitly long is converted to int
		 System.out.println(var3);
    }
}