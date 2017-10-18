package mainClass;

public class Land implements Vehicle {

	int LandSpd;
	boolean state;
	
	public int speed()
	{
		return LandSpd;	
	}
	public void SetSpd(int s)
	{
		LandSpd = s;
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
