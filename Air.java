package mainClass;

public class Air implements Vehicle {

	int AirSpd;
	boolean state;
	
	public int speed()
	{
		return AirSpd;	
	}
	public void SetSpd(int s)
	{
		AirSpd = s;
	}
	public boolean isRunning()
	{
		return state;
	}
	public void setstate(boolean st)
	{
		state = st;
	}
}
