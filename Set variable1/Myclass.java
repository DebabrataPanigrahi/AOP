class Myclass1
{
int age;
int no;
String name;
public void setValue(int a,int b,String c){
age=a;
no=b;
name=c;
}
}
public class Myclass
{
public static void main(String args[])
{
Myclass1 mc=new Myclass1();
mc.setValue(21,24,"Lucky");
}
}
