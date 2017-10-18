package variadicImplement;

public class Variadic {
	
	public static void main(String[] args)
	{
		System.out.println("The sum is "+ fun(1,2));
		System.out.println("The sum is " + fun(1,2,3,4));
	}
	
	private static int fun(int... n)
	{
		int sum = 0;
		
		for(int value : n)
			sum += value;
		
		return sum;
	}

}
