aspect aspect1
{
pointcut pt1():(call(* NameCls.*(..)));
before():pt1()
{
System.out.println("From Aspect 1");
}
}