
public class p41 {

	  public static void main(String[] args)
	  {
	    Car41 car1 = new Car41(1234,20.5);
		car1.vShow();
		car1.mShow();
	  }
	}

	interface iVehicle41
	{
	  public void vShow();
	}

	interface iMaterial41
	{
	  public void mShow();
	}

	class Car41 implements iVehicle41,iMaterial41
	{
	  private int num;
	  private double gas;
	  
	  public Car41(int n,double g)
	  {
	    num = n;
		gas = g;
		System.out.println("生產了車號為" + num + ",汽油量為" + gas + "的車子");
	  }
	  
	  public void vShow()
	  {
	    System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	  }
	  
	  public void mShow()
	  {
	    System.out.println("車子的材質是鐵");
	  }
	  
	}