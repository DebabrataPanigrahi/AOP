aspect Aspect
{
pointcut AEHandler(): handler(ArithmeticException);
   before():AEHandler()
   {
      System.out.println("Don't enter zero denominater");
   }
pointcut ArrayHandler(): handler(ArrayIndexOutOfBoundsException);
   before():ArrayHandler()
   {
      System.out.println("ArrayIndexOutOfBoundsException");
   }
pointcut NumberHandler(): handler(NumberFormatException);
   before():NumberHandler()
   {
      System.out.println("NumberFormatException");
   }
}