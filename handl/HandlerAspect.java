aspect HandlerAspect
{
	pointcut arith():handler(ArithmeticException);
	pointcut num():handler(NumberFormatException);
	pointcut arr():handler(ArrayIndexOutOfBoundsException);
	
	before():arith()
	{
		System.out.println("ArithmeticException handled");
	}
	before():num()
	{
		System.out.println("NumberFormatException handled");
	}
	before():arr()
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
}