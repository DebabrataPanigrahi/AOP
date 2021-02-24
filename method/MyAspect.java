aspect MyAspect
{
     pointcut pt1(): call(void My_class.change_value(..));
            before():pt1()
            {
              System.out.println("changes values are");
            }
	public void My_class.change_value(int x,int y,int z)
	{
		sallary=x;
		experience=y;
		age=z;
	}
}