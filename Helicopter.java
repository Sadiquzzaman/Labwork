package mainClass;

public class Helicopter extends Air {

	public void incspd(int spd)
	{
		AirSpd = AirSpd + spd;
	}
	public void ChangeState()
	{
		if(state==true)
		state = false;
		else state  = true;
	}
}
