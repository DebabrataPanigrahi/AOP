import java.util.*;
class Toolkit
{
int a,b;
void chk_cnt(int x,int y)
{
a=x;
b=y;
}
void chk_cat()
{
int c=a/b;
System.out.println(c);
}
class Test
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int d=nextInt();
System.out.println("Enter the 2nd number");
int f=nextInt();
Toolkit obj=new Toolkit();
obj.chk_cnt(d,f);
obj.chk_cat();
}
}