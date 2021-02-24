aspect MyAspect1
{
	public void Booking.change_value(String nm,int ide,String desttn,int das,int ct)
	{
	name=nm;
	id=ide;
	destination=desttn;
	days=das;
	people_count=ct;
	}
	pointcut p1():(call(* Booking.change_value(..)));
	after():p1()
	{
		System.out.println("Change value in a inter type declared method");
	}
}