package Inheritance;
//Base Class
class Bicycle
{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;    //this to initialize instance variable
		this.speed=speed;
	}
	
	public void applyBreak(int decrement)
	{
		speed -=decrement;
	}
	
	public void speedUp(int increment)
	{
		speed +=increment;
	}
	
	public String toString()
	{
	    return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
	}
}

class MountainBike extends Bicycle
{
int seatHeight;
	MountainBike(int gear,int speed,int startheight)
	{
		super(gear,speed);      // calling Parent Constructor /method using Super
		
		//v.important we cannot inherit Super Class Constructor but we can invoke them using Super
		seatHeight=startheight;
	}
	
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	
	public String toString()
	{
		return (super.toString()+"\nseat height is "+seatHeight); // Alternative of Sysout
	}
	
}

public class MountainBikeUsingSuper {
	
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(3,100,25);  // Constructor Calling
		System.out.println(mb.toString()); // toString Override
	}

}
