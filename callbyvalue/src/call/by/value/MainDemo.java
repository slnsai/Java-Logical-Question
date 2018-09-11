package call.by.value;

public class MainDemo 
{
	
	public void sum(int r2)
	{
		r2=30;
		System.out.println(r2);
	}
	public static void modify(Rectangle r3)
	{
		r3.length=777;
		System.out.println(r3);
	}

	
	public static void main(String[] args)
	{
		
		int r1=10;
		
		MainDemo demo=new MainDemo();
		demo.sum(r1);		
		System.out.println(r1);
		
		Rectangle rectangle=new Rectangle();
		rectangle.length=20;
		modify(rectangle);
		
		
		System.out.println(rectangle);
	}
	
	
}
