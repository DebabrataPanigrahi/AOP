class My_class1
{
	int coast;
	int earn;
	public void get_value(int a,int b)
	{
		coast=a;
		earn=b;
	}
}
class My_class2
{
	public void show_value()
	{
		get_value(500,700);
		System.out.println("Coast: " +coast);
		System.out.println("Earn : " +earn);
		int p=earn-coast;
		System.out.println("Profit : " +p);
	}
}
class use_class
{
	public static void main(String args[])
	{
		My_class2 m=new My_class2();
		m.show_value();
	}
}