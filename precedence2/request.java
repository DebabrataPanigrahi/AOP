aspect request
{
pointcut pt1():(call(* Name.*(..)));
before():pt1()
{
System.out.println("request for something");
}
}