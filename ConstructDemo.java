class Student
{
    int rno;
    String name;
    Student(int r,String n)
    {
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Student Details");
        System.out.println("...............");
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+rno);
    }
}
public class ConstructDemo {
    
        public static void main(String []args){
            Student ob=new Student(12,"Anu");
            ob.display();
        }
    }
    

