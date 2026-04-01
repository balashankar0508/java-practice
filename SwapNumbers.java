public class SwapNumbers{
	public static void main(String[] args){
		int a = 10;
		int b = 20;


		System.out.println("a is " + a + ", b is " + b + " Before Swapping");

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a is " + a + ", b is " + b + " After Swapping");
	}
}