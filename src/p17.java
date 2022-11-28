
public class p17 {
	public static void main(String[] args)
	  {

	  Car17 cars[];
	  cars = new Car17[2];
	  //建立父類別陣列
	  
	  cars[0]= new Car17();
	  cars[0].setCar(1234,20.5);
	  //建立父類別物件
	  
	  cars[1]=new RacingCar17();
	  cars[1].setCar(4567,30.5);
	  //建立子類別物件
	  
	  for(int i=0;i<cars.length;i++)
	  {
	    cars[i].show();
	  }
	  //兩者皆能用父類別陣列操作
	}
}

	class Car17 // 父類別
	{
	  protected int num;
	  protected double gas;
	  
	  public Car17()
	  {
	    num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	  }
	  
	  public void setCar(int n,double g)
	  {
	    num = n;
		gas = g;
		System.out.println("將車號設為" + num + ",將汽油設為" + gas);
	  }
	  public void show()
	  {
	    System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	  }
	}

	class RacingCar17 extends Car17 
	{
	  private int course;
	  
	  public RacingCar17()
	  {
	    course = 0;
		System.out.println("生產了賽車");
	  }
	  
	  public void setCourse(int c)
	  {
	    course = c;
		System.out.println("將賽車編號設為"+course);
	  }
	  
	  public void show() //覆寫標誌
	  {
	    System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	  }
	}
