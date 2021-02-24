class Booking
{
	String name;
	int id;
	string destination;
	int days;
	int people_count;
	Booking(String nam,int idd,String dest,int dys,int cnt)
	{
	name=nam;
	id=idd;
	destination=dest;
	days=dys;
	people_count=cnt;
		
	}

	public void show_value()
	{
		System.out.println("the name is :"+name);
		System.out.println("the id is :"+id);
		System.out.println("the destination is :"+destination);
		System.out.println("the days is :"+days);
		System.out.println("the people are :"+people_count);
	}
}
class Book1
{
	public static void main(String args[])
	{
		Booking m=new Booking();
		m.Booking("Lucky",543,"4days",5,7);
		m.show_value();
		m.change_value("deba",456,"3days",6,5);
		m.show_value();
	}
}