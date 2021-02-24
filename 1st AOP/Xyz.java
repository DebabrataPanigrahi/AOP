class Seminar
{
  String name;
  String type;
  int id;
  
  void getData(String nam, String typ,int i)
  {
     name=nam;
     type=typ;
     id=i;
  }
  void showData()
  {
     System.out.println("Name: "+name);

     System.out.println("Type: "+type);
     System.out.println("ID  : "+id);
  }
}

class Xyz
{
  public static void main(String args[])
  {
	Seminar sem=new Seminar();
	sem.getData("Debasish","Listener",123);
	sem.showData();
  }
}