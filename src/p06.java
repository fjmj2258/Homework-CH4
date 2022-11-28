public class p06 
{

	public static void main(String[] args) 
	{
		
		RacingCar06 rccar1 = new RacingCar06(1234, 20.5, 5);

	}

}

class Car06
{
	private int num;
	private double gas;
	
	public Car06(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
}

class RacingCar06 extends Car06
{
	private int course;
	
	public RacingCar06(int n, double g, int c)
	{
		super(n, g);
		course = c;
		System.out.println("生產了車號為"+course+"的賽車");
	}
	
}