package mainClass;

public class Aeroplane extends Air {

	public void ChangeState()
	{
		if(state==true)
		    state = false;
		else 
			state  = true;
	}
	public void incspd(int spd)
	{
		AirSpd = AirSpd + spd;
	}
}
