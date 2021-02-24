aspect Hand
{
pointcut cat_chk():(execution(*chk_cnt(..)));
pointcut cat_snd():(execution(*chk_cat(..)));
after()throwing(NumberFormatException e):cntchk()
{
System.out.println("msg from aspect : send_cat"+e);
after()returning(int i):cat_snd()
{
System.out.println("success");
}
after()throwing(NumberFormatException e):cat_snd()
{
System.out.println("msg from the aspect : categ"+e);
}
}