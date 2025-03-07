class Employee
{
    int rno;
    String name;
    Employee(int r,String n)
    {
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Employee Details");
        System.out.println("...............");
        System.out.println("Empname:"+name);
        System.out.println("Empno:"+rno);
    }
}
public class ConstructDemo1 {
    
        public static void main(String []args){
            Employee ob=new Employee(12,"Anu");
            ob.display();
        }
    }