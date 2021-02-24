class Name
    	{
	int id;
	String name;
	void invite(int a,String b)
	{
		id = a;
		name = b;
		System.out.println("id invited is:"+id);
		System.out.println("name invited is :"+name);
	}
	void serve(int id)
		{
		System.out.println("id is :"+id);
		}
	void seeoff(int id)
		{
		System.out.println("id is :"+id);
		}
	}
class Use
	{
	public static void main(String args[])
		{
		Name nc = new Name();
		nc.invite(10,"Lucky");
		nc.serve(23);
		nc.seeoff(21);
		}
	}