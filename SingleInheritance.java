class InheritanceDemo 
{
    int rollno=10;
    String name="anitha";
}
class childInheritance extends InheritanceDemo
{
    int marks=80;
    void display()
{
System.out.println("Rollno:"+rollno);
System.out.println("Name:"+name);
System.out.println("Marks:"+marks);
}
}
class SingleInheritance
{
    public static void main(String[] args)
    {
    childInheritance ob=new childInheritance();
    ob.display();    
    }
}