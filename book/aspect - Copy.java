aspect Lucky
{
	pointcut p1():call(void Book1.input(..));
	//advice
	before():p1()
	{
		System.out.println("Before P1");
	}
}