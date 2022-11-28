
public class p04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RacingCar rccar1;
		rccar1 = new RacingCar(); 
		   
		rccar1.setCar(1234,20.5);
		      
		rccar1.setCourse(5);
		
	}

}

class Car // 父類別
{
  private int num;
  private double gas;
  //宣告私有欄位,子類別無法繼承
  
  public Car()
  {
    num = 0;
	gas = 0.0;
	System.out.println("生產了車子");
  }
  //若無特別設定,子類別在建立前會先呼叫父類別無參數的建構是來幫助父類別初始化,看輸出結果可以發現父類別建構子是最先執行的
  
  public void setCar(int n,double g)
  {
    num = n;
	gas = g;
	System.out.println("將車號設為" + num + ",將汽油設為" + gas);
  }
  public void show()
  {
    System.out.println("車號是" + num);
	System.out.println("汽油量是" + gas);
  }
  //被子類別繼承的方法 
}

class RacingCar extends Car //子類別,賽車繼承成了汽車
{
  private int course;
  //子類別新增的欄位
  
  public RacingCar()
  {
    course = 0;
	System.out.println("生產了賽車");
  }
  //子類別的建構式
  
  public void setCourse(int c)
  {
    course = c;
	System.out.println("將賽車編號設為" + course);
  }
  //子類別新增的方法
}
