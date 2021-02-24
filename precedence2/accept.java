aspect accept
{
pointcut pt1():(call(* Name.*(..)));
before():pt1()
{
System.out.println("request accepted");
}
}