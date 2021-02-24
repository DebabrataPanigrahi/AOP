class My_class
{
	int sallary;
	int experience;
	int age;
	public void get_value(int a,int b,int c)
	{
		sallary=a;
		experience=b;
		age=c;
	}
	public void show_value()
	{
		System.out.println("Sallary : " +sallary);
		System.out.println("Experience : " +experience);
		System.out.println("Age : " +age);
	}
}
class use_class
{
	public static void main(String args[])
	{
		My_class m=new My_class();
		m.get_value(50000,2,24);
		m.show_value();
		m.change_value(30000,1,19);
		m.show_value();
	}
}