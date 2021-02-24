import java.util.*;
class MyClass
  {
  int a,b;
   int arr[]=new int[5]; 
  void setdata(int d,int e)
     {
      a=d;
      b=e;
     }
  void getdata()
     {
        try
           {
           System.out.println("the values are"+(a/b));
            
           }
        catch(ArithmaticException e)
           {
           System.out.println(e);
           }
          try
           {
              int arr[]=new int[5];    
                
              System.out.println(arr[10]); 
           }
        catch(ArrayIndexOutOfBoundsException e)
           {
             System.out.println(e);
           }
        catch(NumberFormatExcetion e)
           {
           }
      }
  }
class Test
  {
     public static void main(String arg[])
           {
            Scanner sc = new Scanner(System.in);
            System.out.println("the value of a is"+a);
             f=sc.nextInt();
            System.out.println("the value of b is"+b);
             g=sc.nextInt();
            MyClass obj=new MyClass();
            obj.getdata(f,g);
            }
 }
  