class book
{
	int page;
	int price;
	String author;
	void input(int a,int b,String c)
	{
		page=a;
		price=b;
		author=c;
	}
	void output()
	{
		System.out.println("pages : " +page);
		System.out.println("Price : " +price);
		System.out.println("Author : " +author);
	}
}
class Mycls
{
	public static void main(String s[])
	{
		book b = new book();
		b.input(100,300,"ABC");
		b.output();
	}
}