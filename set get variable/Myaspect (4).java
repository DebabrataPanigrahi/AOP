aspect Myaspect
{
	pointcut pt1():(set(int book.page));
	before():pt1()
	{
		System.out.println("Page to be initialize");
	}
	after():pt1()
	{
		System.out.println("page initialized");
	}
	pointcut pt2():(set(int book.price));
	before():pt2()
	{
		System.out.println("price to be initialize");
	}
	after():pt2()
	{
		System.out.println("price initialized");
	}
	pointcut pt3():(set(String book.author));
	before():pt3()
	{
		System.out.println("author to be initialize");
	}
	after():pt3()
	{
		System.out.println("author initialized");
	}
	pointcut pt4():(get(int book.page));
	before():pt4()
	{
		System.out.println("Page to be get");
	}
	after():pt4()
	{
		System.out.println("page got");
	}
	pointcut pt5():(get(int book.price));
	before():pt5()
	{
		System.out.println("price to be get");
	}
	after():pt5()
	{
		System.out.println("price got");
	}
	pointcut pt6():(get(String book.author));
	before():pt6()
	{
		System.out.println("author to be get");
	}
	after():pt6()
	{
		System.out.println("author got");
	}
}