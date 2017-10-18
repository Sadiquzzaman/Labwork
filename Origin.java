package mainClass;

public class Origin {

	public static void main(String[] args) {
		Car ferrari = new Car();
		ferrari.SetSpd(250);
		ferrari.setstate(true);
		
		Bus Soudia = new Bus();
		Soudia.SetSpd(80);
		Soudia.setstate(true);
		
		Ship Titanic = new Ship();
		Titanic.SetSpd(110);
		Titanic.setstate(true);
		
		
		System.out.println("Ferrari is running at "+ ferrari.speed());
		doSomething(ferrari);
		System.out.println("After increasing: " + ferrari.speed());
		
		System.out.println("Soudia is running at " + Soudia.speed());
		doSomething(Soudia);
		System.out.println("After decreasing: " + Soudia.speed());
		
		System.out.println("Titanic is going at : " + Titanic.speed());
		doSomething(Titanic);
		System.out.println("After change: " + Titanic.isRunning());
		
	}
	
	private static void doSomething(Vehicle V)
	{
		if(V instanceof Car)
		{
			((Car) V).incspd(100); 
		}
		else if(V instanceof Bus)
		{
			((Bus) V).decspd(20);
		}
		else if(V instanceof Ship)
		{
			((Ship) V).ChangeState();
		}
		
	}

}
