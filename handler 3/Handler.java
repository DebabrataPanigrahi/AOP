
class Handler
{
	public static void main(String args[])
	{
		int a,b,c;
		//String num1,num2;
		try
		{
			
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		}
		catch(NumberFormatException e)
		{
		}
		catch(ArithmeticException e)
		{
		}
	}
}