aspect Setaspect
{
pointcut pt1():set(int Myclass1.*);

after():pt1()
{
System.out.println("set value set");
}
}