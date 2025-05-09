import java.util.Scanner;
public class Faculty 
{
int age;
String name;
void getInput()
{
    Scanner scan=new Scanner (System.in);
    System.out.println("Enter faculty Name");
    name=scan.nextLine();
    System.out.println("Enter faculty age");
    age=scan.nextInt();
}    
void display()
{
    System.out.println("Faculty name:"+name);
    System.out.println("Faculty age:"+age);
}
public static void main(String args[])
{
Faculty e=new Faculty();
e.getInput();
System.out.println("\n\n faculty details\n");  
System.out.println("\n\n______________\n");
e.display();  
}
}
