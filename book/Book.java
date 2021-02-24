class Book1{
	int pages;
	int price;
	String author;
	void input(int a,int b,String c)
	{
		pages=a;
		price=b;
		author=c;
		System.out.println("input is done:");
	}
	void output()
	{
		System.out.println("pages:"+pages);
		System.out.println("price:"+price);
		System.out.println("Author:"+author);
	}
}
public class Book{
 public static void main(String[] args)
 {
   Book1 b=new Book1();
   b.input(100,200,"ABC");
   b.output();
 }
}