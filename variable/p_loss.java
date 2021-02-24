import java.util.Scanner;
class Mycls
{
	int p;
	Scanner s= new Scanner(System.in);
	
	public void value()
	{
		System.out.println("Enter coast");
		coast=s.nextInt();
		
		System.out.println("Enter total sell");
		sell=s.nextInt();
	}
	
	public void show_value()
	{
		System.out.println("Coast : " +coast);
		System.out.println("Total sell : " +sell);
		if(coast<sell)
		{
			p=sell-coast;
			System.out.println("Profit : " +p);
		}
		else
		{
			p=coast-sell;
			System.out.println("Loss : " +p);
		}
	}
}
class p_loss
{
	public static void main(String args[])
	{
		Mycls m=new Mycls();
		m.value();
		m.show_value();
	}
}