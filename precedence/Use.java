class NameCls
    {
     int x;
     void input_x(int a)
         {
          x = a;
         }
     void output_x()
         {
          System.out.println("x is :"+x);
         }
   }
class Use
   {
    public static void main(String args[])
         {
          NameCls nc = new NameCls();
          nc.input_x(10);
          nc.output_x();
         }
   }