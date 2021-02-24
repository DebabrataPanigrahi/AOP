aspect aspect2
{
pointcut pt2():(call(* NameCls.*(..)));
before():pt2()
{
System.out.println("From aspect 2");
}
}