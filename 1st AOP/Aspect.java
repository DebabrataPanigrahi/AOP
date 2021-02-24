aspect Aspect
{
  //pointcut
  pointcut p0():call(void Seminar.getData(String,String,int));
  pointcut p1():call(void Seminar.showData());
  //advice
  before():p0()
  {
     System.out.println("Mo Banda naunu");
  }
  after():p1()
  {
     System.out.println("Pela Dekhunu");
  }
}