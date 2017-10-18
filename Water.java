package mainClass;

public class Water implements Vehicle {
	int WaterSpd;
	boolean state;
	
	public int speed()
	{
		return WaterSpd;	
	}
	public void SetSpd(int s)
	{
		WaterSpd = s;
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
