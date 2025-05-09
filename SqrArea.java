public class SqrArea 
{
   int s;
   void getInput(int side)
   {
    s=side;
   }
   int callArea()
   {
    return s*s;
   }
   public static void main(String args[])
   {
    SqrArea r=new SqrArea();
    r.getInput(11);
    System.out.println("Area of square="+r.callArea());
   }
}
