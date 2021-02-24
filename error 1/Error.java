import java.util.*;
class Employee
{
	int id;
	String name;
	void get_id(int id)
	{
		this.id=id;
		
	}
	/*void show()
	{
		System.out.println("ID"+id+" "+"Name:"+name);
	}*/
	void get_name(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println("ID"+id+" "+"Name:"+name);
	}
	
}
class Error
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		int id;
		String name;
		id=sc.nextInt();
		name=sc.next();
		emp.get_id(id);
		emp.get_name(name);
		emp.show();
	}
}