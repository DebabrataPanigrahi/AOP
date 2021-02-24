aspect MyAspect
{
	public void My_class.change_value(int x,int y,int z)
	{
		sallary=x;
		experience=y;
		age=z;
	}
	pointcut p1():(call(* My_class.change_value(..)));
	after():p1()
	{
		System.out.println("Change value in a inter type declared method");
	}
}