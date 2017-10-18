package Abstraction;

import java.util.Date;

abstract class Watch
{
	void showDate()
	{
		System.out.println("New Date is "+ new Date());
	}
	
	abstract void showWeather();
}

class Rolex extends Watch
{

	@Override
	void showWeather() {
		System.out.println("Sunny");
		
	}
	
}

class FastTrack extends Watch
{

	@Override
	void showWeather() {
		System.out.println("Foggy");
		
	}
	
}

class Titan extends Watch
{

	@Override
	void showWeather() {
		System.out.println("Rainy");
		
	}
	
}

class Display  // Dsiplay/Driver method avoid multiple method call , just pass object and this Class will call method
{
	void show(Watch w)
	{
		w.showDate();
		w.showWeather();
	}
}

public class AbstractLooseCoupling {
	public static void main(String[] args) {
		Display obj=new Display();
		obj.show(new Titan());  //Loose Coupling , different Object are acceptable
		obj.show(new FastTrack());//Loose Coupling , different Object are acceptable
		obj.show(new Rolex());//Loose Coupling , different Object are acceptable
	}
	//Live example of loose coupling :
	// Different bank Debit Cards are accepted at all ATM 
	// Different sim Card are accepted by Mobile
}
