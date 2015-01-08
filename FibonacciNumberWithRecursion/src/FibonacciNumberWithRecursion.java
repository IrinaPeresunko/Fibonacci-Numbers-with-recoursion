public class FibonacciNumberWithRecursion {
	public static long fibonacci(int number)
	{
		if(number==1) return 0;
		if(number==2) return 1;
		return fibonacci(number-2)+fibonacci(number-1);
	}
	public static void main(String[] args) {
	long start=System.nanoTime();
	long result=fibonacci(45);
	long end=System.nanoTime();
	System.out.println("result="+result);
	System.out.println("time:"+((end-start)/1000000000.0));
	}
}